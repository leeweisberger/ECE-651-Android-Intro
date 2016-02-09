package com.example.leeweisberger.sampleproject.pets;

/**
 * Created by leeweisberger on 2/9/16.
 */
public class Bird extends Pet {
    public Bird(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "Tweet";
    }
}
