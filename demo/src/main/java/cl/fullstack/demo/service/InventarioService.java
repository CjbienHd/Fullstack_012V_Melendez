package cl.fullstack.demo.service;

import cl.fullstack.demo.model.Producto;
import cl.fullstack.demo.repository.RepositoryInventario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioService {

    private final RepositoryInventario inventarioRepo;
    /** Constructor del servicio de inventario */
    public InventarioService(RepositoryInventario inventarioRepo) {
        this.inventarioRepo = inventarioRepo;
    }

    /* Permite obtener todos los productos del inventario */
    public List<Producto> obtenerInventarioCompleto() {
        return inventarioRepo.findAll();
    }

    /** Permite obtener un producto por su ID */
    public Producto obtenerPorId(Long id) {
        return inventarioRepo.findById(id)
            .orElseThrow(() ->
                new IllegalArgumentException("No se encontró producto con id: " + id)
            );
    }

    /** Actualiza la cantidad de un producto */
    public Producto actualizarCantidad(Long id, int nuevaCantidad) {
        return inventarioRepo.findById(id)
            .map(p -> {
                p.setCantidad(nuevaCantidad);
                return inventarioRepo.save(p);
            })
            .orElseThrow(() ->
                new IllegalArgumentException("No se encontró producto con id: " + id)
            );
    }

    /** Permite actualizar el precio de un producto */
    public Producto actualizarPrecio(Long id, int nuevoPrecio) {
        return inventarioRepo.findById(id)
            .map(p -> {
                p.setPrecio(nuevoPrecio);
                return inventarioRepo.save(p);
            })
            .orElseThrow(() ->
                new IllegalArgumentException("No se encontró producto con id: " + id)
            );
    }

    /** Permite actualizar el nombre de un producto */
    public Producto actualizarNombre(Long id, String nuevoNombre) {
        return inventarioRepo.findById(id)
            .map(p -> {
                p.setNombreProd(nuevoNombre);
                return inventarioRepo.save(p);
            })
            .orElseThrow(() ->
                new IllegalArgumentException("No se encontró producto con id: " + id)
            );
    
}

}