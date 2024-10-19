package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App02HelloWorldSpring {

    public static void main(String[] args) {
        //launching the spring context using configuration class
        try (var context =
                     new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            // displaying the bean that has been created using spring context
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("myCustomAddress"));
            System.out.println(context.getBean("person2Parameter"));
            System.out.println(context.getBean(Address.class));
        }


    }
}
