package com.example.leeweisberger.sampleproject.pets;

/**
 * Created by leeweisberger on 2/9/16.
 */
public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "Woof";
    }
}
