package com.vectores.application;

import com.vectores.misclases.*;

public class AppVectores {

	public static void main(String[] args) {
		//Se colocan 20 facturas porque es la cantidad de facturas simultaneas que se pueden enviar
		final int NUM_FACTURAS=20;
		boolean[] vecBoolean=new boolean[20];
		int[] vecInt = {10,20,30,40,50,60,70,80,90,100};
		char[] vecCaracteres = new char[] {'a','b','c','d','e','f','g','h','i'};
		double[] vecDouble = new double[NUM_FACTURAS];
		float[] vecFloat = new float[5];
		String[] vecString = new String[10];
		String cadena="Holo";
		
		System.out.println("Valor de Cadena:"+cadena);
		cadena=vecInt.toString();
		System.out.println("Valor de Cadena:"+cadena.charAt(1));
		System.out.println(vecCaracteres);
		System.out.println(vecCaracteres.length);
		vecCaracteres=cadena.toCharArray();
		System.out.println(vecCaracteres);
		System.out.println(vecCaracteres.length);
		
		Vectores[] objVector = new Vectores[20];
		/*for(int i=0;i<vecCaracteres.length;i++)
		{
			System.out.println(vecCaracteres);
		}*/
		
		int[] vector=new int[100];
		
		//Inicializacion del vector
		for(int i=vector.length-1;i>=0;i--)
		{
			vector[i]=1;
		}
		
		for(int i=0;i<vector.length;i++)
		{
			System.out.println("Vector["+i+"]:"+vector[i]);
		}
		
		for(int i=0;i<vector.length;i++)
		{
			vector[i]=(i+1);
		}
		
		for(int i=0;i<vector.length;i++)
		{
			System.out.println("Vector["+i+"]:"+vector[i]);
		}
	}
	
	

}




