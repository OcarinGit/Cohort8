package com.algoritmosoop.main;

import com.algoritmosoop.misclases.Mascota;
import com.algoritmosoop.misclases.Felino;
import com.algoritmosoop.misclases.GatoDomestico;
import com.algoritmosoop.misclases.GatoSalvaje;

public class AppHerenciaMascotas {

	public static void main(String[] args) {
		Mascota objMascota1=new Mascota();
		
		objMascota1.setNombre("Alligator");
		System.out.println("El nombre de la mascota es:"+objMascota1.getNombre());
		
		GatoSalvaje objGato1=new GatoSalvaje();
		GatoDomestico objGato2 = new GatoDomestico();
		GatoDomestico objGato3 = new GatoDomestico();
		GatoDomestico objGato4 = new GatoDomestico();
		
		objGato1.setNombre("Gato Tom");
		objGato2.setNombre("Gato Silvester");
		objGato3.setNombre("Gato Felix");
		objGato4.setNombre("Pelusa");
		
		System.out.println("El gato 1 se llama:"+objGato1.getNombre());
		
		System.out.println("El gato 2 se llama:"+objGato2.getNombre());
		System.out.println("La edad máxima es:"+objGato2.EdadMaxima);
		
		System.out.println("El gato 3 se llama:"+objGato3.getNombre());
		System.out.println("La edad máxima es:"+objGato3.EdadMaxima);
		
		System.out.println("El gato 4 se llama:"+objGato4.getNombre());
		System.out.println("La edad máxima es:"+objGato4.EdadMaxima);
		
		GatoDomestico.EdadMaxima=30;
		
		System.out.println("El gato 2 se llama:"+objGato2.getNombre());
		System.out.println("La edad máxima es:"+objGato2.EdadMaxima);
		
		System.out.println("El gato 3 se llama:"+objGato3.getNombre());
		System.out.println("La edad máxima es:"+objGato3.EdadMaxima);
		
		System.out.println("El gato 4 se llama:"+objGato4.getNombre());
		System.out.println("La edad máxima es:"+objGato4.EdadMaxima);
		
		objGato2.EdadMaxima=40;
		
		System.out.println("El gato 2 se llama:"+objGato2.getNombre());
		System.out.println("La edad máxima es:"+objGato2.EdadMaxima);
		
		System.out.println("El gato 3 se llama:"+objGato3.getNombre());
		System.out.println("La edad máxima es:"+objGato3.EdadMaxima);
		
		System.out.println("El gato 4 se llama:"+objGato4.getNombre());
		System.out.println("La edad máxima es:"+objGato4.EdadMaxima);
	}

}









