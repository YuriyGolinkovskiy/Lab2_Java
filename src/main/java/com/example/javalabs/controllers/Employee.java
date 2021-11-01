package com.example.javalabs.controllers;

import com.example.javalabs.interfaces.ICar;
import com.example.javalabs.interfaces.IPet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("Employee")
public class Employee {
    private IPet pet;
    private ICar car;
    @Value("${employee.name}")
    private String name;
    @Value("${employee.age}")
    private int age;
    @Value("${car.path}")
    private String path;

    @Autowired
    public Employee(@Qualifier("Dog") IPet pet){
        System.out.println("Работник создан!");
        System.out.println("Работник установил Питомца в конструкторе");
        this.pet = pet;
    }
    @Autowired
    public void setCar(ICar car){
        System.out.println("Работник установил Мащину в сеттере");
        this.car = car;
    }
    public void setName(String name){
        System.out.println("Работник установил Имя в сеттере");
        this.name = name;
    }
    public void setAge(int age){
        System.out.println("Работник установил Возраст в сеттере");
        this.age = age;
    }
    public void setPath(String path){
        this.path = path;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){ return this.age; }

    public void CallMethods(){
        pet.MakeASound();
        car.GoTo();
        car.GoTo(path);
    }
    @PostConstruct
    public void init(){
        System.out.println("Инициализация Работника");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Удаление Работника");
    }
}
