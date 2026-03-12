package com.example.learnspringboot.aprendiendoSpring.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

@Data
@Entity
@Table(name="factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="id_cuenta")
    private Cuenta cuenta;
    private double monto;
    private boolean pagada;
    private Instant fecha;

}
