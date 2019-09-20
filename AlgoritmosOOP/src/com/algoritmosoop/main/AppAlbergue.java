package com.algoritmosoop.main;

import com.algoritmosoop.misclases.Mascota;
import java.util.Scanner;

public class AppAlbergue {

	public static void main(String[] args) {
		
		Mascota objPerro1 = new Mascota();
		Mascota objPerro2 = new Mascota("2P2","Ringo","Perro","Gordito");
		Mascota objPerro3 = new Mascota();
		Scanner entrada = new Scanner(System.in);
		
		
		objPerro1.setId("1P1");
		objPerro1.setNombre("Niki");
		objPerro1.setEspecie("Labrador");
		objPerro1.setEstado("Orejona");
		
		System.out.println("Id:");
		objPerro3.setId(entrada.next());
		System.out.println("Nombre:");
		objPerro3.setNombre(entrada.next());
		System.out.println("Raza:");
		objPerro3.setEspecie(entrada.next());
		System.out.println("Descripcion:");
		objPerro3.setEstado(entrada.next());
		
		System.out.println("El id es:"+objPerro1.getId());
		System.out.println("El id es:"+objPerro1.getNombre());
		System.out.println("El id es:"+objPerro1.getEspecie());
		System.out.println("El id es:"+objPerro1.getEstado());
		
		System.out.println("El id es:"+objPerro2.getId());
		System.out.println("El id es:"+objPerro2.getNombre());
		System.out.println("El id es:"+objPerro2.getEspecie());
		System.out.println("El id es:"+objPerro2.getEstado());
		
		System.out.println("El id es:"+objPerro3.getId());
		System.out.println("El id es:"+objPerro3.getNombre());
		System.out.println("El id es:"+objPerro3.getEspecie());
		System.out.println("El id es:"+objPerro3.getEstado());
		System.out.println("Prueba Git");
	}

}
