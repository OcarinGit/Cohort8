package com.ajaxoperaciones.model;

public class SumaNumeros {
	private int numero1;
	private int numero2;
	
	public SumaNumeros()
	{
		setNumero1(0);
		setNumero2(0);
	}
	
	public int sumarNumeros()
	{
		return numero1+numero2;
	}
	
	public int getNumero1()
	{
		return numero1;
	}
	
	public void setNumero1(int numero1)
	{
		this.numero1 = numero1;
	}
	
	public int getNumero2()
	{
		return numero2;
	}
	
	public void setNumero2(int numero2)
	{
		this.numero2 = numero2;
	}
}
