package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age,Address address){};
record Address(String firstLine,String city){};
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
        return new Person("Steve",23,new Address("Baker street","Pune"));
    }
    @Bean(name = "myCustomAddress")
    Address address(){
        return new Address("Baker street","Pune");
    }

    @Bean
    Person person2Parameter(String name,int age,Address myCustomAddress){
        return new Person(name,age,myCustomAddress);
    }

}
