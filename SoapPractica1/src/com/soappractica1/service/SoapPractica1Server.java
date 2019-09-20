package com.soappractica1.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface SoapPractica1Server {
	
	@WebMethod
	String adiosMundo(String msg);
}
