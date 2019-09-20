package com.jsfbootstrap.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Estudiante {
	private String nombreEstudiante;
	private String apellidoEstudiante;
	private int edadEstudiante;
	
	public Estudiante()
	{		
	}
	
	public String getNombreEstudiante()
	{
		return nombreEstudiante;
	}
	
	public void setNombreEstudiante(String nombreEstudiante)
	{
		this.nombreEstudiante = nombreEstudiante;
	}
	
	public String getApellidoEstudiante()
	{
		return apellidoEstudiante;
	}
	
	public void setApellidoEstudiante(String apellidoEstudiante)
	{
		this.apellidoEstudiante = apellidoEstudiante;
	}
	
	public int getEdadEstudiante()
	{
		return edadEstudiante;
	}
	
	public void setEdadEstudiante(int edadEstudiante)
	{
		this.edadEstudiante = edadEstudiante;
	}
}
