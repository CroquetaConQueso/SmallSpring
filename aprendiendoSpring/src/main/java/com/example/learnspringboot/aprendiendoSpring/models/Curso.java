package com.example.learnspringboot.aprendiendoSpring.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre_curso")
    private String nombreCurso;
    @Column(name="nombre_autor")
    private String nombreAutor;
}
