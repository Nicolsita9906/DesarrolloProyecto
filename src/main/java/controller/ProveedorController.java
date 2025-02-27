package controller;
import service.ProveedoresService;
public class ProveedorController {
  ProveedoresService servicio = new ProveedoresService();
    public void registrarProveedor(String nombreProveedor, String codigo, String empresa, String telefono, int cantidadProductosIngresados, String categoriaProductos){
        servicio.agregarProveedor(nombreProveedor, codigo, empresa, telefono, cantidadProductosIngresados, categoriaProductos);
    }
    public void eliminarProveedor(String codigo){
        servicio.eliminarProveedor(codigo);
    }
    public void buscarProveedor(String codigo){
        servicio.buscarProveedres(codigo);
    }
    public void modificarProveedor(String codigo, String newName, String newCode, String newEmpresa, String newTelefono, String newCantidad, String newCategoria){
        servicio.modificarProveedor(codigo, newName, newCode, newEmpresa, newTelefono, newCantidad, newCategoria);
    }
    public void mostrarLista(){
        servicio.listarProveedores();
    }
}
