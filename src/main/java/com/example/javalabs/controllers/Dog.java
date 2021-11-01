package com.example.javalabs.controllers;
import com.example.javalabs.interfaces.IPet;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("Dog")
public class Dog implements IPet
{
    public Dog(){
        System.out.println("Пёс создан!");
    }
    @Override
    public void MakeASound(){
        System.out.println("Мой пёсель гавкает");
    }

    @Override
    @PostConstruct
    public void init(){
        System.out.println("Инициализация Пса");
    }
    @Override
    @PreDestroy
    public void destroy(){
        System.out.println("Удаление Пса");
    }
}