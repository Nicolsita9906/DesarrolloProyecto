package service;
import java.time.LocalDate;
import java.util.ArrayList;

import modelos.Producto;

public class ProductoService {
    private ArrayList<Producto> productos = new ArrayList<>();
public Producto agregarProducto (String nombre, String codigo, double precio, int stock, LocalDate caducidad){

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

    public void modificarProducto (String codigo, String newName, String newCode, String newPrice, LocalDate newCaducity, String newStock){
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
    public void restarProductos(int cantidad, String codigo){
        for (Producto x: productos){
            if (x.getCodigo().equals(codigo)){
                if (x.getStock() >= cantidad){
                    x.setStock(x.getStock() - cantidad);
                    System.out.println("Stock actualizado" + x.toString());
                }else{
                    System.out.println("No hay suficiente stock para realizar la venta");
                }
            } else{
                System.out.println("El código no existe en el sistema");
            }
        }

    }
    public double calcularTotalVenta(String codProd, int cantidad) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codProd)) {
                return producto.getPrecio() * cantidad;
            }
        }
        return 0.0;
    }

    public ArrayList <Producto> mostrarProductos(){
        if (productos.isEmpty()){
            System.out.println("No hay productos en el sistema");
        }else{
            for (Producto x: productos){
                System.out.println(x.toString());
            } 
        }
        return productos;
    }
   
    
}
