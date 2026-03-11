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

    @Column(name="nombrecurso")
    private String nombreCurso;
    @Column(name="nombreautor")
    private String nombreAutor;
}
