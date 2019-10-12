package co.edu.uan.servicio;

public class EmpleadoServiciolmplProxy implements co.edu.uan.servicio.EmpleadoServiciolmpl {
  private String _endpoint = null;
  private co.edu.uan.servicio.EmpleadoServiciolmpl empleadoServiciolmpl = null;
  
  public EmpleadoServiciolmplProxy() {
    _initEmpleadoServiciolmplProxy();
  }
  
  public EmpleadoServiciolmplProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmpleadoServiciolmplProxy();
  }
  
  private void _initEmpleadoServiciolmplProxy() {
    try {
      empleadoServiciolmpl = (new co.edu.uan.servicio.EmpleadoServiciolmplServiceLocator()).getEmpleadoServiciolmpl();
      if (empleadoServiciolmpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)empleadoServiciolmpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)empleadoServiciolmpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (empleadoServiciolmpl != null)
      ((javax.xml.rpc.Stub)empleadoServiciolmpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.edu.uan.servicio.EmpleadoServiciolmpl getEmpleadoServiciolmpl() {
    if (empleadoServiciolmpl == null)
      _initEmpleadoServiciolmplProxy();
    return empleadoServiciolmpl;
  }
  
  public co.edu.uan.modelo.empleado.Empleado[] obtenerListaEmpleados() throws java.rmi.RemoteException{
    if (empleadoServiciolmpl == null)
      _initEmpleadoServiciolmplProxy();
    return empleadoServiciolmpl.obtenerListaEmpleados();
  }
  
  public boolean borrarEmpleado(long id) throws java.rmi.RemoteException{
    if (empleadoServiciolmpl == null)
      _initEmpleadoServiciolmplProxy();
    return empleadoServiciolmpl.borrarEmpleado(id);
  }
  
  public boolean agregarEmpleado(co.edu.uan.modelo.empleado.Empleado emp) throws java.rmi.RemoteException{
    if (empleadoServiciolmpl == null)
      _initEmpleadoServiciolmplProxy();
    return empleadoServiciolmpl.agregarEmpleado(emp);
  }
  
  public co.edu.uan.modelo.empleado.Empleado obtenerEmpleado(long id) throws java.rmi.RemoteException{
    if (empleadoServiciolmpl == null)
      _initEmpleadoServiciolmplProxy();
    return empleadoServiciolmpl.obtenerEmpleado(id);
  }
  
  
}