package com.soappractica2.webservice;

public class MensajeProxy implements com.soappractica2.webservice.Mensaje {
  private String _endpoint = null;
  private com.soappractica2.webservice.Mensaje mensaje = null;
  
  public MensajeProxy() {
    _initMensajeProxy();
  }
  
  public MensajeProxy(String endpoint) {
    _endpoint = endpoint;
    _initMensajeProxy();
  }
  
  private void _initMensajeProxy() {
    try {
      mensaje = (new com.soappractica2.webservice.MensajeServiceLocator()).getMensaje();
      if (mensaje != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mensaje)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mensaje)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mensaje != null)
      ((javax.xml.rpc.Stub)mensaje)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.soappractica2.webservice.Mensaje getMensaje() {
    if (mensaje == null)
      _initMensajeProxy();
    return mensaje;
  }
  
  public java.lang.String daMensaje(java.lang.String testo) throws java.rmi.RemoteException{
    if (mensaje == null)
      _initMensajeProxy();
    return mensaje.daMensaje(testo);
  }
  
  
}