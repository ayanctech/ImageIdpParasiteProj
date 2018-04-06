package com.example.pritamghosh.protozoan_parasite;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jaredrummler.materialspinner.MaterialSpinner;

public class ScientificName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_name);
        MaterialSpinner spinner = (MaterialSpinner) findViewById(R.id.nmspn);
        spinner.setItems("Bovine", "Buffalo", "Cammel & Llama", "Dog,Cat & Fox", "Duck","Fowl","Goose","Horse","Man","Pig","Rodent","Rodent and Lagomorphs","Sheep & Goat");
        spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
