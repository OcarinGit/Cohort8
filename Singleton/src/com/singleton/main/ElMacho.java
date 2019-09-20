package com.singleton.main;

public class ElMacho {
	private String nombre;
	//Paso 2 - Definir un objeto del mismo tipo de la clase y especificarlo como privado y estático
	private static ElMacho objElMacho;
	
	//Pasos para crear el patrón de diseño singleton
	//Paso 1 - Crear el método constructor como privado
	private ElMacho(String nombre)
	{
		setNombre(nombre);
	}
	@Override
	public ElMacho clone()
	{
		try
		{
			throw new CloneNotSupportedException();
		}
		catch(CloneNotSupportedException ex)
		{
			System.out.println("La clonación del objeto no es soportada");
		}
		return null;
	}
	
	//Paso 3 - Crear el método que creará la única instancia de la clase. Este método regresa la única instancia que será creada.
	public  static ElMacho getSingletonInstance(String nombre)
	{
		if(objElMacho==null)
		{
			objElMacho = new ElMacho(nombre);
			System.out.println("El objeto "+nombre+" ha sido creado!!");
		}
		else
		{
			System.out.println("La clase ElMacho ya ha sido instanciada, el objeto"+nombre+" NO puede ser creado");
		}
		return objElMacho;
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
