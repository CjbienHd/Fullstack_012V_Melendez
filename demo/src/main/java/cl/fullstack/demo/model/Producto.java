package cl.fullstack.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Producto")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 250)
    private String nombreProd;

    @Column(nullable = false, length = 250)
    private String origenProd;

    @Column(nullable = false, length = 250)
    private String materialPrincipal;

    @Column(nullable = false, length = 250)
    private boolean reutilizable;

    @Column(nullable = false, length = 250)
    private int vidaUtilMeses;
    
    @Column(nullable = false, length = 250)
    private int precio;

    @Column(nullable = false, length = 250)
    private String categoria;
    
    @Column(nullable = false, length = 250)
    private int cantidad;
}
