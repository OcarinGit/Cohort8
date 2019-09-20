package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppEdad {

	public static void main(String[] args) {
		int iEdad=0;
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Dame tu edad:");
		iEdad = entrada.nextInt();
		
		
		if(iEdad<5)
		{
			System.out.println("Eres un niño");
		}
		else if (iEdad>=5 && iEdad<18)
		{
			System.out.println("Eres un adolescente");
		}
		else if(iEdad>=18 && iEdad<36)
		{
			System.out.println("Eres un chavorruco");
		}
		else if(iEdad==36)
		{
			System.out.println("Inmortal");
		}
		else if(iEdad>36)
		{
			System.out.println("Eres un viejito");
		}
		
		//Mas fácil
		if(iEdad<5)
		{
			System.out.println("Eres un niño");
		}
		
		if (iEdad>=5 && iEdad<18)
		{
			System.out.println("Eres un adolescente");
		}
		
		if(iEdad>=18 && iEdad<36)
		{
			System.out.println("Eres un chavorruco");
		}
		
		if(iEdad==36)
		{
			System.out.println("Inmortal");
		}
		
		if(iEdad>36)
		{
			System.out.println("Eres un viejito");
		}
		
		
		//If anidado
		if(iEdad<5)
		{
			System.out.println("Eres un niño");
		}
		else
		{
			if (iEdad>=5 && iEdad<18)
			{
				System.out.println("Eres un adolescente");
			}
			else
			{
				if(iEdad>=18 && iEdad<36)
				{
					System.out.println("Eres un chavorruco");
				}
				else
				{
					if(iEdad==36)
					{
						System.out.println("Inmortal");
					}
					else
					{
						if(iEdad>36)
						{
							System.out.println("Eres un viejito");
						}
					}
				}
			}
		}
		
		
		
		
		
		
		
	}

}
