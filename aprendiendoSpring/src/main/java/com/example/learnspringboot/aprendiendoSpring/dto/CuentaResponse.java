package com.example.learnspringboot.aprendiendoSpring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CuentaResponse {
    private String mensaje;
    private String nombreCuenta;
    private String token;
}
