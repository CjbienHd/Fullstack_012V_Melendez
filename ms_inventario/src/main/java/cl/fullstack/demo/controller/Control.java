package cl.fullstack.demo.controller;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import cl.fullstack.demo.service.InventarioService;
import cl.fullstack.demo.model.Producto;




@RestController
@RequiredArgsConstructor
@RequestMapping("/inventario")
public class Control {

    private final InventarioService inventarioService;


    @GetMapping
    public String status() {
        return "microservicio inventario funcionando correctamente";
    }

    @GetMapping("/obtener")
    public List<Producto> obtenerProductos() {
        return inventarioService.obtenerTodos();
    }
    


    // Actualizar cantidad de un producto
    @PostMapping("/{id}/cantidad")
    public Producto actualizarCantidad(@PathVariable Long id, @RequestBody int nuevaCantidad) {
        return inventarioService.actualizarCantidad(id, nuevaCantidad);
    }

    // Actualizar precio de un producto
    @PostMapping("/{id}/precio")
    public Producto actualizarPrecio(@PathVariable Long id, @RequestBody int nuevoPrecio) {
        return inventarioService.actualizarPrecio(id, nuevoPrecio);
    }

        
    // Actualizar nombre de un producto
    @PostMapping("/{id}/nombre")
    public Producto actualizarNombre(@PathVariable Long id, @RequestBody String nuevoNombre) {
        return inventarioService.actualizarNombre(id, nuevoNombre);
    }


        
    // Actualizar origen de un producto
    @PostMapping("/{id}/origen")
    public Producto actualizarOrigen(@PathVariable Long id, @RequestBody String nuevOrigen) {
        return inventarioService.actualizarOrigen(id, nuevOrigen);
    }

        
    // Actualizar precio de un producto
    @PostMapping("/{id}/material")
    public Producto actualizarMaterial(@PathVariable Long id, @RequestBody String nuevoMaterial) {
        return inventarioService.actualizarMaterial(id, nuevoMaterial);
    }


        
    // Actualizar precio de un producto
    @PostMapping("/{id}/reutilizacion")
    public Producto actualizarReutilizacion(@PathVariable Long id, @RequestBody boolean nuevaReutilizacion) {
        return inventarioService.actualizarReutilizabilidad(id, nuevaReutilizacion);
    }


        
    // Actualizar vida util de un producto
    @PostMapping("/{id}/vidautil")
    public Producto actualizarVidaUtil(@PathVariable Long id, @RequestBody int nuevaVidaUtil) {
        return inventarioService.actualizarVidaUtill(id, nuevaVidaUtil);
    }


    // Actualizar categoria de un producto
    @PostMapping("/{id}/categoria")
    public Producto actualizarCategoria(@PathVariable Long id, @RequestBody String nuevaCategoria) {
        return inventarioService.actualizarCategoria(id, nuevaCategoria);
    }


    // Crear un nuevo producto
    @PostMapping("/crearProducto")
    public Producto crearProducto(@RequestBody Producto prod) {
        return inventarioService.creaProducto(prod);
    }

    //Eliminar producto
    @DeleteMapping("/eliminar/{id}")
    public String eliminarProducto(@PathVariable Long id){
        return inventarioService.eliminarProducto(id);
    }
    
    
}

    


