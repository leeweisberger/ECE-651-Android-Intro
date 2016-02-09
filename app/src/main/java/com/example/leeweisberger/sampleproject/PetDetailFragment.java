package com.example.leeweisberger.sampleproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.leeweisberger.sampleproject.pets.Pet;

/**
 * A placeholder fragment containing a simple view.
 */
public class PetDetailFragment extends Fragment {

    public PetDetailFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_pet_detail, container, false);
        Pet pet = (Pet) getActivity().getIntent().getExtras().get(Pet.PET_INTENT);

        TextView petName = (TextView) v.findViewById(R.id.petNameAnswer);
        TextView petSound =(TextView) v.findViewById(R.id.petSoundAnswer);
        petName.setText(pet.getName());
        petSound.setText(pet.makeNoise());
        return v;
    }
}
