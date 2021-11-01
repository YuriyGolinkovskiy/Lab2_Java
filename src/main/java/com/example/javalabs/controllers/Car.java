package com.example.javalabs.controllers;

import com.example.javalabs.interfaces.ICar;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("Car")
public class Car implements ICar {
    public Car(){
        System.out.println("Машина создана!");
    }
    @Override
    public void GoTo() {
        System.out.println("Едем куда-то на машине");
    }

    @Override
    public void GoTo(String path) {
        System.out.println("Ехать в " + path);
    }
    @Override
    @PostConstruct
    public void init(){
        System.out.println("Инициализация машины");
    }
    @Override
    @PreDestroy
    public void destroy(){
        System.out.println("Удаление машины");
    }
}
