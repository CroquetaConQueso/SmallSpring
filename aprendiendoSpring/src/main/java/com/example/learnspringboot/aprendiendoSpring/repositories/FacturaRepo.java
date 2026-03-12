package com.example.learnspringboot.aprendiendoSpring.repositories;

import com.example.learnspringboot.aprendiendoSpring.models.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FacturaRepo extends JpaRepository<Factura,Long> {
    Optional<Factura>existsByCuentaIdAndPagadaTrue(Long id);
    List<Factura> findByCuentaOwnerCuenta(String username);
}
