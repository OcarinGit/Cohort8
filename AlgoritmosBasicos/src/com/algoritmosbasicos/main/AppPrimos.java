package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppPrimos {

	public static void main(String[] args) {

		// declaracion de variables
		
		int numeroEvaluar = 0;
		boolean isPrimo = true;
		char respuestaSalida = ' ';
		
		// creacion objetos

		Scanner entrada = new Scanner(System.in);
		
		do
		{
			// entrada de valores

			System.out.println("Dame un n�mero:");
			numeroEvaluar = entrada.nextInt();
			
			// proceso

			for(int contador =2; contador < numeroEvaluar; contador++)
			{
				if( numeroEvaluar % contador == 0 )
				{
					isPrimo=false;
				}
			}

			// salida de valores

			System.out.println("El n�mero introducido es primo? "+isPrimo);
			
			System.out.println("Deseas Calcular otro N�mero(S/N)?");
			respuestaSalida = entrada.next().charAt(0);

		} while(respuestaSalida == 'S' || respuestaSalida == 's');
	}

}
