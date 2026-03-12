package com.example.learnspringboot.aprendiendoSpring.auth;

import lombok.Data;

@Data
public class AuthUser {
    private String token;
    private String nombreCuenta;
    private String rol;
}
