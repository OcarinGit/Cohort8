package com.stringsproject.application;

import java.util.Scanner;

public class AppStringsProject {

	public static void main(String[] args) {
		
		String cadena="The class String includes methods for examining individual characters of the sequence, for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string with all characters translated to uppercase or to lowercase. Case mapping is based on the Unicode Standard version specified by the Character class. The Java language provides special support for the string concatenation operator ( + ), and for conversion of other objects to strings. String concatenation is implemented through the StringBuilder(or StringBuffer) class and its append method. String conversions are implemented through the method toString, defined by Object and inherited by all classes in Java. For additional information on string concatenation and conversion, see Gosling, Joy, and Steele, The Java Language Specification. ";
		
		String cadena2="The class String includes methods for examining individual characters of the sequence, for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string with all characters translated to uppercase or to lowercase. Case mapping is based on the Unicode Standard version specified by the Character class. The Java language provides special support for the string concatenation operator ( + ), and for conversion of other objects to strings. String concatenation is implemented through the StringBuilder(or StringBuffer) class and its append method. String conversions are implemented through the method toString, defined by Object and inherited by all classes in Java. For additional information on string concatenation and conversion, see Gosling, Joy, and Steele, The Java Language Specification. ";
		String cadena4="Hola";
		String cadena5="Munditu!!";
		
		System.out.println("La cantidad de caracteres es:"+cadena.length());
		System.out.println("El cuarto caracter de la cadena es:"+cadena.charAt(4));
		
		if(cadena.compareTo(cadena2)==0)
		{
			System.out.println("Cadenas son iguales");
		}
		else
		{
			System.out.println("Cadenas son diferentes");
		}
		
		System.out.println(cadena4.concat(cadena5.concat(cadena.concat("El Machou!!"+cadena2))));
		//cadena=cadena4.concat(cadena5);
		//System.out.println(cadena);
		
		if(cadena.contains("The"))
		{
			System.out.println("Si existe la frase");
		}
		else
		{
			System.out.println("No existe la frase");
		}
		if(cadena.endsWith("ando")||cadena.endsWith("endo"))
		{
			System.out.println("Si es un gerundio");
		}
		else
		{
			System.out.println("No es un gerundio");
		}
		
		if(cadena.equals(cadena2)) 
		{
			System.out.println("Cadenas son iguales");
		}
		else
		{
			System.out.println("Cadenas no son iguales");
		}
		
		System.out.println("Encontró el caracter en la posicion:"+cadena.indexOf('e'));
		System.out.println("Encontró el caracter en la posicion:"+cadena.indexOf('e',100));
		System.out.println("Encontró la frase en la posicion:"+cadena.indexOf("Java"));
		System.out.println("Encontró la frase en la posicion:"+cadena.indexOf("Java",355));
		cadena="";
		if(cadena.isEmpty())
		{
			System.out.println("Cadena Vacía");
		}
		else
		{
			System.out.println("Cadena no vacía");
		}
		System.out.println("Encontré el caracter en la posición:"+cadena2.lastIndexOf('e'));
		System.out.println("El tamaño de la cadena es:"+cadena2.length());
		
		System.out.println("Cadena original:"+cadena2);
		System.out.println("Cadena con el caracter reemplazado:"+cadena2.replace('e', 'o'));
		System.out.println("Cadena original:"+cadena2);
		System.out.println("Cadena con el caracter reemplazado:"+cadena2.replace("The", "THU"));
		String[] cadena6=new String[50];
		cadena6=cadena2.split("e");
		for(int i=0;i<cadena6.length;i++)
		{
			System.out.println("Cadena["+i+"]:"+cadena6[i]);
		}
		
		System.out.println("La cadena comienza con la frase:"+cadena2.startsWith("The"));
		System.out.println(cadena2.subSequence(100, 200));
		System.out.println(cadena2.substring(100));
		System.out.println(cadena2.substring(100, 200));
		
		System.out.println("Cadena en minúsculas:"+cadena2.toLowerCase());
		
		System.out.println("Cadena en Mayúsculas:"+cadena2.toUpperCase());
		
		String cadena7="     Hola Munditu!!   ";
		System.out.println("Cadena7:"+cadena7.trim());
		String cadena8="";
		System.out.println(cadena8.valueOf(true));
		char caracter='c';
		double num=120.2;
		String cadena9="";
		cadena8=cadena8.valueOf(caracter);
		cadena9=String.valueOf(num);
		System.out.println(cadena8);
		System.out.println(cadena9);
	}

}




