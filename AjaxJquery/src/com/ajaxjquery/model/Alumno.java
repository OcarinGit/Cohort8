package com.ajaxjquery.model;

public class Alumno {
	private String nombreAlumno;
	
	public Alumno(String nombreAlumno)
	{
		setNombreAlumno(nombreAlumno);
	}
	public Alumno()
	{
		
	}
	public String getNombreAlumno()
	{
		return nombreAlumno;
	}
	
	public void setNombreAlumno(String nombreAlumno)
	{
		this.nombreAlumno=nombreAlumno;
	}
}
