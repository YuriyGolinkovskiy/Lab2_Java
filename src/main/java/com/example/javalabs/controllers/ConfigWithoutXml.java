package com.example.javalabs.controllers;

import com.example.javalabs.interfaces.ICar;
import com.example.javalabs.interfaces.IPet;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")

public class ConfigWithoutXml {
    @Bean
    @Scope("singleton")
    public IPet Dog(){
        return new Dog();
    }
    @Bean
    public ICar Car(){
        return new Car();
    }
    @Bean
    public Employee Employee(){
        return new Employee(Dog());
    }
}
