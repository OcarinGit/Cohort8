package com.operacionesaritmeticas.model;

import java.util.Random;

public class OperacionesAritmeticas {
	//Atributos
	private int numero1;
	private int numero2;
	
	//Métodos
	//Método para extraer la raiz cuadrada
	public double raizCuadrada()
	{
		return Math.sqrt(numero1);
	}
	//Método para extraer la potencia de un número
	public int potencia()
	{
		return (int) Math.pow(numero1, numero2);
	}
	//Método para calcular el factorial de un número
	public static int factorial(int numero)
	{
		int resultado=1;
		
		for(int i=numero;i>0;i--)
		{
			resultado=resultado*i;
		}
		
		return resultado;
	}
	//Método para extraer números aleatorios
	public static int[] generacionPseudoaleatorios(int nElementos)
	{
		int[] pseudoaleatorios = new int[nElementos];
		Random rand = new Random(System.nanoTime());
		for(int i=0;i<nElementos;i++)
		{
			pseudoaleatorios[i] = rand.nextInt(99)+1;
		}
		return pseudoaleatorios;
	}
	//Getters y Setters
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
