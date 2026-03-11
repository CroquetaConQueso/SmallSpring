package com.example.learnspringboot.aprendiendoSpring.repositories;


import com.example.learnspringboot.aprendiendoSpring.models.Cuenta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

//I need to establish a transaction so it doesn't crash due to the need of JPA to establish transactions.
@Repository
@Transactional
public class CuentaRepoJpa {
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Cuenta cuenta){
        entityManager.merge(cuenta);
    }

    public Cuenta findById(long id){
        return entityManager.find(Cuenta.class,id);
    }

    public void deleteById(long id){
        Cuenta cuenta = entityManager.find(Cuenta.class,id);
        entityManager.remove(cuenta);
    }
}
