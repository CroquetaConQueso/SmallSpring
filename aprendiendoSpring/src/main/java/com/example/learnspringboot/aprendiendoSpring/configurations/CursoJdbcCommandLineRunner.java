package com.example.learnspringboot.aprendiendoSpring.configurations;

import com.example.learnspringboot.aprendiendoSpring.models.Cuenta;
import com.example.learnspringboot.aprendiendoSpring.models.Curso;
import com.example.learnspringboot.aprendiendoSpring.repositories.CuentaRepo2Jpa;
import com.example.learnspringboot.aprendiendoSpring.repositories.Curso2Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

//Nos permite establecer configuraciones en Spring al iniciar la ejecucion de este como seria la auto insercion de un valor

/*
@Component
public class CursoJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private Curso2Repo crepository;

    @Autowired
    private CuentaRepo2Jpa cuentaRep;

    @Override
    public void run(String... args) throws Exception {
        crepository.insert(new Curso(1L,"Podando Jardines","Luis"));
        crepository.insert(new Curso(2L,"Podando Jardines 2","Luis Carlos"));
        crepository.insert(new Curso(3L,"Comiendo queso","Marco"));

        crepository.delete(1L);


    }
}*/
