/**
 * AleatoriosServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soappractica3aleatorios.service;

public class AleatoriosServiceServiceLocator extends org.apache.axis.client.Service implements com.soappractica3aleatorios.service.AleatoriosServiceService {

    public AleatoriosServiceServiceLocator() {
    }


    public AleatoriosServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AleatoriosServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AleatoriosService
    private java.lang.String AleatoriosService_address = "http://localhost:8080/SoapPractica3Aleatorios/services/AleatoriosService";

    public java.lang.String getAleatoriosServiceAddress() {
        return AleatoriosService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AleatoriosServiceWSDDServiceName = "AleatoriosService";

    public java.lang.String getAleatoriosServiceWSDDServiceName() {
        return AleatoriosServiceWSDDServiceName;
    }

    public void setAleatoriosServiceWSDDServiceName(java.lang.String name) {
        AleatoriosServiceWSDDServiceName = name;
    }

    public com.soappractica3aleatorios.service.AleatoriosService getAleatoriosService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AleatoriosService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAleatoriosService(endpoint);
    }

    public com.soappractica3aleatorios.service.AleatoriosService getAleatoriosService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.soappractica3aleatorios.service.AleatoriosServiceSoapBindingStub _stub = new com.soappractica3aleatorios.service.AleatoriosServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAleatoriosServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAleatoriosServiceEndpointAddress(java.lang.String address) {
        AleatoriosService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.soappractica3aleatorios.service.AleatoriosService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.soappractica3aleatorios.service.AleatoriosServiceSoapBindingStub _stub = new com.soappractica3aleatorios.service.AleatoriosServiceSoapBindingStub(new java.net.URL(AleatoriosService_address), this);
                _stub.setPortName(getAleatoriosServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AleatoriosService".equals(inputPortName)) {
            return getAleatoriosService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.soappractica3aleatorios.com", "AleatoriosServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.soappractica3aleatorios.com", "AleatoriosService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AleatoriosService".equals(portName)) {
            setAleatoriosServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
