package com.ajaxgson.practica1.model;

public class Cliente {
	private int idCliente;
	private String nombre;
	private String domicilio;
	
	public Cliente(int idCliente, String nombre, String domicilio) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
	
	public Cliente()
	{
		setIdCliente(0);
		setNombre("");
		setDomicilio("");
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	
}
