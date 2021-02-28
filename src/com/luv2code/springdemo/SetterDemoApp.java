package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {

        // load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        //retrive bean from spring cotainer
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //calll methods on the bean
        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getDailyWorkout());


        // call our new methods
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());
        //close the context
        context.close();

    }
}
