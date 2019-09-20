/**
 * MensajeService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soappractica2.webservice;

public interface MensajeService extends javax.xml.rpc.Service {
    public java.lang.String getMensajeAddress();

    public com.soappractica2.webservice.Mensaje getMensaje() throws javax.xml.rpc.ServiceException;

    public com.soappractica2.webservice.Mensaje getMensaje(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
