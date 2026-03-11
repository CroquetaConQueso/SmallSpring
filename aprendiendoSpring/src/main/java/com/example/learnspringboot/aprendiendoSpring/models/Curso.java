package com.example.learnspringboot.aprendiendoSpring.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {
    private Long id;
    private String nombreCurso;
    private String nombreAutor;
}
