package com.springpractica3.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springpractica3.model.Domicilio;
import com.springpractica3.model.Empleado;

public class SpringPractica3App {

	public static void main(String[] args) {
		//Creamos dos objetos desacoplados y le pasamos un objeto al constructor de uno de ellos
		//La manera Spring | IOC
		//Dependency Injection | 	DI
		Domicilio dom1 = new Domicilio();
		
		/*Forma tradicional dejando el trabajo para el programador de construir los beans
		 * Forma desacoplada (correcta)
		 * dom1.setCalle("Olimpo");
		dom1.setCodigoPostal(24578);
		dom1.setNumero(666);*/
		Empleado emp1 = new Empleado(dom1);
		
		//Creamos dos objetos desacoplados y le pasamos un objeto al setter del otro.
		Domicilio dom2 = new Domicilio();
		Empleado emp2 = new Empleado();
		emp2.setEmpleadoDomicilio(dom2);
		
		//Le decimos a Spring que cree los beans
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Empleado emp3 = context.getBean("empBean1", Empleado.class);
		System.out.println("Empleado:"+emp3);
		//(Persona)context.getBean("persona1");
		Empleado emp4 = context.getBean("empleadoBean2",Empleado.class);
		System.out.println("Empleado:"+emp4);
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext) context;
		cxt.close();
	}
}



