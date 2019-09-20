package com.soappractica1.EndPoint;

import javax.xml.ws.Endpoint;

import com.soappractica1.service.SoapPractica1ServerImplementation;

public class SoapPractica1Publisher {

	public static void main(String[] args) {
		System.out.println("A punto de publicar el Web Service AdiosMundo()");
		Endpoint.publish("http://localhost:8080/SoapPractica1/adiosMundo", new SoapPractica1ServerImplementation());
		System.out.println("Servicio Publicado!!");

	}

}
