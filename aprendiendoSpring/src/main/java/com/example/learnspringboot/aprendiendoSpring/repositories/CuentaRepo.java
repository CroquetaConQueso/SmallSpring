package com.example.learnspringboot.aprendiendoSpring.repositories;

import com.example.learnspringboot.aprendiendoSpring.models.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CuentaRepo extends JpaRepository<Cuenta,Long> {
    Optional<Cuenta>findByOwnerCuenta(String ownerCuenta);
}
