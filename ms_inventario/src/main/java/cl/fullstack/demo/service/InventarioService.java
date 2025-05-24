package cl.fullstack.demo.service;
import cl.fullstack.demo.model.Producto;
import cl.fullstack.demo.repository.RepositoryInventario;

import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class InventarioService {

    private final RepositoryInventario inventarioRepo;
    
    /** Constructor del servicio de inventario */
    public InventarioService(RepositoryInventario inventarioRepo) {
        this.inventarioRepo = inventarioRepo;
    }

    //obtiene todos los productos
    public List<Producto> obtenerTodos(){
        return inventarioRepo.findAll();
    }

    /*Crea un Producto */
    public Producto creaProducto(Producto prod){
        return inventarioRepo.save(prod);
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

    /** Actualiza el origen de un producto */
    public Producto actualizarOrigen(Long id, String nuevoOrigen) {
        return inventarioRepo.findById(id)
            .map(p -> {
                p.setOrigenProd(nuevoOrigen);
                return inventarioRepo.save(p);
            })
            .orElseThrow(() ->
                new IllegalArgumentException("No se encontró producto con id: " + id)
            );
    
    }



    /** Actualiza material principal de un producto */
    public Producto actualizarMaterial(Long id, String nuevoMaterial) {
        return inventarioRepo.findById(id)
            .map(p -> {
                p.setMaterialPrincipal(nuevoMaterial);
                return inventarioRepo.save(p);
            })
            .orElseThrow(() ->
                new IllegalArgumentException("No se encontró producto con id: " + id));
    }


    /** Actualiza la reutilizabilidad de un producto */
    public Producto actualizarReutilizabilidad(Long id, boolean reutilizable) {
        return inventarioRepo.findById(id)
            .map(p -> {
                p.setReutilizable(reutilizable);
                return inventarioRepo.save(p);
            })
            .orElseThrow(() ->
                new IllegalArgumentException("No se encontró producto con id: " + id));
    }



    /** Actualiza la vida util de un producto */
    public Producto actualizarVidaUtill(Long id, int nuevaVidaUtil) {
        return inventarioRepo.findById(id)
            .map(p -> {
                p.setVidaUtilMeses(nuevaVidaUtil);
                return inventarioRepo.save(p);
            })
            .orElseThrow(() ->
                new IllegalArgumentException("No se encontró producto con id: " + id));
    }


    /** Actualiza la cantidad de un producto */
    public Producto actualizarCategoria(Long id, String nuevaCategoria) {
        return inventarioRepo.findById(id)
            .map(p -> {
                p.setCategoria(nuevaCategoria);
                return inventarioRepo.save(p);
            })
            .orElseThrow(() ->
                new IllegalArgumentException("No se encontró producto con id: " + id));
    }
    

    public String eliminarProducto(Long id){
        inventarioRepo.deleteById(id);
        return "El producto con el id: " + id + "a sido eliminado";
    }

}