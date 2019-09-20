package com.singlelinkedlists.main;

import java.util.LinkedList;

import com.simplelinkedlists.model.DosNumeros;
import com.simplelinkedlists.model.ListaSimplementeLigada;
import com.simplelinkedlists.model.Persona;

public class LinkedListsApp {

	public static void main(String[] args) {
		//Esta es la manera utilizando el LinkedList de java.util
		/*LinkedList miListita = new LinkedList();
		miListita.add(5);
		miListita.add(3, 10);*/
		ListaSimplementeLigada miListita = new ListaSimplementeLigada();
		miListita.insert(5);
		miListita.insert(10);
		miListita.insert(7);
		miListita.muestraNodos();
		miListita.insert(8);
		miListita.insert(4);
		miListita.muestraNodos();
		miListita.insertarAlInicio(20);
		miListita.muestraNodos();
		miListita.insertarIndice(3, 30);
		miListita.muestraNodos();
		
		
		/*
		Persona persona1 = new Persona("Pancho Barraza",35);
		Persona persona2 = new Persona("Cesar Piuga Macias",40);
		
		System.out.println("Persona1 Nombre:"+persona1.getNombre());
		System.out.println("Persona1 Edad:"+persona1.getEdad());
		System.out.println("Persona2 Nombre:"+persona2.getNombre());
		System.out.println("Persona2 Edad:"+persona2.getEdad());
		System.out.println("---------------------------");
		
		persona1 = persona2;
		
		System.out.println("Persona1 Nombre:"+persona1.getNombre());
		System.out.println("Persona1 Edad:"+persona1.getEdad());
		System.out.println("Persona2 Nombre:"+persona2.getNombre());
		System.out.println("Persona2 Edad:"+persona2.getEdad());
		System.out.println("---------------------------");
		
		persona2.setNombre("Jonathan Sin Estefy");
		System.out.println("Persona1 Nombre:"+persona1.getNombre());
		System.out.println("Persona1 Edad:"+persona1.getEdad());
		System.out.println("Persona2 Nombre:"+persona2.getNombre());
		System.out.println("Persona2 Edad:"+persona2.getEdad());
		System.out.println("---------------------------");
		
		persona2 = new Persona("Julio Alonzo Gonzalez",50);
		System.out.println("Persona1 Nombre:"+persona1.getNombre());
		System.out.println("Persona1 Edad:"+persona1.getEdad());
		System.out.println("Persona2 Nombre:"+persona2.getNombre());
		System.out.println("Persona2 Edad:"+persona2.getEdad());
		System.out.println("---------------------------");*/
	}

}


