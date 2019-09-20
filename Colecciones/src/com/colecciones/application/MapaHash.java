package com.colecciones.application;

import java.util.*;

public class MapaHash {

	public static void main(String[] args) {
		HashMap<Integer, String> miMapitaHash = new HashMap<Integer, String>();
		
		miMapitaHash.put(100, "Elemento 1");
		miMapitaHash.put(101, "Elemento 2");
		miMapitaHash.put(102, "Elemento 3");
		miMapitaHash.put(103, "Elemento 4");
		miMapitaHash.put(104, "Elemento 5");
		
		for(Map.Entry<Integer, String> iterador:miMapitaHash.entrySet())
		{
			System.out.println("Elemento con clave:"+iterador.getKey()+" con valor:"+iterador.getValue());
		}
	}

}
