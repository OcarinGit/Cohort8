package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppMesesAnio {

	public static void main(String[] args) {
		int iMes = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Dame el número de mes:");
		iMes = entrada.nextInt();

		switch (iMes) {
		case 1:
			System.out.println("Mes Enero");
			break;
		case 2:
			System.out.println("Mes Febrero");
			break;
		case 3:
			System.out.println("Mes Marzo");
			break;
		case 4:
			System.out.println("Mes Abril");
			break;
		case 5:
			System.out.println("Mes Mayo");
			break;
		case 6:
			System.out.println("Mes Junio");
			break;
		case 7:
			System.out.println("Mes Julio");
			break;
		case 8:
			System.out.println("Mes Agosto");
			break;
		case 9:
			System.out.println("Mes Septiembre");
			break;
		case 10:
			System.out.println("Mes Octubre");
			break;
		case 11:
			System.out.println("Mes Noviembre");
			break;
		case 12:
			System.out.println("Mes Diciembre");
			break;
		default:
			System.out.println("Número introducido no es un Mes válido");
			break;
		}

	}

}
