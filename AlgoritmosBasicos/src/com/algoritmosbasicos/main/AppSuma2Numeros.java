package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppSuma2Numeros 
{

	public static void main(String[] args) 
	{
		int iNum1=0;
		int iNum2=0;
		int iResultado=0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dame un numero:");
		iNum1=entrada.nextInt();
		
		System.out.println("Dame otro número:");
		iNum2=entrada.nextInt();
		
		iResultado=iNum1+iNum2;
		System.out.println("El resultado es:"+iResultado);

	}

}
