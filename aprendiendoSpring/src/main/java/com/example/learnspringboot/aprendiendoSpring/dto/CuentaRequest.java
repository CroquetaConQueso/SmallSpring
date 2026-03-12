package com.example.learnspringboot.aprendiendoSpring.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CuentaRequest {

    @NotBlank(message="La Cuenta Es Obligatoria")
    private String comNombreCuenta;
    @NotBlank(message="La Contraseña Es Obligatoria")
    private String comPassCuenta;
}
