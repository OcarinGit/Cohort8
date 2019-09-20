package com.junitproject.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junitproject.model.OperacionesVarias;

class OperacionesVariasTest {

	@Test
	void testSumaNumeros1() {
		//fail("Not yet implemented");
		OperacionesVarias objOperacionesVarias = new OperacionesVarias();
		
		int resultadoObtenido;
		int resultadoEsperado;
		
		objOperacionesVarias.setNumero1(2);
		objOperacionesVarias.setNumero2(2);
		resultadoObtenido = objOperacionesVarias.sumaNumeros();
		
		resultadoEsperado=6;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testSumaNumeros2()
	{
OperacionesVarias objOperacionesVarias = new OperacionesVarias();
		
		int resultadoObtenido;
		//int resultadoEsperado;
		boolean mayorEdad;
		
		objOperacionesVarias.setNumero1(2);
		objOperacionesVarias.setNumero2(2);
		resultadoObtenido = objOperacionesVarias.sumaNumeros();
		
		if(resultadoObtenido>=18)
		{
			mayorEdad=true;
		}
		else
		{
			mayorEdad=false;
		}
		
		assertTrue(mayorEdad);
	}
	
	//La especificación me indica que si el usuario deja el textbox sin rellenar, el sistema debe de tomarlo como si fuera si no pudiera hacer la suma
	@Test
	void testSumaNumeros3()
	{
		int resultadoObtenido;
		int resultadoEsperado;
		
		OperacionesVarias objOperacionesVarias = new OperacionesVarias();
		objOperacionesVarias.setNumero2(2);
		resultadoObtenido = objOperacionesVarias.sumaNumeros();
		resultadoEsperado = 0;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	void testSumaNumeros5()
	{
		fail("Método no implementado");
	}
	
	@Test
	void testSumaNumeros6()
	{
		OperacionesVarias objOperacionesVarias = new OperacionesVarias();
		
		double resultadoObtenido;
		double resultadoEsperado;
		
		resultadoObtenido=objOperacionesVarias.sumaNumeros(2.5, 3.2);
		
		resultadoEsperado = 5.8;
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
}





