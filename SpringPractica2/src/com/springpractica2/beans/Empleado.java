package com.springpractica2.beans;

//Bean o Model o POJO (Plain Old Java Object)
public class Empleado {
	//Atributos
	private int empleadoId;
	private String empleadoNombre;
	private String empleadoDireccion;
	//Constructores
	public Empleado() {
		System.out.println("--- Objeto Empleado Instanciado ---");
	}
	public Empleado(int empleadoId, String empleadoNombre, String empleadoDireccion) {
		this.empleadoId = empleadoId;
		this.empleadoNombre = empleadoNombre;
		this.empleadoDireccion = empleadoDireccion;
	}
	//Getters y setters
	public int getEmpleadoId() {
		return empleadoId;
	}
	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}
	public String getEmpleadoNombre() {
		return empleadoNombre;
	}
	public void setEmpleadoNombre(String empleadoNombre) {
		this.empleadoNombre = empleadoNombre;
	}
	public String getEmpleadoDireccion() {
		return empleadoDireccion;
	}
	public void setEmpleadoDireccion(String empleadoDireccion) {
		this.empleadoDireccion = empleadoDireccion;
	}
	@Override
	public String toString() {
		return "Empleado [empleadoId=" + empleadoId + ", empleadoNombre=" + empleadoNombre + ", empleadoDireccion="
				+ empleadoDireccion + "]";
	}
	
	public void myInicio()
	{
		System.out.println("--- Objeto Empleado Inicializado ---");
	}
	
	public void myFin()
	{
		System.out.println("--- Objeto Empleado Destruido ---");
	}
}
