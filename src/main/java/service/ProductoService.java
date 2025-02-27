package service;
import java.util.ArrayList;
import modelos.Producto;
public class ProductoService {
    private ArrayList<Producto> productos = new ArrayList<>();
public Producto agregarProducto (String nombre, String codigo, double precio, String caducidad, int stock){

Producto producto = new Producto(nombre, codigo, precio, caducidad, stock);
productos.add(producto);
return producto;
}
public void buscarProducto(String codigo){

    for (Producto x: productos){
        if (x.getCodigo().equals(codigo)){
            System.out.println("Producto encontrado" + x.toString());
        }else{
            System.out.println("El código no existe en el sistema");
        }
    }
    }
    public void eliminarProducto(String codigo){
        for (Producto x: productos){
            if (x.getCodigo().equals(codigo)){
                productos.remove(x);
                System.out.println("Producto eliminado");
            }else{
                System.out.println("El código no existe en el sistema");
            }
        }
    }

    public void modificarProducto (String codigo, String newName, String newCode, 
    String newPrice, String newCaducity, String newStock){
        for (Producto x: productos){
            if (x.getCodigo().equals(codigo)){
                x.setNombre(newName);
                x.setPrecio(Double.parseDouble(newPrice));
                x.setCaducidad(newCaducity);
                x.setCodigo(newCode);
                x.setStock(Integer.parseInt(newStock));
                System.out.println("Producto modificado" + x.toString());
                
            }else{
                System.out.println("El código no existe en el sistema");
            }
        }
    }

    public void mostrarProductos(){
        if (productos.isEmpty()){
            System.out.println("No hay productos en el sistema");
        }else{
            for (Producto x: productos){
                System.out.println(x.toString());
            }
        }
    }
    public void notificacionStock(){

    }
}
