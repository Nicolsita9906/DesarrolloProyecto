package controller;
import modelos.Producto;
import service.ProductoService;
public class ProductoController {

    ProductoService servicio = new ProductoService();

    public Producto agregarProducto(String nombre, String codigo, double precio, int stock, String caducidad){
        return servicio.agregarProducto(nombre, codigo, precio, stock, caducidad);
    }
    public void buscarProducto(String codigo){
        servicio.buscarProducto(codigo);
    }
    public void eliminarProducto(String codigo){
        servicio.eliminarProducto(codigo);
    }
    public void modificarProducto(String codigo, String newName, String newCode, String newPrice, String newQuantity, String newCategory){
        servicio.modificarProducto(codigo, newName, newCode, newPrice, newQuantity, newCategory);
    }
    public void mostrarLista(){
        servicio.mostrarProductos();
    }
}
