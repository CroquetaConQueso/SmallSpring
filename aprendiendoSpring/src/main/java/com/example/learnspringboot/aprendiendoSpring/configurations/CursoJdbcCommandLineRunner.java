package com.example.learnspringboot.aprendiendoSpring.configurations;

import com.example.learnspringboot.aprendiendoSpring.repositories.Curso2Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//Nos permite establecer configuraciones en Spring al iniciar la ejecucion de este como seria la auto insercion de un valor
@Component
public class CursoJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private Curso2Repo crepository;

    @Override
    public void run(String... args) throws Exception {
        crepository.insert();
    }
}
