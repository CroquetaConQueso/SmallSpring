package com.example.learnspringboot.aprendiendoSpring.controllers;

import com.example.learnspringboot.aprendiendoSpring.models.Curso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CursosController {

    @GetMapping("/cursos")
    public List<Curso> obtenerCursos(){
        return Arrays.asList(new Curso(1L, "Aprendiendo Spring", "Antonio"),
                new Curso(2L, "Subir Montañas","Gilito"),
                new Curso(3L, "Comida con Pepe", "María"),
                new Curso(4L, "Construir una Casa", "Raúl"),
                new Curso(5L, "La Choza", "Enmanuel"));
    }
}
