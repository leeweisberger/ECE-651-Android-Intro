package com.example.leeweisberger.sampleproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.leeweisberger.sampleproject.pets.Pet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leeweisberger on 2/9/16.
 */
public class PetArrayAdapter extends ArrayAdapter<Pet> {

    private List<Pet> petList = new ArrayList<>();
    private Context context;

    public PetArrayAdapter(Context context ,List<Pet> petList) {
        super(context, -1, petList);
        this.context=context;
        this.petList=petList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.adaptor_pet, parent, false);
        TextView petName = (TextView) v.findViewById(R.id.petName);
//        TextView petSound = (TextView) rowView.findViewById(R.id.petSound);
        petName.setText(petList.get(position).getName());
        // change the icon for Windows and iPhone
        return v;
    }

}
