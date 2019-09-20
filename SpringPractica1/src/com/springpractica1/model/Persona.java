package com.springpractica1.model;

public class Persona {
	private String titulo;
	private String nombre;
	private String apellido;
	
	
	public Persona() {
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	@Override
	public String toString() {
		return "Persona [titulo=" + titulo + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
}
