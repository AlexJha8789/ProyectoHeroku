
package pe.com.CL1.LaboratI.Dao;

import org.springframework.data.repository.CrudRepository;
import pe.com.CL1.LaboratI.domain.Producto;

/**
 *
 * @author Alexjha
 */
public interface ProductoDao extends CrudRepository<Producto, Long> {
    
}
