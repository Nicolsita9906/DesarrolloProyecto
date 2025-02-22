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
    public String getNombre() {
        return nombre;
    }
    public String setCodigo(String codigo) {
        this.codigo = codigo;
        return codigo;
    }
    public String getCodigo() {
        return codigo;
    }
    public double setPrecio(double precio) {
        this.precio = precio;
        return precio;
    }
    public double getPrecio() {
        return precio;
    }
    public String setCaducidad(String caducidad) {
        this.caducidad = caducidad;
        return caducidad;
    }
    public String getCaducidad() {
        return caducidad;
    }

}
