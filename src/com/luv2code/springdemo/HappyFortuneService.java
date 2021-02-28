package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService{





    @Override
    public String getFortune() {
        String[] strings = {"Today is your lucky day", "We believe in you, don't stop!", "Don't stop now, and you'll be a winner"};
        int rnd = new Random().nextInt(strings.length);
        return strings[rnd];
    }
}
