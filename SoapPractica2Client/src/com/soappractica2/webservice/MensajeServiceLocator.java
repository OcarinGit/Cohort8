/**
 * MensajeServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soappractica2.webservice;

public class MensajeServiceLocator extends org.apache.axis.client.Service implements com.soappractica2.webservice.MensajeService {

    public MensajeServiceLocator() {
    }


    public MensajeServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MensajeServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Mensaje
    private java.lang.String Mensaje_address = "http://localhost:8080/SoapPractica2/services/Mensaje";

    public java.lang.String getMensajeAddress() {
        return Mensaje_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MensajeWSDDServiceName = "Mensaje";

    public java.lang.String getMensajeWSDDServiceName() {
        return MensajeWSDDServiceName;
    }

    public void setMensajeWSDDServiceName(java.lang.String name) {
        MensajeWSDDServiceName = name;
    }

    public com.soappractica2.webservice.Mensaje getMensaje() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Mensaje_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMensaje(endpoint);
    }

    public com.soappractica2.webservice.Mensaje getMensaje(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.soappractica2.webservice.MensajeSoapBindingStub _stub = new com.soappractica2.webservice.MensajeSoapBindingStub(portAddress, this);
            _stub.setPortName(getMensajeWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMensajeEndpointAddress(java.lang.String address) {
        Mensaje_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.soappractica2.webservice.Mensaje.class.isAssignableFrom(serviceEndpointInterface)) {
                com.soappractica2.webservice.MensajeSoapBindingStub _stub = new com.soappractica2.webservice.MensajeSoapBindingStub(new java.net.URL(Mensaje_address), this);
                _stub.setPortName(getMensajeWSDDServiceName());
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
        if ("Mensaje".equals(inputPortName)) {
            return getMensaje();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.soappractica2.com", "MensajeService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.soappractica2.com", "Mensaje"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Mensaje".equals(portName)) {
            setMensajeEndpointAddress(address);
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
