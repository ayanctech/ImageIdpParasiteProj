package com.example.pritamghosh.protozoan_parasite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SpeciesLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_species_level);
    }

    public void apicomplexas(View view) {
        startActivity(new Intent(getApplicationContext(),Apicomplexa.class));
    }
}
