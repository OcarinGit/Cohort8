package com.colecciones.application;

import java.util.*;

public class Vectores {

	public static void main(String[] args) {
		//Ejercicio 1
		System.out.println("Ejercicio 1");
		Vector<String> vec = new Vector<String>(6);
		
		vec.add("Elemento 1"); //Método de la clase collections
		vec.addElement("Elemento 2"); //Método de la clase Vector
		vec.addElement("Elemento 3"); //Método de la clase Vector
		vec.addElement("Elemento 4"); //Método de la clase Vector
		vec.addElement("Elemento 5"); //Método de la clase Vector
		/*Enumeration miEnumeracion = vec.elements();
		
		while(miEnumeracion.hasMoreElements())
		{
			System.out.println("Elemento :"+miEnumeracion.nextElement());
		}*/
		vec.set(0, "Elemento 0");
		vec.set(1, "Elemento 1");
		vec.set(2, "Elemento 2");
		vec.set(3, "Elemento 3");
		System.out.println("Elemento en la posicion 0:"+vec.get(0));
		System.out.println("Elemento en la posicion 0:"+vec.get(1));
		System.out.println("Elemento en la posicion 0:"+vec.get(2));
		System.out.println("Elemento en la posicion 0:"+vec.get(3));
		
		

	}

}








