package modelos;

public class Proveedores {
private String nombreProveedor;
private String codigo;
private String empresa;
private String telefono;
private int cantidadProductosIngresados;
private String categoriaProductos;
public Proveedores(String nombreProveedor, String codigo, String empresa, String telefono, int cantidadProductosIngresados, String categoriaProductos) {	
this.nombreProveedor = nombreProveedor;
this.codigo = codigo;
this.empresa = empresa;
this.telefono = telefono;
this.cantidadProductosIngresados = cantidadProductosIngresados;
this.categoriaProductos = categoriaProductos;

    }
    public String setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
        return nombreProveedor;
    }
    public String getNombreProveedor() {
        return nombreProveedor;
    }
    public String setCodigo(String codigo) {
        this.codigo = codigo;
        return codigo;
    }
    public String getCodigo() {
        return codigo;
    }
    public String setEmpresa(String empresa) {
        this.empresa = empresa;
        return empresa;
    }
    public String getEmpresa() {
        return empresa;
    }
    public String setTelefono(String telefono) {
        this.telefono = telefono;
        return telefono;
    }
    public String getTelefono() {
        return telefono;
    }
    public int setCantidadProductosIngresados(int cantidadProductosIngresados) {
        this.cantidadProductosIngresados = cantidadProductosIngresados;
        return cantidadProductosIngresados;
    }
    public int getCantidadProductosIngresados() {
        return cantidadProductosIngresados;
    }
    public String setCategoriaProductos(String categoriaProductos) {
        this.categoriaProductos = categoriaProductos;
        return categoriaProductos;
    }
    public String getCategoriaProductos() {
        return categoriaProductos;
    }
    public String toString() {
        return "Nombre del Proveedor: " + nombreProveedor + "\nCodigo: " + codigo + "\nEmpresa: " + empresa + "\nTelefono: " + telefono + "\nCantidad de Productos Ingresados: " + cantidadProductosIngresados + "\nCategoria de Productos: " + categoriaProductos;
    }
}
