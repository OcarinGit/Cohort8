package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppMostrarNombres {

	public static void main(String[] args) 
	{
		String sNombre="";
		int cont2=0;
		Scanner entrada = new Scanner(System.in);
		
		//  ------------   Ciclo For
		System.out.println("Dame tu nombre:");
		sNombre = entrada.nextLine();
		for(int cont=0;cont<10;cont++)
		{
			System.out.println("Hola "+sNombre);
		}
		
		//  ------------- Ciclo While
		System.out.println("Dame tu nombre");
		sNombre=entrada.nextLine();
		while(cont2<10)
		{
			System.out.println("Hola "+sNombre);
			cont2++;
		}
		
		// -------------- Ciclo Do While
		cont2=0;
		System.out.print("Dame tu nombre:");
		sNombre=entrada.nextLine();
		do
		{
			System.out.println("Hola "+sNombre);
			cont2++;
		}while(cont2<10);
	}

}




