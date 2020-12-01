package ru.digitalleague.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class HelloService {


    public String helloSomething(String name){
        if(name.equals("Andrew")){
            return " Hello, Andrew!";
        }
        return "Who are you?";
    }

}
