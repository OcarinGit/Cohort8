package com.soappractica1.service;

import javax.jws.WebService;

@WebService(endpointInterface="com.soappractica1.service.SoapPractica1Server")
public class SoapPractica1ServerImplementation implements SoapPractica1Server {
	public String adiosMundo(String msg)
	{
		return "Adios Mundo Cruel!! Bai:"+msg;
	}
}
