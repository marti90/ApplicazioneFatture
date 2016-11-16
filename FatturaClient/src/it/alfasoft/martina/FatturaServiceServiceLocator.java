/**
 * FatturaServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.alfasoft.martina;

public class FatturaServiceServiceLocator extends org.apache.axis.client.Service implements it.alfasoft.martina.FatturaServiceService {

    public FatturaServiceServiceLocator() {
    }


    public FatturaServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FatturaServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FatturaService
    private java.lang.String FatturaService_address = "http://localhost:8086/Applicazione_Fatture/services/FatturaService";

    public java.lang.String getFatturaServiceAddress() {
        return FatturaService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FatturaServiceWSDDServiceName = "FatturaService";

    public java.lang.String getFatturaServiceWSDDServiceName() {
        return FatturaServiceWSDDServiceName;
    }

    public void setFatturaServiceWSDDServiceName(java.lang.String name) {
        FatturaServiceWSDDServiceName = name;
    }

    public it.alfasoft.martina.FatturaService getFatturaService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FatturaService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFatturaService(endpoint);
    }

    public it.alfasoft.martina.FatturaService getFatturaService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.alfasoft.martina.FatturaServiceSoapBindingStub _stub = new it.alfasoft.martina.FatturaServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getFatturaServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFatturaServiceEndpointAddress(java.lang.String address) {
        FatturaService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.alfasoft.martina.FatturaService.class.isAssignableFrom(serviceEndpointInterface)) {
                it.alfasoft.martina.FatturaServiceSoapBindingStub _stub = new it.alfasoft.martina.FatturaServiceSoapBindingStub(new java.net.URL(FatturaService_address), this);
                _stub.setPortName(getFatturaServiceWSDDServiceName());
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
        if ("FatturaService".equals(inputPortName)) {
            return getFatturaService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://martina.alfasoft.it", "FatturaServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://martina.alfasoft.it", "FatturaService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FatturaService".equals(portName)) {
            setFatturaServiceEndpointAddress(address);
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
