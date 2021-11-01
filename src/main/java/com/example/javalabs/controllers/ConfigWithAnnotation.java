package com.example.javalabs.controllers;

import com.example.javalabs.interfaces.IPet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class ConfigWithAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Employee employee = context.getBean("Employee", Employee.class);
        employee.CallMethods();
        System.out.print(employee.getName() + ", возраст:");
        System.out.println(employee.getAge());

        int count = 5;
        ArrayList<IPet> dogs = new ArrayList<IPet>(count);
        for (int i = 0; i < count;i++){
            dogs.add(context.getBean("Dog", Dog.class));
        }

        ArrayList<IPet> cats = new ArrayList<IPet>(count);
        for (int i = 0; i < count;i++){
            cats.add(context.getBean("Cat", Cat.class));
        }
        context.close();
    }
}
