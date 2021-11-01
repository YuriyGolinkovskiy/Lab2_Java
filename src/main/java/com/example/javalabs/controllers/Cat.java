package com.example.javalabs.controllers;

import com.example.javalabs.interfaces.IPet;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("Cat")
@Scope("prototype")
public class Cat implements IPet
{
    public Cat(){
        System.out.println("Кыця создана!");
    }
    @Override
    public void MakeASound(){
        System.out.println("Моя кыця мурлыкает");
    }
    @Override
    @PostConstruct
    public void init(){
        System.out.println("Инициализация Кыци");
    }
    @Override
    @PreDestroy
    public void destroy(){
        System.out.println("Удаление Кыци");
    }
}
