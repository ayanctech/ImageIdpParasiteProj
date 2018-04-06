package com.example.pritamghosh.protozoan_parasite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OptionsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_page);
    }

    public void GenusLevel (View view){

                Intent i = new Intent( OptionsPage.this, GenusLevel.class);
                startActivity(i);


    }

    public void ParasiteLevel (View view){

                Intent i = new Intent( OptionsPage.this, ParasiteLevel.class);
                startActivity(i);


    }

    public void Diagnosis (View view){

                Intent i = new Intent( OptionsPage.this, Diagnosis.class);
                startActivity(i);

    }

    public void Treatment(View view){

                Intent i = new Intent( OptionsPage.this, Treatment.class);
                startActivity(i);


    }

    public void ScientificName(View view){

                Intent i = new Intent( OptionsPage.this, ScientificName.class);
                startActivity(i);


    }

    public void SpeciesLevel(View view){

                Intent i = new Intent( OptionsPage.this, SpeciesLevel.class);
                startActivity(i);


    }

    public void HostParasiteDatabase(View view){
                Intent i = new Intent( OptionsPage.this, HostParasiteDatabase.class);
                startActivity(i);

    }

    public void Acknowledgements (View view){

                Intent i = new Intent( OptionsPage.this, Acknowledgements.class);
                startActivity(i);


    }

    public void References (View view){
                Intent i = new Intent( OptionsPage.this, References.class);
                startActivity(i);


    }
}
