package com.vectores.misclases;

import java.util.Random;

public class Vectores {
	//Ejercicio 1. Rellenar un vector con 1s
	public int[] llenaUnos(int[] vector)
	{
		for(int i=0;i<vector.length;i++)
		{
			vector[i]=1;
		}
		return vector;
	}
	//Ejercicio 2. Rellenar un vector con una serie ascendente del 1 al 100
	public int[] serie1a100(int[] vector)
	{
		for(int i=0;i<vector.length;i++)
		{
			vector[i] = (i+1);
		}
		
		return vector;
	}
	
	//Ejerccicio 3. Rellenar un vector 2 4 6 ... con 100 elementos
	public int[] serie2en2(int[] vector)
	{
		for(int i=0;i<vector.length;i++)
		{
			vector[i] = (i+1)*2;
		}
		return vector;
	}
	
	//Ejercicio 4. Rellenar un vector 100 al 1
	public int[] serie100a1(int[] vector)
	{
		for(int i=0;i<vector.length;i++)
		{
			vector[i]=vector.length-i;
		}
		return vector;
	}
	
	//Ejercicio 5. Rellenar un vector con números aleatorios
	public int[] serieAleatoria(int[] vector)
	{
		Random rnd = new Random(System.nanoTime());
		//int BOUND=100;
		
		for(int i=0;i<vector.length;i++)
		{
			vector[i]=rnd.nextInt(99)+1;
			//vector[i]=(int) (Math.random()*BOUND)+1;
		}
		return  vector;
	}
	
	//Algoritmo 6. Contar la cantidad de números pares e impares de un vector de 100 elementos aleatorios.
	public int[] paresImpares(int[] vector)
	{
		int[] paresImpares = new int[2];
		for(int i=0;i<vector.length;i++)
		{
			if(vector[i]%2==0)
			{
				paresImpares[0]+=1;
			}
			else
			{
				paresImpares[1]+=1;
			}
		}
		return paresImpares;
	}
	
	//Algoritmo 7. Contar la cantidad de números pares de un vector aleatorio
	public int contarPares(int[] vector)
	{
		int contPares=0;
		for(int i=0;i<vector.length;i++)
		{
			if(vector[i]%2==0)
				contPares++;
		}
		return contPares;
	}
	//Algoritmo 8. Contar la cantidad de números impares de un vector aleatorio
	public int contarImpares(int[] vector)
	{
		int contImpares=0;
		for(int i=0;i<vector.length;i++)
		{
			if(vector[i]%2!=0)
				contImpares++;
		}
		return contImpares;
	}
	
	//Algoritmo 9. De un vector con elementos aleatorios, generar un vector que contenga solo los números pares del primer vector.
	public int[] obtenerPares(int[] vector, int nPares)
	{
		int[] vectorPares=new int[nPares];
		int contPares=0;
		for(int i=0;i<vector.length;i++)
		{
			if(vector[i]%2==0)
			{
				vectorPares[contPares]=vector[i];
				contPares++;
			}
		}
		return vectorPares;
	}
}





