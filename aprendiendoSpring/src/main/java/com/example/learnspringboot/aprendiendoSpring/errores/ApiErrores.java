package com.example.learnspringboot.aprendiendoSpring.errores;


public class ApiErrores extends Exception{
    public ApiErrores(String mensaje){
        super(mensaje);
    }
}
