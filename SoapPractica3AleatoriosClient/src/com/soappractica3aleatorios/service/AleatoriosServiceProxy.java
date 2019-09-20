package com.soappractica3aleatorios.service;

public class AleatoriosServiceProxy implements com.soappractica3aleatorios.service.AleatoriosService {
  private String _endpoint = null;
  private com.soappractica3aleatorios.service.AleatoriosService aleatoriosService = null;
  
  public AleatoriosServiceProxy() {
    _initAleatoriosServiceProxy();
  }
  
  public AleatoriosServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAleatoriosServiceProxy();
  }
  
  private void _initAleatoriosServiceProxy() {
    try {
      aleatoriosService = (new com.soappractica3aleatorios.service.AleatoriosServiceServiceLocator()).getAleatoriosService();
      if (aleatoriosService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aleatoriosService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aleatoriosService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aleatoriosService != null)
      ((javax.xml.rpc.Stub)aleatoriosService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.soappractica3aleatorios.service.AleatoriosService getAleatoriosService() {
    if (aleatoriosService == null)
      _initAleatoriosServiceProxy();
    return aleatoriosService;
  }
  
  public java.lang.String aleatorios(int cantidad) throws java.rmi.RemoteException{
    if (aleatoriosService == null)
      _initAleatoriosServiceProxy();
    return aleatoriosService.aleatorios(cantidad);
  }
  
  
}