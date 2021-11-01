package com.example.javalabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@SpringBootApplication
@RestController
public class JavaLabsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaLabsApplication.class, args);

    }
    @GetMapping("/hello")
    public String Hello(@RequestParam(value = "param", defaultValue = "world") String param){
        return "Hello " + param;
    }
    @GetMapping("/about")
    public String About(){
        return "about us";
    }
    @GetMapping("/options")
    //public String Options(@RequestParam(required = false) String param){
    public String Options(@RequestParam Optional<String> param){
        /*String str = "";
        if(param == null){
            str = "options";
        }
        else{
            str = "not an option";
        }*/

        return param.isEmpty() ?  "options" : "not an option";
    }

}
