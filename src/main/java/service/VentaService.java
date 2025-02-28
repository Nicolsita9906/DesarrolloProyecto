package service;
import java.time.LocalDate;
import java.util.ArrayList;

import modelos.Venta;
public class VentaService {
private ArrayList <Venta> ventas = new ArrayList<>();
private EmpleadoService servicio = new EmpleadoService();
private ProductoService productoServicio = new ProductoService();
public void realizarVenta(LocalDate fecha, String codEmp, String codProd, int cantidad){
    servicio.buscarEmpleado(codProd);
    productoServicio.buscarProducto(codProd);
    productoServicio.restarProductos(cantidad, codProd);
    double total = productoServicio.calcularTotalVenta(codProd, cantidad);
    Venta venta = new Venta (fecha, codEmp, codProd, cantidad, total);
    ventas.add(venta);
    productoServicio.restarProductos(cantidad, codProd);
    System.out.println("Venta realizada con exito!" + "$"+total);
}
public void mostrarVentas(){
    for (Venta venta : ventas){
        System.out.println(venta.toString());
        }
    }
}
