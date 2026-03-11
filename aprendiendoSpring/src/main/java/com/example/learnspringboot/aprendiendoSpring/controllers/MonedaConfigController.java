package com.example.learnspringboot.aprendiendoSpring.controllers;

import com.example.learnspringboot.aprendiendoSpring.configurations.ServicioMonedaConfiguracion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/moneda")
public class MonedaConfigController {
    //The component that we have registered/Injected in Spring gets Autowired
    @Autowired
    private ServicioMonedaConfiguracion configMoneda;

    @GetMapping("/configuracion")
    public ServicioMonedaConfiguracion retrieveConfig(){
        return configMoneda;
    }
}
