package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppPrimos {

	public static void main(String[] args) {
		int iNum=0;
		boolean isPrimo=true;
		char cRes=' ';
		
		Scanner entrada = new Scanner(System.in);
		
		do
		{
			isPrimo=true;
			System.out.println("Dame un n�mero:");
			iNum=entrada.nextInt();
			
			for(int cont=2;cont<iNum;cont++)
			{
				if(iNum%cont==0)
				{
					isPrimo=false;
				}
			}
			System.out.println("El n�mero introducido es primo? "+isPrimo);
			
			System.out.println("Deseas Calcular otro N�mero(S/N)?");
			cRes=entrada.next().charAt(0);
		}while(cRes=='S' || cRes=='s');
	}

}
