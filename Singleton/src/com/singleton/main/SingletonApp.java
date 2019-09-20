package com.singleton.main;

public class SingletonApp {

	public static void main(String[] args) {
		
		ElMacho ElChore = ElMacho.getSingletonInstance("Ebrick");
		try
		{
			ElMacho Pepe = ElMacho.getSingletonInstance("Pepe");
			System.out.println("El Objeto Pepe:"+Pepe.getNombre());
			
			ElMacho Julio = Pepe.clone();
			System.out.println("El Objeto Julio:"+Julio.getNombre());
		}
		catch(NullPointerException pizza)
		{
			pizza.printStackTrace();
		}
		finally
		{
			System.out.println("El Objeto ElChore:"+ElChore.getNombre());
		}
	}

}
