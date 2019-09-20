package com.archivos.application;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import com.archivos.misclases.Vectores;

public class AppArchivos4 {

	public static void main(String[] args) {
		//Constantes
		final int NUMERO_ELEMENTOS=100;
		
		//Objetos
		File archivo = null;
		FileWriter writer = null;
		PrintWriter buffer = null;
		Vectores vectors = new Vectores();
		Random rnd = new Random(System.nanoTime());
		
		//Vectores
		int[] vectorEnteros1 = new int[NUMERO_ELEMENTOS];
		int[] vectorEnteros2 = new int[NUMERO_ELEMENTOS];
		
		//Creamos las series aleatorios.
		vectorEnteros1 = vectors.serieAleatoria(vectorEnteros1);
		for(int i=0;i<vectorEnteros2.length;i++)
		{
			vectorEnteros2[i] = rnd.nextInt(99)+1;
		}
		
		try
		{
			archivo = new File("c:\\b\\arregloAleatorio.html");
			writer = new FileWriter(archivo);
			buffer = new PrintWriter(writer);
			
			buffer.println("<HTML>");
			buffer.println("<HEAD>");
			buffer.println("\t<TITLE>Vector PseudoAleatorio</TITLE>");
			buffer.println("</HEAD>");
			buffer.println("<BODY>");
			buffer.println("\t<H2> Vector con números aleatorios</H2>");
			buffer.println("\t<table>");
			buffer.println("\t<thead>");
			buffer.println("\t\t<tr><th>Nombre</th><th>índice</th><th>Valor</th></tr>");
			buffer.println("\t</thead>");
			buffer.println("\t<tbody>");
			for(int i=0;i<vectorEnteros1.length;i++)
			{
				buffer.println("\t\t<tr><td>vector</td><td>"+i+"</td><td>"+vectorEnteros1[i]+"</td></tr>");
			}
			buffer.println("\t</tbody>");
			buffer.println("\t</table>");
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
				}
				catch(Exception e2)
				{
					e2.printStackTrace();
				}
			}
		}

	}

}
