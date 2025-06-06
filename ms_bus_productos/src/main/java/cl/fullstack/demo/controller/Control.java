package cl.fullstack.demo.controller;

import cl.fullstack.demo.service.ServicioBusqProducto;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import cl.fullstack.demo.model.Producto;



@RestController
@RequiredArgsConstructor
@RequestMapping("/ecomarket")
public class Control {

    private final ServicioBusqProducto servicioBusqProducto;


    @GetMapping
    public String status() {
        return "microservicio busqueda de productos funcionando correctamente";
    }

    // --- BÚSQUEDA DE PRODUCTOS CON FILTROS ---
    @GetMapping("/buscar")
    public List<Producto> buscar(
            @RequestParam(required = false) String nombre,
            @RequestParam(required = false) String origen,
            @RequestParam(required = false) String material,
            @RequestParam(required = false) Boolean reutilizable,
            @RequestParam(required = false) Integer vidaMin,
            @RequestParam(required = false) Integer vidaMax,
            @RequestParam(required = false) Integer precioMin,
            @RequestParam(required = false) Integer precioMax,
            @RequestParam(required = false) String categoria,
            @RequestParam(required = false) Integer cantidadMin,
            @RequestParam(required = false) Integer cantidadMax
    ) {
        return servicioBusqProducto.buscaComplejaProductos(
                nombre, origen, material, reutilizable, vidaMin, vidaMax,
                precioMin, precioMax, categoria, cantidadMin, cantidadMax
        );
    }

    // --- INVENTARIO ---

    // Obtener todo el inventario
    @GetMapping("/inventario")
    public List<Producto> obtenerInventario() {
        return servicioBusqProducto.obtenerInventarioCompleto();
    }

    // Obtener producto por ID
    @GetMapping("/inventario/{id}")
    public Producto obtenerPorId(@PathVariable Long id) {
        return servicioBusqProducto.obtenerPorId(id);
    }

    
}

    


