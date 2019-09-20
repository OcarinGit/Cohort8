package com.algoritmosoop.main;

import com.algoritmosoop.misclases.Libro;
import java.util.Scanner;

public class AppAlgoritmosOOP {

	public static void main(String[] args) {
		
		Libro objLibro1;
		objLibro1 = new Libro("101B");
		Libro objLibro2;
		objLibro2 = new Libro("202B","Los Miserables");
		Libro objLibro3 = new Libro();
		char cPastaDura=' ';
		
		Scanner entrada=new Scanner(System.in);
		
		
		System.out.println(objLibro1.getClass());
		
		objLibro1.ISBN="101B";
		objLibro1.autor="El Macho";
		objLibro1.noHojas=250;
		objLibro1.anio=1998;
		objLibro1.Titulo="La guerra de los mundos";
		objLibro1.precio=200.0;
		objLibro1.isPastaDura=true;
		
		System.out.println("El libro "+objLibro1.Titulo+" con ISBN "+objLibro1.ISBN+" con autor "+objLibro1.autor+ " tiene una cantidad de hojas "+objLibro1.noHojas+ " fue publicado en el año "+objLibro1.anio+ " con un precio al público de "+objLibro1.precio+" y  el cual sera pasta dura? "+objLibro1.isPastaDura);
		
		System.out.println("Introduce el nombre del libro:");
		objLibro2.Titulo = entrada.nextLine();
		System.out.println("Introduce el autor del libro:");
		objLibro2.autor = entrada.nextLine();
		System.out.println("Introduce el ISBN del libro:");
		objLibro2.ISBN = entrada.next();
		System.out.println("Introduce la cantidad de hojas del libro:");
		objLibro2.noHojas = entrada.nextInt();
		System.out.println("Introduce el año de publicación del libro:");
		objLibro2.anio = entrada.nextInt();
		System.out.println("Introduce el precio al público del libro:");
		objLibro2.precio = entrada.nextDouble();
		System.out.println("Introduce si el libro es pasta dura(S/N):");
		cPastaDura = entrada.next().charAt(0);
		if(cPastaDura=='S' || cPastaDura=='s')
			objLibro2.isPastaDura=true;
		else
			objLibro2.isPastaDura=false;
		
		System.out.println("El libro "+objLibro2.Titulo+" con ISBN "+objLibro2.ISBN+" con autor "+objLibro2.autor+ " tiene una cantidad de hojas "+objLibro2.noHojas+ " fue publicado en el año "+objLibro2.anio+ " con un precio al público de "+objLibro2.precio+" y  el cual sera pasta dura? "+objLibro2.isPastaDura);
		
		
		System.out.println("El libro "+objLibro3.Titulo+" con ISBN "+objLibro3.ISBN+" con autor "+objLibro3.autor+ " tiene una cantidad de hojas "+objLibro3.noHojas+ " fue publicado en el año "+objLibro3.anio+ " con un precio al público de "+objLibro3.precio+" y  el cual sera pasta dura? "+objLibro3.isPastaDura);
		
		System.out.println("El libro fue prestado?"+objLibro3.verPrecio("101B"));
		
		double precio2=0;
		precio2=objLibro3.verPrecio("101B");
	}

}










