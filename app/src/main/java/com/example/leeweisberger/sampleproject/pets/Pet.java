package com.example.leeweisberger.sampleproject.pets;

import java.io.Serializable;

/**
 * Created by leeweisberger on 2/9/16.
 */
public abstract class Pet implements Serializable{
    public final static String PET_INTENT = "PET_INTENT";
    private String name;

    public Pet(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public abstract String makeNoise();
}
