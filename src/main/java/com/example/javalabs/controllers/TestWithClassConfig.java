package com.example.javalabs.controllers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestWithClassConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigWithoutXml.class);

        Employee employee = context.getBean("Employee", Employee.class);
        employee.CallMethods();
        System.out.println(employee.getName() + ", " + employee.getAge());

        context.close();
    }
}
