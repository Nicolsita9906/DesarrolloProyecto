package controller;
import java.time.LocalDate;

import service.VentaService;
public class VentaController {

    private VentaService ventaService = new VentaService();
    
    public void registrarVenta(LocalDate fecha, String codEmp, String codProd, int cantidad) {
        ventaService.realizarVenta(fecha, codEmp, codProd, cantidad);
    }
    
    public void generarReporte() {
        ventaService.mostrarVentas();
    }
}
