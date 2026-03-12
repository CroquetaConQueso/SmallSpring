package com.example.learnspringboot.aprendiendoSpring.controllers;

import com.example.learnspringboot.aprendiendoSpring.auth.AuthUser;
import com.example.learnspringboot.aprendiendoSpring.dto.CuentaRequest;
import com.example.learnspringboot.aprendiendoSpring.dto.CuentaResponse;
import com.example.learnspringboot.aprendiendoSpring.errores.ApiErrores;
import com.example.learnspringboot.aprendiendoSpring.models.Cuenta;
import com.example.learnspringboot.aprendiendoSpring.service.CuentaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/cuentas")
@RestController
@AllArgsConstructor
public class CuentasController {

    private CuentaService cuSer;

    @PostMapping("/login")
    public CuentaResponse logear(@RequestBody CuentaRequest cureq){
        try {
            Cuenta cu =  cuSer.buscarDueño(cureq.getComNombreCuenta(),cureq.getComPassCuenta());
            return new CuentaResponse("PETICION_OK 200",cu.getOwnerCuenta(),UUID.randomUUID().toString());
        } catch (ApiErrores e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/obtener")
    public Cuenta devolverCuenta(@RequestBody CuentaRequest cureq){
        try {
            return cuSer.espeDueño(cureq.getComNombreCuenta());
        } catch (ApiErrores e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/obtenerTodos")
    public List<Cuenta> todas(@RequestBody AuthUser user){
        try {
            return cuSer.devolverTodos(user.getToken(),user.getRol());
        } catch (ApiErrores e) {
            throw new RuntimeException(e);
        }
    }
}
