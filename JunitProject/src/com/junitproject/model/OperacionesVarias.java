package com.junitproject.model;

public class OperacionesVarias {
	private int numero1;
	private int numero2;
	public int sumaNumeros()
	{
		return numero1+numero2;
	}
	public double sumaNumeros(double num1, double num2)
	{
		return num1+num2;
	}
	public void setNumero1(int numero1)
	{
		this.numero1=numero1;
	}
	public int getNumero1()
	{
		return numero1;
	}
	public void setNumero2(int numero2)
	{
		this.numero2=numero2;
	}
	public int getNumero2()
	{
		return numero2;
	}
}
