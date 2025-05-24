package cl.fullstack.demo.repository;

import cl.fullstack.demo.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
/**Repositorio que implementa la interfaz JpaRepository para la clase Producto */
public interface RepositoryInventario extends JpaRepository<Producto, Long> {

}
        


