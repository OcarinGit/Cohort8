package com.jsfpractica4.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="mensajitu")
@RequestScoped
public class Mensajes {
	
	@ManagedProperty(value = "")
	private String mensaje;
	
	public Mensajes()
	{
		
	}
	public String getMensaje()
	{
		return mensaje;
	}
	public void setMensaje(String mensaje)
	{
		this.mensaje = mensaje;
	}
}
