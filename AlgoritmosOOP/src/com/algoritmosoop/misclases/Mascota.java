package com.algoritmosoop.misclases;

import java.util.*;

public class Mascota {
	private String id;
	protected String nombre;
	protected String especie;
	private Date fechaIngreso;
	private Date fechaSalida;
	private String estado;
	
	public Mascota()
	{
		
	}
	
	public Mascota(String id, String nombre, String especie, String estado)
	{
		this.id=id;
		this.nombre=nombre;
		this.especie=especie;
		this.estado=estado;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id=id;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	
	public String getEspecie()
	{
		return especie;
	}
	
	public void setEspecie(String especie)
	{
		this.especie=especie;
	}
	
	public Date getFechaIngreso()
	{
		return fechaIngreso;
	}
	
	public void setFechaIngreso(Date fechaIngreso)
	{
		this.fechaIngreso=fechaIngreso;
	}
	
	public Date getFechaSalida()
	{
		return fechaSalida;
	}
	
	public void setFechaSalida(Date fechaSalida)
	{
		this.fechaSalida= fechaSalida;
	}
	
	public String getEstado()
	{
		return estado;
	}
	
	public void setEstado(String estado)
	{
		this.estado=estado;
	}
}



