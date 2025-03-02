package menu;
import controller.EmpleadoController;
import controller.ProductoController;
import controller.ProveedorController;
import controller.VentaController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class EjecucionDatosMuertos {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
        EmpleadoController ec = new EmpleadoController();
       ProductoController pc = new ProductoController();
       ProveedorController prc = new ProveedorController (); 
       VentaController vc = new VentaController();

       //Gestion empleados
       LocalDate fechaIngreso = LocalDate.parse("23-12-2024", formatter); 
       ec.registrarEmpleado("Juan Perez", "J54nP3r3z","1094899674",fechaIngreso);
        System.out.println("----------------------Agregar Empleado----------------");
       ec.buscarEmpleado("J54nP3r3z");
        System.out.println("----------------------Buscar Empleado----------------");
        ec.modificarEmpleado("J54nP3r3z", "Juan Hernandez", "H3rn4nd3z", "1234456", fechaIngreso);
        System.out.println("----------------------Modificar Empleado----------------");
        ec.mostrarLista();
        System.out.println("----------------------Mostrar Lista----------------");
        ec.eliminarEmpleado("H3rn4nd3z");
        System.out.println("----------------------Eliminar Empleado----------------");
        System.out.println("-------------------------------------------------");

        //Gestion productos
        pc.agregarProducto("Mouse", "M123456", 15.0, 100, LocalDate.parse("30-11-2024", formatter));
        System.out.println("----------------------Agregar Producto----------------");
        pc.buscarProducto("M123456");
        System.out.println("----------------------Buscar Producto----------------");
        pc.modificarProducto("M123456", "Mouse Genius", "G123456", 20.0, LocalDate.parse("30-11-2025", formatter), 150);
        System.out.println("----------------------Modificar Producto----------------");
        pc.mostrarLista();
        System.out.println("----------------------Mostrar Lista----------------");
        pc.eliminarProducto("G123456");
        System.out.println("----------------------Eliminar Producto----------------");
        System.out.println("-------------------------------------------------");


        //Gestion proveedores
        prc.registrarProveedor("Proveedor XYZ", "P123456", "Empresa XYZ", "1234567890", 100, "Electronica");
        System.out.println("----------------------Agregar Proveedor----------------");
        prc.buscarProveedor("P123456");
        System.out.println("----------------------Buscar Proveedor----------------");
        prc.modificarProveedor("P123456", "Proveedor ABC", "A3455", "Empresa ABC", "9876543210", 150, "Alimentacion");
        System.out.println("----------------------Modificar Proveedor----------------");
        prc.mostrarLista();
        System.out.println("----------------------Mostrar Lista----------------");
        prc.eliminarProveedor("A3455");
        System.out.println("----------------------Eliminar Proveedor----------------");
        System.out.println("-------------------------------------------------");

    }
}
