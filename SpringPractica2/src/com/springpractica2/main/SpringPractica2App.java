package com.springpractica2.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.springpractica2.beans.Empleado;

public class SpringPractica2App
{

	public static void main(String[] args)
	{
		//Construcción de los objetos | Realizado por el Programador
		Empleado objEmpleado = new Empleado();
		objEmpleado.setEmpleadoId(101);
		objEmpleado.setEmpleadoNombre("Macho");
		objEmpleado.setEmpleadoDireccion("El Olimpo");
		System.out.println("Empleado:"+objEmpleado);
		
		/* Con el XmlBeanFactory Deprecated
		//La manera Spring | Inversion Of Control (IOC)

		 //Lee el archivo empleadoBeans.xml
		Resource resource = new ClassPathResource("empleadoBeans.xml");
		//Spring container que parseará el archivo XML para construir los objetos
		BeanFactory factory = new XmlBeanFactory(resource);
		Empleado emp1 = (Empleado) factory.getBean("empleado1");
		Empleado emp2 = factory.getBean("empleado2", Empleado.class);
		Empleado emp3 = factory.getBean("empleado3", Empleado.class);
		System.out.println("Empleado 1:"+emp1);
		System.out.println("Empleado 2:"+emp2);
		System.out.println("Empleado 3:"+emp3);*/
		
		//Lee el archivo empleadoBeans.xml
		//ApplicationContext context = new ClassPathXmlApplicationContext("empleadoBeansResources.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("empleadoBeansResources.xml");
		
		Empleado emp1 = (Empleado) context.getBean("persona1");
		Empleado emp2 = context.getBean("empleado2", Empleado.class);
		Empleado emp3 = context.getBean("empleado3", Empleado.class);
		System.out.println("Empleado 1:" + emp1);
		System.out.println("Empleado 2:" + emp2);
		System.out.println("Empleado 3:" + emp3);
		
		context.close();
		//ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext) context;
		//cxt.close();
	}

}
