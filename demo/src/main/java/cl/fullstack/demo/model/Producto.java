package cl.fullstack.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Producto {
    private String nombreProd, origenProd, materialPrincipal, categoria;
    private int vidaUtil, precio;
    private boolean reutilizable;
    
}
