package com.sumanumeros.model;

public class OperacionesAritmeticas {
	private int iNumero1;
	private int iNumero2;
	
	public int sumaNumeros()
	{
		return iNumero1+iNumero2;
	}
	public void setInumero1(int numero1)
	{
		iNumero1=numero1;
	}
	public int getInumero1()
	{
		return iNumero1;
	}
	public void setInumero2(int numero2)
	{
		iNumero2=numero2;
	}
	public int getInumero2()
	{
		return iNumero2;
	}
}
