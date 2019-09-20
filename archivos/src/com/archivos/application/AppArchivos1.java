package com.archivos.application;

import java.io.*;

public class AppArchivos1 {

	public static void main(String[] args) {
		
		System.out.println("c:\\nuevacarpeta\\testo.txt");
		File archivo = null;
		FileReader reader = null;
		BufferedReader buffer = null;
		
		try
		{
			//Abrimos el archivo
			archivo = new File("c:\\b\\testo.txt");
			
			//Asignamos un reader al objeto de tipo archivo
			reader = new FileReader(archivo);
			
			//Creamos un buffer para hacer una lectura cómoda del archivo. Para disponer del método readLine().
			buffer = new BufferedReader(reader);
			
			//Leemos el archivo
			System.out.println("Contenido del archivo");
			System.out.println("-------------------------------------------");
			String linea="";
			while((linea=buffer.readLine())!=null)
			{
				System.out.println(linea);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(reader!= null)
				{
					reader.close();
				}
			}
			catch(Exception e2)
			{
				e2.printStackTrace();
			}
		}

	}

}
