package com.example.learnspringboot.aprendiendoSpring.service;

import com.example.learnspringboot.aprendiendoSpring.errores.ApiErrores;
import com.example.learnspringboot.aprendiendoSpring.models.Cuenta;
import com.example.learnspringboot.aprendiendoSpring.models.Factura;
import com.example.learnspringboot.aprendiendoSpring.repositories.CuentaRepo;
import com.example.learnspringboot.aprendiendoSpring.repositories.FacturaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DatosBancariosService {
    private final CuentaRepo cuRepo;
    private final FacturaRepo faRepo;


    public Cuenta buscarDueño(String comNombreCuenta,String comPassCuenta) throws ApiErrores {
        comNombreCuenta = comNombreCuenta.trim();
        comPassCuenta = comPassCuenta.trim();
        Cuenta cu = cuRepo.findByOwnerCuenta(comNombreCuenta).orElseThrow(() -> new ApiErrores("La cuenta no se ha encontrado"));
        if(!cu.getContraseña().equals(comPassCuenta)){
            throw new ApiErrores("La contraseña no es correcta");
        }
        return cu;
    }

    public Cuenta espeDueño(String comNombreCuenta) throws ApiErrores {
        comNombreCuenta = comNombreCuenta.trim();

        Cuenta cu = cuRepo.findByOwnerCuenta(comNombreCuenta).orElseThrow(() -> new ApiErrores("La cuenta no se ha encontrado"));
        return cu;
    }
    public List<Cuenta> devolverTodos(String token,String rol) throws ApiErrores {
        if(token==null || token.isEmpty() || token.length() != 36){
            throw new ApiErrores("El token ha expirado");
        }
        if(!rol.equals("admin")){
            throw new ApiErrores("No tienes los permisos para poder realizar esta operación");
        }
        return cuRepo.findAll();
    }

    public List<Factura> facturasCliente( String nombre, String rol) throws ApiErrores {
        if(!rol.equals("admin")){
            throw new ApiErrores("No tienes los permisos para poder realizar esta operación");
        }

        if(!cuRepo.existsByOwnerCuenta(nombre)){
            throw  new ApiErrores("El usuario no existe");
        }

        return faRepo.findByCuentaOwnerCuenta(nombre);
    }
}
