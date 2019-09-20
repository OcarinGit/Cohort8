package com.strutspractica2.model.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
@Action(value="persona", results= {@Result(name="success", location="/bienvenida.jsp") })
public class PersonaAction extends ActionSupport {
	private String nombre;
	
	@Override
	public String execute()
	{
		nombre=getNombre();
		return "success";
	}
	
	public PersonaAction()
	{
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
}
