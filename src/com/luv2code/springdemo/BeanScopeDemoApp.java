package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        // load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");


        //retrive bean from spring container

        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if are the same beans

        boolean result = (theCoach == alphaCoach);

        System.out.println(result);

        System.out.println("The memory location for theCoach " + theCoach);

        System.out.println("The memory location for alphaCoach" + alphaCoach);


        //close the context

        context.close();
    }
}
