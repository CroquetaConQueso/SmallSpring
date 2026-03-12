package com.example.learnspringboot.aprendiendoSpring.repositories;

import com.example.learnspringboot.aprendiendoSpring.models.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CuentaRepo extends JpaRepository<Cuenta,Long> {

    //The type established will dictate the return, therefor in Optional<Cuenta> ends up with an account always being returned
    //While if I need a boolean I will have to state that a bool is needed
    Optional<Cuenta>findByOwnerCuenta(String ownerCuenta);
    boolean existsByOwnerCuenta(String ownerCuenta);
}
