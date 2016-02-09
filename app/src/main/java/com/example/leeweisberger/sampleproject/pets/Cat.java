package com.example.leeweisberger.sampleproject.pets;

/**
 * Created by leeweisberger on 2/9/16.
 */
public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "Meow";
    }
}
