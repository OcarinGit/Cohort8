package com.springpractica1.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springpractica1.model.Persona;

@Controller
//Forma 1
//@RequestMapping("holitu")
public class MiControlador {
	//Forma 3
	@GetMapping("/holitu2")
	
	//Forma 1
	//@RequestMapping(method = RequestMethod.GET)
	
	//Forma 2
	//@RequestMapping(value="holitu3", method = RequestMethod.GET)
	public String holaVista(Model modelo)
	{
		Persona objPersona1 = new Persona();
		objPersona1.setTitulo("Dr.");
		objPersona1.setNombre("Macho");
		objPersona1.setApellido("Huge");
		modelo.addAttribute("persona", objPersona1);
		return "holo";
	}
}

