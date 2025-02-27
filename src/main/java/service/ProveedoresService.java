package service;
import modelos.Proveedores;
import java.util.ArrayList;
public class ProveedoresService {
    ArrayList<Proveedores> proveedores = new ArrayList<>();
    public void agregarProveedor(String nombreProveedor, String codigo, String empresa, String telefono, int cantidadProductosIngresados, String categoriaProductos){
        for(Proveedores proveedor : proveedores){
            if(proveedor.getCodigo().equals(codigo)){
                System.out.println("El código ya existe en el sistema");
            }else{
                Proveedores prov = new Proveedores(nombreProveedor, codigo, empresa, telefono, cantidadProductosIngresados, categoriaProductos);
                proveedores.add(prov);
                System.out.println("Proveedor agregado con exito");
            }
            break;
        }
    }
    public void eliminarProveedor(String codigo){
        for(Proveedores proveedor : proveedores){
            if(proveedor.getCodigo().equals(codigo)){
                proveedores.remove(proveedor);
                System.out.println("Proveedor eliminado con exito");
            }else{
                System.out.println("El código no existe en el sistema");
            }
            break;
        }
    }
    public void buscarProveedres(String codigo){
        for(Proveedores proveedor : proveedores){
            if(proveedor.getCodigo().equals(codigo)){
                System.out.println(proveedor.toString());
            }else{
                System.out.println("El código no existe en el sistema");
            }
            break;
        }
    }
    public void modificarProveedor(String codigo, String newName, String newCode, String newEmpresa, String newTelefono, String newCantidad, String newCategoria){
        for(Proveedores proveedor : proveedores){
            if(proveedor.getCodigo().equals(codigo)){
                proveedor.setNombreProveedor(newName);
                proveedor.setCodigo(newCode);
                proveedor.setEmpresa(newEmpresa);
                proveedor.setTelefono(newTelefono);
                proveedor.setCantidadProductosIngresados(Integer.parseInt(newCantidad));
                proveedor.setCategoriaProductos(newCategoria);
                System.out.println("Proveedor modificado con exito");
            }else{
                System.out.println("El código no existe en el sistema");
            }
            break;
        }
    }
    public void listarProveedores(){
        if(proveedores.isEmpty()){
            System.out.println("No hay proveedores en el sistema");
        }else{
            for(Proveedores proveedor : proveedores){
                System.out.println(proveedor.toString());
            }  
        }
    }
}
