package pe.com.CL1.LaboratI.servicio;

import java.util.List;
import pe.com.CL1.LaboratI.domain.Producto;

public interface ProductoService {

    public List<Producto> listarProductos();

    public void guardar(Producto producto);

    public void eliminar(Producto producto);

    public Producto encontrarProducto(Producto producto);

}
