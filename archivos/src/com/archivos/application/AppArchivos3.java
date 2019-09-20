package com.archivos.application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AppArchivos3 {

	public static void main(String[] args) {
		//Constantes
		final int NUMERO_REPETICIONES=10;
		
		//Declaramos objetos y los inicializamos a null
		File archivo=null;
		FileWriter writer=null;
		PrintWriter buffer=null;
		Scanner entrada = new Scanner(System.in);
		String tituloPestania="";
		String tituloPagina="";
		String nombre="";
		
		System.out.println("Introduce el título de la pestaña de tu página web:");
		tituloPestania = entrada.nextLine();
		System.out.println("Introduce el título de la de tu página web:");
		tituloPagina = entrada.nextLine();
		System.out.println("Introduce tu nombre:");
		nombre = entrada.nextLine();
		
		try
		{
			archivo = new File("c:\\b\\testo.html");
			writer = new FileWriter(archivo);
			buffer = new PrintWriter(writer);
			
			buffer.println("<HTML>");
			buffer.println("<HEAD>");
			buffer.println("\t<TITLE>"+tituloPestania+"</TITLE>");
			buffer.println("</HEAD>");
			buffer.println("<BODY>");
			buffer.println("\t<H2>"+tituloPagina+"</H2>");
			for(int i=0;i<NUMERO_REPETICIONES;i++)
			{
				buffer.println("\t"+nombre+" "+i+"<BR/>");
			}
			buffer.println("</BODY>");
			buffer.println("</HTML>");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(writer!=null)
			{
				try 
				{
					writer.close();
				} catch (IOException e2) 
				{
					e2.printStackTrace();
				}
			}
		}

	}

}


