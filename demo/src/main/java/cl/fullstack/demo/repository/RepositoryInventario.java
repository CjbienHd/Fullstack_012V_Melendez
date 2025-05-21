package cl.fullstack.demo.repository;


import cl.fullstack.demo.model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface RepositoryInventario {
    /** Trae un producto por su id */
    Producto getProductoById(Long id);

    /** Trae todos los productos */
    List<Producto> getAllProductos();

    /** Actualiza la cantidad de un producto */
    void updateCantidad(Long id, int cantidad);
}
        


