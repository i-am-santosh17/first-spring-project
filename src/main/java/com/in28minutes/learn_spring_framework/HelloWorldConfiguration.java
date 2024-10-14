package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age){};
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Santosh";
    }

    @Bean
    public int age(){
        return 17;
    }
    @Bean
    public Person person(){
        return new Person("Steve",23);
    }

}
