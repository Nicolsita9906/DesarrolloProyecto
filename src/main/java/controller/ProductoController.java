package controller;
import service.ProductoService;
import modelos.Producto;
public class ProductoController {

    ProductoService servicio = new ProductoService();

    public Producto agregarProducto(String nombreProducto, String codigo, String precio, String cantidad, String categoria){
        return servicio.agregarProducto (nombreProducto, codigo, precio, cantidad, categoria);
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
