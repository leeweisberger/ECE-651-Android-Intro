package com.example.leeweisberger.sampleproject.pets;

/**
 * Created by leeweisberger on 2/9/16.
 */
public class Pig extends Pet {

    public Pig(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "Oink";
    }
}
