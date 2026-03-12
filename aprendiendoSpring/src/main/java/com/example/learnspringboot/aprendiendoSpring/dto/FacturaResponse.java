package com.example.learnspringboot.aprendiendoSpring.dto;

import lombok.Data;

import java.time.Instant;

@Data
public class FacturaResponse {
    private Long id;
    private double monto;
    private boolean pagada;
    private Instant fecha;
}
