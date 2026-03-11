package com.example.learnspringboot.aprendiendoSpring.repositories;

import com.example.learnspringboot.aprendiendoSpring.models.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Curso2Repo {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String insertCursoQuery = "insert into curso(id,nombre_curso,nombre_autor) values(?,?,?)";
    private static String deleteCursoQuery = "delete from curso where id=?";

    public void insert(Curso curso){
        springJdbcTemplate.update(insertCursoQuery,curso.getId(),curso.getNombreCurso(),curso.getNombreAutor());
    }

    public void delete(Long id){
        springJdbcTemplate.update(deleteCursoQuery,id);
    }
}
