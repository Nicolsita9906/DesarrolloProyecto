package controller;
import java.time.LocalDate;
import modelos.Producto;
import service.ProductoService;
public class ProductoController {

    ProductoService servicio = new ProductoService();

    public Producto agregarProducto(String nombre, String codigo, double precio, int stock, LocalDate caducidad){
        return servicio.agregarProducto(nombre, codigo, precio, stock, caducidad);
    }
    public void buscarProducto(String codigo){
        servicio.buscarProducto(codigo);
    }
    public void eliminarProducto(String codigo){
        servicio.eliminarProducto(codigo);
    }
    public void modificarProducto(String codigo, String newName, String newCode, double newPrice, LocalDate newCaducity, int newStock){
        servicio.modificarProducto(codigo, newName, newCode, newPrice, newCaducity, newStock);
    }
    public void mostrarLista(){
        servicio.mostrarProductos();
    }
}
