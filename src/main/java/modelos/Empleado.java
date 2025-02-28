package modelos;
import java.time.LocalDate;
public class Empleado {
private String nombreEmpleado;
private String codigo;
private String numeroDocuemento;
private LocalDate fechaIngreso;
public Empleado(String nombreEmpleado, String codigo, String numeroDocuemento, LocalDate fechaIngreso) {
this.nombreEmpleado = nombreEmpleado;
this.codigo = codigo;
this.numeroDocuemento = numeroDocuemento;
this.fechaIngreso = fechaIngreso;
    }
    public String setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        return nombreEmpleado;
    }
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
    public String setCodigo(String codigo) {
        this.codigo = codigo;
        return codigo;
    }
    public String getCodigo() {
        return codigo;
    }

    public String setNumeroDocuemento(String numeroDocuemento) {
        this.numeroDocuemento = numeroDocuemento;
        return numeroDocuemento;
    }
    public String getNumeroDocuemento() {
        return numeroDocuemento;
    }
    public LocalDate setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
        return fechaIngreso;
    }
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombreEmpleado + "\nCodigo: " + codigo + "\nNumero de Documento: " + numeroDocuemento + "\nFecha de Ingreso: " + fechaIngreso;
    }
}
