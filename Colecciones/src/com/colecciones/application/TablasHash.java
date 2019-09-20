package com.colecciones.application;

import java.util.*;
import java.util.Map.*;

public class TablasHash {

	public static void main(String[] args) {
		Hashtable<Integer, String> miTablitaHash = new Hashtable<Integer,String>();
		miTablitaHash.put(100, "Elemento 1");
		miTablitaHash.put(101, "Elemento 2");
		miTablitaHash.put(102, "Elemento 3");
		miTablitaHash.put(103, "Elemento 4");
		
		for(Map.Entry<Integer, String> iterador:miTablitaHash.entrySet())
		{
			System.out.println("Clave :"+iterador.getKey()+" \tValor:"+iterador.getValue());
		}
		
		
		for(Map.Entry<Integer, String> iterador:miTablitaHash.entrySet())
		{
			System.out.println(miTablitaHash);
		}
	}

}






