package main;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import co.edu.uan.servicio.EmpleadoServiciolmpl;
import co.edu.uan.servicio.EmpleadoServiciolmplProxy;
import co.edu.uan.servicio.EmpleadoServiciolmplServiceLocator;

public class Main {

	public static void main(String[] args) throws RemoteException {
		// Forma 1de hacer la prueba
		EmpleadoServiciolmplProxy pro = new EmpleadoServiciolmplProxy();
		String fecha = pro.obtenerEmpleado(1L).getNombre();
		System.out.println(fecha);
		// Forma 2 de hacer la prueba
		EmpleadoServiciolmplServiceLocator locator = new EmpleadoServiciolmplServiceLocator();
		try {
			EmpleadoServiciolmpl servicioEmpleadoImpl = locator.getEmpleadoServiciolmpl();
			System.out.println(servicioEmpleadoImpl.obtenerEmpleado(1L).getNombre());
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
