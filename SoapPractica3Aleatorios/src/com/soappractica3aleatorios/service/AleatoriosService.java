package com.soappractica3aleatorios.service;

import java.util.Random;

public class AleatoriosService {
	
	public String aleatorios(int cantidad)
	{
		Random rnd = new Random(System.nanoTime());
		String aleatoriosGenerados="";
		
		for(int i=0;i<cantidad;i++)
		{
			aleatoriosGenerados+=rnd.nextInt(100)+1+" ";
		}
		return aleatoriosGenerados;
	}
}




