package modelos;
import java.time.LocalDate;
public class Venta {

    LocalDate fechaVenta;
    String codEmp;
    String codProd;
    int cantidad;
    double totalVenta;
    
    public Venta(LocalDate fechaVenta, String codEmp, String codProd, int cantidad, double totalVenta) {
        this.fechaVenta = fechaVenta;
        this.codEmp = codEmp;
        this.codProd = codProd;
        this.cantidad = cantidad;
        this.totalVenta = totalVenta;
    }
    
    public LocalDate getFechaVenta() {
        return fechaVenta;
    }
    
    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    
    public String getCodEmp() {
        return codEmp;
    }
    
    public void setCodEmp(String codEmp) {
        this.codEmp = codEmp;
    }
    
    public String getCodProd() {
        return codProd;
    }
    
    public void setCodProd(String codProd) {
        this.codProd = codProd;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public double getTotalVenta() {
        return totalVenta;
    }
    
    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }
    
    @Override
    public String toString() {
        return "Venta{" + "fechaVenta=" + fechaVenta + ", codEmp=" + codEmp + ", codProd=" + codProd + ", cantidad=" + cantidad + ", totalVenta=" + totalVenta + '}';
    }
}
