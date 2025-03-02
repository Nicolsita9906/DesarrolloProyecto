package service;
import controller.EmpleadoController;
import controller.ProductoController;
import java.time.LocalDate;
import java.util.ArrayList;
import modelos.Venta;
public class VentaService {
private ArrayList <Venta> ventas = new ArrayList<>();
public void realizarVenta(LocalDate fecha, String codEmp, String codProd, int cantidad, EmpleadoController empleado, ProductoController producto) {
    // Verificar si el empleado existe
    if (empleado.buscarEmpleado(codEmp) == null) {
        System.out.println("Error: El empleado con código " + codEmp + " no existe.");
        return;
    }

    // Verificar si el producto existe
    if (producto.buscarProducto(codProd) == null) {
        System.out.println("Error: El producto con código " + codProd + " no existe.");
        return;
    }

    // Calcular total de la venta
    double total = producto.calcularTotalVenta(codProd, cantidad);

    // Evitar realizar ventas con cantidad inválida
    if (cantidad <= 0) {
        System.out.println("Error: La cantidad debe ser mayor a 0.");
        return;
    }

    // Intentar restar productos (el método ya maneja el stock)
    producto.restarProductos(cantidad, codProd);

    // Registrar la venta
    Venta venta = new Venta(fecha, codEmp, codProd, cantidad, total);
    ventas.add(venta);

    // Notificar stock y mostrar éxito
    producto.notificarStock();
    System.out.println("Venta realizada con éxito: " + venta.toString());
}

    

public void mostrarVentas(){
    for (Venta venta : ventas){
        System.out.println(venta.toString());
        }
    }
}
