/**
 * EmpleadoServiciolmpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.edu.uan.servicio;

public interface EmpleadoServiciolmpl extends java.rmi.Remote {
    public co.edu.uan.modelo.empleado.Empleado[] obtenerListaEmpleados() throws java.rmi.RemoteException;
    public boolean borrarEmpleado(long id) throws java.rmi.RemoteException;
    public boolean agregarEmpleado(co.edu.uan.modelo.empleado.Empleado emp) throws java.rmi.RemoteException;
    public co.edu.uan.modelo.empleado.Empleado obtenerEmpleado(long id) throws java.rmi.RemoteException;
}
