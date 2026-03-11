package com.example.learnspringboot.aprendiendoSpring.repositories;

import com.example.learnspringboot.aprendiendoSpring.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CursoRepository extends JpaRepository<Curso,Long> {
    Optional<Curso>findByNombreAutor(String nombreAutor);
}
