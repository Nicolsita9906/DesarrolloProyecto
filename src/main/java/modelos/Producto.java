package modelos;
import java.time.LocalDate;
public class Producto {

    private String nombre;
    private String codigo;
    private double precio;
    private LocalDate caducidad;
    private int stock;

    public Producto(String nombre, String codigo, double precio, LocalDate caducidad, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.caducidad = caducidad;
        this.stock = stock;
    }
    
    // Getters y Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }
    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }
    public LocalDate getCaducidad() {
        return caducidad;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getStock() {
        return stock;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nCodigo: " + codigo + "\nPrecio: " + precio + "\nCaducidad: " + caducidad + "\nStock: " + stock;
    }

}
