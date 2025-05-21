package cl.fullstack.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.fullstack.demo.model.Producto;


@Repository
public interface RepositoryProducto extends JpaRepository <Producto, Long> {

}
