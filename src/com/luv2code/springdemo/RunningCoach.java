package com.luv2code.springdemo;

public class RunningCoach  implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Run today a 20k!";
    }

    @Override
    public String getDailyFortune() {
        return "Happy 20k!";
    }
}
