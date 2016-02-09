package com.example.leeweisberger.sampleproject;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.leeweisberger.sampleproject.pets.Bird;
import com.example.leeweisberger.sampleproject.pets.Cat;
import com.example.leeweisberger.sampleproject.pets.Dog;
import com.example.leeweisberger.sampleproject.pets.Pet;
import com.example.leeweisberger.sampleproject.pets.Pig;

import java.util.ArrayList;

/**
 * Created by leeweisberger on 2/9/16.
 */
public class PetListViewFragment extends ListFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Pet dog = new Dog("Fido");
        Pet cat = new Cat("Tiger");
        Pet bird = new Bird("Tweety");
        Pet pig = new Pig("Babe");

        final ArrayList<Pet> list = new ArrayList<Pet>();

        list.add(dog);
        list.add(cat);
        list.add(bird);
        list.add(pig);

        final PetArrayAdapter adapter = new PetArrayAdapter(this.getActivity(), list);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        final Pet item = (Pet) l.getItemAtPosition(position);
        Intent i = new Intent(getActivity(), PetDetailActivity.class);
        i.putExtra(Pet.PET_INTENT,item);
        startActivity(i);
    }
}

