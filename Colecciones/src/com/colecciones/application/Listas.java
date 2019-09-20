package com.colecciones.application;

import java.util.*;

public class Listas {

	public static void main(String[] args) {
		//Ejemplo 1
		ArrayList<String> miListita = new ArrayList<String>();
		miListita.add("Elemento 1");
		miListita.add("Elemento 2");
		miListita.add("Elemento 3");
		miListita.add("Elemento 4");
		miListita.add("Elemento 5");
		miListita.add("Elemento 6");
		
		
		Iterator pizza = miListita.iterator();
		
		while(pizza.hasNext())
		{
			System.out.println("Elemento de la lista:"+pizza.next());
		}
		
		System.out.println(miListita.get(5));
		
		//Ejemplo 2
		ArrayList<String> miListita2 = new ArrayList<String>();
		
		miListita2.add("Elemento 1");
		miListita2.add("Elemento 2");
		miListita2.add("Elemento 3");
		miListita2.add("Elemento 4");
		miListita2.add("Elemento 5");
		miListita2.add("Elemento 6");
		
		for(String iterador:miListita2)
		{
			System.out.println("Elemento de la lista:"+iterador);
		}

	}

}










