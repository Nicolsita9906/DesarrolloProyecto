package controller;
import java.time.LocalDate;
import service.VentaService;
public class VentaController {

    private VentaService ventaService = new VentaService();
    
    public void registrarVenta(LocalDate fecha, String codEmp, String codProd, int cantidad, EmpleadoController servicio, ProductoController producto) {
        ventaService.realizarVenta(fecha, codEmp, codProd, cantidad, servicio, producto);
    }
    
    public void mostrarVentas() {
        ventaService.mostrarVentas();
    }
}
