package controller;
import java.time.LocalDate;

import service.EmpleadoService;

public class EmpleadoController {
EmpleadoService servicio = new EmpleadoService();

public void registrarEmpleado(String nombreEmpleado, String codigo, String numeroDocuemento, LocalDate fechaIngreso){
    servicio.agregarEmpleado(nombreEmpleado, codigo, numeroDocuemento, fechaIngreso);
}
public void buscarEmpleado(String codigo){
    servicio.buscarEmpleado(codigo);
    }
public void eliminarEmpleado(String codigo){
    servicio.eliminarEmpleado(codigo);
}
public void modificarEmpleado(String codigo, String newName, String newCode, String newNumber, String newDate){
    servicio.modificarEmpleado(codigo, newName, newCode, newNumber, newDate);
    }
    public void mostrarLista(){
        servicio.listarEmpleados();
    }

}
