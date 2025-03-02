package menu;
import controller.EmpleadoController;
import controller.ProductoController;
import controller.ProveedorController;
import controller.VentaController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class Menus {

    public void menu(){
        EmpleadoController ec = new EmpleadoController();
        ProductoController pc = new ProductoController();
        ProveedorController prc = new ProveedorController();
        VentaController vc = new VentaController();

        int opcion;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO AL MENÚ DE GESTION DE SUPERMERCADO, POR FAVOR ELIGA UNA DE LAS SIGUIENTES OPCIONES \n"
        + "1. Gestión de Productos\n"
        + "2. Gestión de Empleados\n"
        + "3. Gestión de Proveedores\n"
        + "4. Gestión de Ventas\n"
        + "5. Salir");

        opcion = sc.nextInt();
        sc.nextLine();
        
        switch(opcion){
            case 1:
            gestionDeProductos(pc);
            break;
                    
            case 2:
               gestionDeEmpleado(ec);
                break;
            case 3:
                gestionDeProveedor(prc);
                break;
            case 4:
                gestionDeVentas(vc);
                break;
            }
        } while (opcion != 5);
    }
    public void gestionDeEmpleado ( EmpleadoController ec){
        int x;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de la opcion que desea realizar:\n" + "1. Agregar empleado\n" +
        "2. Buscar empleado\n" + "3. Eliminar empleado\n" + "4. Modificar empleado\n" + "5. Listar empleados\n" +
         "6. Regresar al menu principal");
        x = sc.nextInt();
        sc.nextLine();
        switch(x){
            case 1:
            // agregar empleado
            String nombre, codigo, nDocumento;
            LocalDate fecha;
            System.out.println("POR FAVOR INGRESE LOS DATOS DEL NUEVO EMPLEADO:");
            System.out.println("Ingrese el nombre:");
            nombre = sc.nextLine();
            System.out.println("Ingrese el codigo:");
            codigo = sc.nextLine();
            System.out.println("Ingrese el numero de documento:");
            nDocumento = sc.nextLine();
            System.out.println("Ingrese la fecha de ingreso:");
            fecha = leerFecha();

            ec.registrarEmpleado(nombre, codigo, nDocumento, fecha);
            break;

            case 2:
            // buscar empleado
            System.out.println("Ingrese el codigo del empleado a buscar:");
            codigo = sc.nextLine();
            ec.buscarEmpleado(codigo);
            break;
            case 3:
            // eliminar empleado
            System.out.println("Ingrese el codigo del empleado a eliminar:");
            codigo = sc.nextLine();
            ec.eliminarEmpleado(codigo);
            break;
            case 4:
            // modificar empleado
            String codigoBB, nuevoNombre, nuevoDocumento;
            LocalDate nuevaFecha;
            System.out.println("Ingrese el codigo del empleado a modificar:");
            codigoBB = sc.nextLine();
            System.out.println("Ingrese el nuevo nombre:");
            nuevoNombre = sc.nextLine();
            System.out.println("Ingrese el nuevo codigo:");
            String nuevoCodigo = sc.nextLine();
            System.out.println("Ingrese el nuevo numero de documento:");
            nuevoDocumento = sc.nextLine();
            System.out.println("Ingrese la nueva fecha de ingreso:");
            nuevaFecha = leerFecha();         
            ec.modificarEmpleado(codigoBB, nuevoNombre, nuevoCodigo, nuevoDocumento, nuevaFecha);
            break;

            case 5: 
            // listar empleados
            ec.mostrarLista();
            break;
            case 6:
            // regresar al menu principal
            menu();
            break;
        }
    }while (x != 7);
        
}
    public void gestionDeProductos( ProductoController pc){
        int x;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("POR FAVOR INGRESE EL NUMERO DE LA OPCION QUE NECESITA:\n" + "1. Agregar producto\n" +
        "2. Buscar producto\n" +  "3. Eliminar producto\n" + "4. Modificar producto\n" + "5. Listar productos\n" + 
        "6. Regresar al menu principal");
        x = sc.nextInt();
        sc.nextLine();
    
        switch(x){
            case 1:
            // agregar producto
            String nombre, codigo;
            double precio;
            int stock;
            LocalDate caducidad;
            System.out.println("POR FAVOR INGRESE LOS DATOS DEL NUEVO PRODUCTO:");
            System.out.println("Ingrese el nombre:");
            nombre = sc.nextLine();
            System.out.println("Ingrese el codigo:");
            codigo = sc.nextLine();
            System.out.println("Ingrese el precio:");
            precio = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese el stock:");
            stock = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese la fecha de caducidad:");
           caducidad = leerFecha();
            pc.agregarProducto(nombre, codigo, precio, stock, caducidad);
            break;
            case 2:
            // buscar producto
            System.out.println("Ingrese el codigo del producto a buscar:");
            codigo = sc.nextLine();
            pc.buscarProducto(codigo);
            break;
            case 3:
            // eliminar producto
            System.out.println("Ingrese el codigo del producto a eliminar:");
            codigo = sc.nextLine();
            pc.eliminarProducto(codigo);
            break;
            case 4:
            // modificar producto
            String nuevoNombre, nuevoCodigo;
            System.out.println("Ingrese el codigo del producto a modificar:");
            String codigoo = sc.nextLine();
            System.out.println("Ingrese el nuevo nombre:");
            nuevoNombre = sc.nextLine();
            System.out.println("Ingrese el nuevo codigo:");
            nuevoCodigo = sc.nextLine();
            System.out.println("Ingrese el nuevo precio:");
            double nuevoPrecio = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese el nuevo stock:");
            int nuevoStock = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese la nueva fecha de caducidad:");
            DateTimeFormatter formatoo = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate nuevaCaducidad = LocalDate.parse(sc.nextLine(), formatoo);
            pc.modificarProducto(codigoo, nuevoNombre, nuevoCodigo, nuevoPrecio, nuevaCaducidad, nuevoStock);
            break;

            case 5:
            // listar productos
            pc.mostrarLista();
            break;
            case 6:
            // regresar al menu principal
            menu();
            break;
            default:
                    System.out.println("Opción incorrecta");
                    break;
        }
    
    }while (x != 7);
}
        public void gestionDeProveedor(ProveedorController prc){
            int x;
            do {
           
            Scanner sc = new Scanner(System.in);
            System.out.println("POR FAVOR INGRESE EL NUMERO DE LA OPCION QUE NECESITA:\n" + "1. Agregar proveedor\n" + 
            "2. Buscar proveedor\n" + "3. Eliminar proveedor\n" + "4. Modificar proveedor\n" + "5. Listar proveedores\n" +
            "6. Regresar al menu principal");
            x = sc.nextInt();
            sc.nextLine();
            
            switch(x){
                case 1:
                // agregar proveedor
                String nombreProveedor, codigo, empresa, telefono, categoriaProductos;
                int cantidadProductosIngresados;
                System.out.println("POR FAVOR INGRESE LOS DATOS DEL NUEVO PROVEEDOR:");
                System.out.println("Ingrese el nombre del proveedor:");
                nombreProveedor = sc.nextLine();
                System.out.println("Ingrese el codigo:");
                codigo = sc.nextLine();
                System.out.println("Ingrese la empresa:");
                empresa = sc.nextLine();
                System.out.println("Ingrese el telefono:");
                telefono = sc.nextLine();
                System.out.println("Ingrese la cantidad de productos ingresados:");
                cantidadProductosIngresados = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese la categoria de productos:");
                categoriaProductos = sc.nextLine();
                prc.registrarProveedor(nombreProveedor, codigo, empresa, telefono, cantidadProductosIngresados, categoriaProductos);
                break;
                case 2:
                // buscar proveedor
                System.out.println("Ingrese el codigo del proveedor a buscar:");
                codigo = sc.nextLine();
                prc.buscarProveedor(codigo);
                break;
                case 3:
                // eliminar proveedor
                System.out.println("Ingrese el codigo del proveedor a eliminar:");
                codigo = sc.nextLine();
                prc.eliminarProveedor(codigo);
                break;
                case 4:
                // modificar proveedor
                System.out.println("Ingrese el codigo del proveedor a modificar:");
                String codigoo = sc.nextLine();
                System.out.println("Ingrese el nuevo nombre:");
                String nuevNombreProveedor = sc.nextLine();
                System.out.println("Ingrese el nuevo codigo:");
                String nuevoCodigo = sc.nextLine();
                System.out.println("Ingrese la nueva empresa:");
                String nuevEmpresa = sc.nextLine();
                System.out.println("Ingrese el nuevo telefono:");
                String nuevTelefono = sc.nextLine();
                System.out.println("Ingrese la nueva cantidad de productos ingresados:");
                int nuevCantidadProductosIngresados = sc.nextInt();
                System.out.println("Ingrese la nueva categoria de productos:");
                String nuevCategoriaProductos = sc.nextLine();
                sc.nextLine();
                prc.modificarProveedor(codigoo, nuevNombreProveedor, nuevoCodigo, nuevEmpresa, nuevTelefono, nuevCantidadProductosIngresados, nuevCategoriaProductos);
                break;
                case 5:
                // listar proveedores
                prc.mostrarLista();
                break;
                case 6:
                // regresar al menu principal
                menu();
                break;
            }
        } while (x != 7);
    }
            public void gestionDeVentas(VentaController vc){
                int x;
                do {
                Scanner sc = new Scanner(System.in);
                System.out.println("POR FAVOR INGRESE EL NUMERO DE LA OPCION QUE NECESITA:\n" + "1. Registrar venta\n" +
                 "2. Generar reporte\n" + "3. Regresar al menu principal");
                x = sc.nextInt();
                sc.nextLine();
                
                switch(x){
                    case 1:
                    // registrar venta
                    String codigoProducto, codigoEmpleado;
                    int cantidad;
                    LocalDate fechaVenta;
                    System.out.println("POR FAVOR INGRESE LOS DATOS DE LA VENTA:");
                    System.out.println("Ingrese el codigo del producto:");
                    codigoProducto = sc.nextLine();
                    System.out.println("Ingrese el codigo del empleado:");
                    codigoEmpleado = sc.nextLine();
                    System.out.println("Ingrese la cantidad:");
                    cantidad = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese la fecha de la venta:");
                    fechaVenta = LocalDate.parse(sc.nextLine());
                    vc.registrarVenta(fechaVenta, codigoEmpleado, codigoProducto, cantidad);
                    break;
                    case 2:
                    // generar reporte
                    vc.mostrarVentas(); 
                    break;
                    case 3:
                    // regresar al menu principal
                    menu();
                    break;
            }
        } while (x != 4);
    }
    private LocalDate leerFecha() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Ingrese la fecha (dd-MM-yyyy): ");
                String fechaInput = sc.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                return LocalDate.parse(fechaInput, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("⚠ Error: Formato de fecha incorrecto. Intente nuevamente con el formato dd-MM-yyyy.");
            }
        }
    }
}
