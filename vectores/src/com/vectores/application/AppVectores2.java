package com.vectores.application;

import com.vectores.misclases.*;

public class AppVectores2 
{

	public static void main(String[] args) 
	{
		//Constantes
		final int NUM_ELEMENTOS=20;
		final int PARES_IMPARES=2;
		
		//Vectores
		int[] vectorEnteros = new int[NUM_ELEMENTOS];
		Vectores vectors =new Vectores();
		int[] paresImpares = new int[PARES_IMPARES];
		int[] vectorPares;
		
		//Variables
		int nPares=0;
		int nImpares=0;
		
		//Ejercicio 1
		vectorEnteros=vectors.llenaUnos(vectorEnteros);
		System.out.println("Prueba del ejercicio 1");
		AppVectores2.imprimirVector(vectorEnteros);
		
		//Ejercicio 2
		vectorEnteros=vectors.serie1a100(vectorEnteros);
		System.out.println("Prueba del ejercicio 2");
		AppVectores2.imprimirVector(vectorEnteros);
		
		//Ejercicio 3
		vectorEnteros = vectors.serie2en2(vectorEnteros);
		System.out.println("Prueba del ejercicio 3");
		AppVectores2.imprimirVector(vectorEnteros);
		
		//Ejercicio 4
		vectorEnteros = vectors.serie100a1(vectorEnteros);
		System.out.println("Prueba del ejercicio 4");
		AppVectores2.imprimirVector(vectorEnteros);
		
		//Ejercicio 5
		vectorEnteros = vectors.serieAleatoria(vectorEnteros);
		System.out.println("Prueba del ejercicio 5");
		AppVectores2.imprimirVector(vectorEnteros);
		
		//Ejercicio 6. Contar la cantidad de números pares e impares de un vector de 100 elementos aleatorios.
		paresImpares = vectors.paresImpares(vectorEnteros);
		System.out.println("Prueba del ejercicio 6");
		AppVectores2.imprimirVector(paresImpares);
		
		//Ejercicio 7. Contar la cantidad de números pares de un vector de 100 elementos aleatorios
		System.out.println("Prueba del ejercicio 7");
		System.out.println("La cantidad de pares es:"+vectors.contarPares(vectorEnteros));
		
		//Ejercicio 8. Contar la cantidad de números impares de un vector de 100 elementos aleatorios
		System.out.println("Prueba del ejercicio 7");
		System.out.println("La cantidad de impares es:" + vectors.contarImpares(vectorEnteros));
		
		//Ejercicio 9. De un vector con elementos aleatorios, generar un vector que contenga solo los números pares del primer vector.
		nPares = vectors.contarPares(vectorEnteros);
		vectorPares = new int[nPares];
		vectorPares=vectors.obtenerPares(vectorEnteros, nPares);
		System.out.println("Prueba del ejercicio 9");
		AppVectores2.imprimirVector(vectorPares);
	}
	
	//Método que sirve para imprimirVector
	private static void imprimirVector(int[] vectorParam)
	{
		for (int i=0;i<vectorParam.length;i++)
		{
			System.out.println("Vector["+i+"]:"+vectorParam[i]);
		}
	}
}




