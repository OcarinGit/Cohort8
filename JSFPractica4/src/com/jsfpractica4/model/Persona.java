package com.jsfpractica4.model;

public class Persona {
	private String nombrePersona;
	private String apellidoPersona;
	
	public Persona()
	{
	}
	
	public void setNombrePersona(String nombrePersona)
	{
		this.nombrePersona=nombrePersona;
	}
	
	public String getNombrePersona()
	{
		return nombrePersona;
	}
	
	public void setApellidoPersona(String apellidoPersona)
	{
		this.apellidoPersona=apellidoPersona;
	}
	
	public String getApellidoPersona()
	{
		return apellidoPersona;
	}
}
