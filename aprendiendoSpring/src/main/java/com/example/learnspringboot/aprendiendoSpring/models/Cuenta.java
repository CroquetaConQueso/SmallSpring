package com.example.learnspringboot.aprendiendoSpring.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cuenta")
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="codigo_cuenta", unique = true)
    private String codCuenta;
    @Column(name="owner_cuenta")
    private String ownerCuenta;
    @Column(name="cantidad_cuenta")
    private double cantidadCuenta;
    @Column(name="password")
    private String contraseña;
    @Column(name="rol")
    private String rol;
}
