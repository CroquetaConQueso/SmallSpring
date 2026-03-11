package com.example.learnspringboot.aprendiendoSpring.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Curso2Repo {
    @Autowired
    private JdbcTemplate springJdbcTemplate;
    public void insert(){
        springJdbcTemplate.update("insert into curso(id,nombrecurso,nombreautor) values(1,'Podando Jardines','Luis')");
    }
}
