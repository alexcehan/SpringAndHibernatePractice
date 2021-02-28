package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
        //load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrive bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);





        //call methods to the bean

       // System.out.println(theCoach.getDailyWorkout());



        //let's call our methods for fortunes
        System.out.println(theCoach.getDailyFortune());

        //close the context

        context.close();
    }
}
