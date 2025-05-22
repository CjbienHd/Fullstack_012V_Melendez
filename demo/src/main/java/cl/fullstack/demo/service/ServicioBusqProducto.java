package cl.fullstack.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import cl.fullstack.demo.model.Producto;
import cl.fullstack.demo.repository.RepositoryProducto;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ServicioBusqProducto {

    //*  */
    private final RepositoryProducto repositoryProducto;

    public List<Producto> buscarProductos(
            String nombre,
            String origen,
            String material,
            Boolean reutilizable,
            Integer vidaMin,
            Integer vidaMax,
            Integer precioMin,
            Integer precioMax,
            String categoria,
            Integer cantidadMin,
            Integer cantidadMax
    ) {
        List<Producto> productos = repositoryProducto.findAll();

        if (nombre != null && !nombre.trim().isEmpty()) {
            productos = productos.stream()
                    .filter(p -> p.getNombreProd().toLowerCase().contains(nombre.toLowerCase()))
                    .collect(Collectors.toList());
        }

        if (origen != null && !origen.trim().isEmpty()) {
            productos = productos.stream()
                    .filter(p -> p.getOrigenProd().toLowerCase().contains(origen.toLowerCase()))
                    .collect(Collectors.toList());
        }

        if (material != null && !material.trim().isEmpty()) {
            productos = productos.stream()
                    .filter(p -> p.getMaterialPrincipal().toLowerCase().contains(material.toLowerCase()))
                    .collect(Collectors.toList());
        }

        if (reutilizable != null) {
            productos = productos.stream()
                    .filter(p -> p.isReutilizable() == reutilizable)
                    .collect(Collectors.toList());
        }

        if (vidaMin != null) {
            productos = productos.stream()
                    .filter(p -> p.getVidaUtilMeses() >= vidaMin)
                    .collect(Collectors.toList());
        }

        if (vidaMax != null) {
            productos = productos.stream()
                    .filter(p -> p.getVidaUtilMeses() <= vidaMax)
                    .collect(Collectors.toList());
        }

        if (precioMin != null) {
            productos = productos.stream()
                    .filter(p -> p.getPrecio() >= precioMin)
                    .collect(Collectors.toList());
        }

        if (precioMax != null) {
            productos = productos.stream()
                    .filter(p -> p.getPrecio() <= precioMax)
                    .collect(Collectors.toList());
        }

        if (categoria != null && !categoria.trim().isEmpty()) {
            productos = productos.stream()
                    .filter(p -> p.getCategoria().toLowerCase().contains(categoria.toLowerCase()))
                    .collect(Collectors.toList());
        }

        if (cantidadMin != null) {
            productos = productos.stream()
                    .filter(p -> p.getCantidad() >= cantidadMin)
                    .collect(Collectors.toList());
        }

        if (cantidadMax != null) {
            productos = productos.stream()
                    .filter(p -> p.getCantidad() <= cantidadMax)
                    .collect(Collectors.toList());
        }

        return productos;
    }
    
    
    
    
  }














