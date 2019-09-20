package com.archivos.application;

import java.io.*;

public class AppArchivos2 {

	public static void main(String[] args) {
		
		File archivo=null;
		FileWriter writer = null;
		PrintWriter buffer = null;
		
		try
		{
			//Abrir el archivo a escribir en él.
			archivo = new File("c:\\b\\testo.txt");
			
			//Creamos el objeto writer para escribir en el archivo. El segundo parametro es el parametro append, si lo colocamos a true, añadimos al archivo. Si lo colocamos a false sobreescribimos al archivo.
			writer = new FileWriter(archivo,true);
			
			//Creamos el buffer de escritura
			buffer = new PrintWriter(writer);
			System.out.println("Escribo en el archivo");
			buffer.println("Holo");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(writer!=null)
				{
					writer.close();
				}
			}
			catch(Exception e2)
			{
				e2.printStackTrace();
			}

		}
	}

}
