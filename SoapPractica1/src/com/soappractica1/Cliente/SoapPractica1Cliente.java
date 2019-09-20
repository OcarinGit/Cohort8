package com.soappractica1.Cliente;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.soappractica1.service.SoapPractica1Server;

public class SoapPractica1Cliente {

	public static void main(String[] args) {
		try
		{
			URL direccionUrl = new URL("http://localhost:8080/SoapPractica1/adiosMundo?wsdl");
			QName qname = new QName("http://service.soappractica1.com/",
					"SoapPractica1ServerImplementationService");
			Service servicio = Service.create(direccionUrl, qname);
			SoapPractica1Server servidor = servicio.getPort(SoapPractica1Server.class);
			String nombreDramaQueen="Kevin";
			System.out.println(servidor.adiosMundo(nombreDramaQueen));
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
