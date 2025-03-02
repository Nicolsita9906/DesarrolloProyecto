package service;

import excepciones.StockBajo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import modelos.Producto;

public class ProductoService {
    ArrayList<Producto> productos = new ArrayList<>();

    public Producto agregarProducto(String nombre, String codigo, double precio, int stock, LocalDate caducidad) {
        Producto producto = new Producto(nombre, codigo, precio, caducidad, stock);
        System.out.println("Producto agregado con éxito: " + producto.toString());
        this.productos.add(producto);
        return producto;
    }

    public void buscarProducto(String codigo) {
        boolean encontrado = false;
        for (Producto x : this.productos) {
            if (x.getCodigo().equals(codigo)) {
                System.out.println("Producto encontrado: " + x.toString());
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("El código no existe en el sistema");
        }
    }

    public void eliminarProducto(String codigo) {
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto x = iterator.next();
            if (x.getCodigo().equals(codigo)) {
                iterator.remove();
                System.out.println("Producto eliminado: " + x.toString());
                return;
            }
        }
        System.out.println("El código no existe en el sistema");
    }

    public void modificarProducto(String codigo, String newName, String newCode, double newPrice, LocalDate newCaducity, int newStock) {
        boolean encontrado = false;
        for (Producto x : productos) {
            if (x.getCodigo().equals(codigo)) {
                x.setNombre(newName);
                x.setPrecio(newPrice);
                x.setCaducidad(newCaducity);
                x.setCodigo(newCode);
                x.setStock(newStock);
                System.out.println("Producto modificado: " + x.toString());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El código no existe en el sistema");
        }
    }

    public void restarProductos(int cantidad, String codigo) {
        for (Producto x : productos) {
            if (x.getCodigo().equals(codigo)) {
                if (x.getStock() >= cantidad) {
                    x.setStock(x.getStock() - cantidad);
                    System.out.println("Stock actualizado: " + x.toString());
                } else {
                    System.out.println("No hay suficiente stock para realizar la venta");
                }
                return; 
            }
        }
        System.out.println("El código no existe en el sistema");
    }

    public double calcularTotalVenta(String codProd, int cantidad) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codProd)) {
                return producto.getPrecio() * cantidad;
            }
        }
        return 0.0;
    }

    public ArrayList<Producto> mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el sistema");
        } else {
            for (Producto x : productos) {
                System.out.println(x);
            }
        }
        return this.productos;
    }

    public void notificarStock() {
        boolean hayStockBajo = false;
        for (Producto x : productos) {
            if (x.getStock() < 20) {
                hayStockBajo = true;
                try {
                    throw new StockBajo("El producto " + x.getNombre() + " tiene un stock menor a 20, llame al proveedor");
                } catch (StockBajo e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Advertencia de Stock", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        if (!hayStockBajo) {
            System.out.println("Aún no se necesita suministrar productos");
        }
    }
}
