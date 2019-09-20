package com.springpractica3.model;

public class Empleado {
	private int empleadoId;
	private String empleadoNombre;
	private Domicilio empleadoDomicilio;
	
	public Empleado()
	{
	}
	public Empleado(Domicilio empleadoDomicilio)
	{
		this.empleadoDomicilio = empleadoDomicilio;
	}
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
	public Domicilio getEmpleadoDomicilio()
	{
		return empleadoDomicilio;
	}
	public void setEmpleadoDomicilio(Domicilio empleadoDomicilio)
	{
		this.empleadoDomicilio=empleadoDomicilio;
	}
	@Override
	public String toString() {
		return "Empleado [empleadoId=" + empleadoId + ", empleadoNombre=" + empleadoNombre + ", empleadoDomicilio="
				+ empleadoDomicilio + "]";
	}
	
}
