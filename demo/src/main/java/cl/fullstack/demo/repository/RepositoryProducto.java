package cl.fullstack.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.fullstack.demo.model.Producto;


@Repository
/** Clase que implementa la interfaz JpaRepository para la clase Producto
 */
public interface RepositoryProducto extends JpaRepository <Producto, Long> {
    /** Método que busca por el nombre del producto*/
    List<Producto> findByCategoria(String categoria);

    /** Método que busca por el nombre del producto*/
    List<Producto> findByNombreProd(String nombreProd);

    /** Método que busca por el origen del producto*/
    List<Producto> findByOrigenProd(String origenProd);

    /** Método que busca por el material principal del producto*/ 
    List<Producto> findByMaterialPrincipal(String materialPrincipal);

    /** Método que dice si el producto es reutilizable o no*/ 
    List<Producto> findByReutilizable(boolean reutilizable);

    /** Método que busca por la vida util en meses del producto*/
    List<Producto> findByVidaUtilMeses(int vidaUtilMeses);

    /** Método que busca por el precio entre dos valores*/
    List<Producto> findByPrecioBetween(int min, int max);

}
