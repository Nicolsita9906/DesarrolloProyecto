package service;
import java.time.LocalDate;
import java.util.ArrayList;
import modelos.Empleado;
public class EmpleadoService {
ArrayList<Empleado> empleados = new ArrayList<>();
public void agregarEmpleado(String nombreEmpleado, String codigo, String numeroDocuemento, LocalDate fechaIngreso){
    for(Empleado empleado : empleados){
        if(empleado.getCodigo().equals(codigo)&&empleado.getNumeroDocuemento().equals(numeroDocuemento)){
            System.out.println("El código o identificacion ya existe en el sistema");
            
        }else{
            Empleado emp = new Empleado(nombreEmpleado, codigo, numeroDocuemento, fechaIngreso);
            empleados.add(emp);
            System.out.println("Empleado agregado con exito");  
        }
        break;
    }
    }
    public void buscarEmpleado(String codigo){
        for (Empleado x: empleados){
            if (x.getCodigo().equals(codigo)){
                System.out.println("Empleado encontrado" + x.toString());
            }else{
                System.out.println("El código no existe en el sistema");
            }
            break;
        }
    }
    public void eliminarEmpleado(String codigo){
        for (Empleado x: empleados){
            if (x.getCodigo().equals(codigo)){
                empleados.remove(x);
                System.out.println("Empleado eliminado");
            }else{
                System.out.println("El código no existe en el sistema");
            }
            break;
        }
    }
    public void modificarEmpleado (String codigo, String newName, String newCode, String newNumber, LocalDate newDate){
        for (Empleado x: empleados){
            if (x.getCodigo().equals(codigo)){
                x.setNombreEmpleado(newName);
                x.setCodigo(newCode);
                x.setNumeroDocuemento(newNumber);
                x.setFechaIngreso(newDate);
                System.out.println("Empleado modificado" + x.toString());
                
            }else{
                System.out.println("El código no existe en el sistema");
            }
            break;
        }
    }
    public void listarEmpleados(){
        if(empleados.isEmpty()){
            System.out.println("No hay empleados en el sistema");
        }else{
            for (Empleado x: empleados){
                System.out.println(x.toString());
            }
        }
    }
}
