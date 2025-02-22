package modelos;

public class Producto {

    String nombre;
    String codigo;
    double precio;
    String caducidad;
    int stock;

    public Producto(String nombre, String codigo, double precio, String caducidad, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.caducidad = caducidad;
        this.stock = stock;
    }
    
    // Getters y Setters
    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }
    public String getCodigo() {
        return codigo;
    }

}
