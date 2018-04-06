package com.example.pritamghosh.protozoan_parasite;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.jaredrummler.materialspinner.MaterialSpinner;

public class ParasiteLevel extends AppCompatActivity {
    String nam,orgn,imhost,flhost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parasite_level);

        EditText et1=findViewById(R.id.imhost);
        EditText et2=findViewById(R.id.flhost);
        imhost=et1.getText().toString();
        flhost=et1.getText().toString();

        MaterialSpinner spinner = (MaterialSpinner) findViewById(R.id.nmspn);
        spinner.setItems("Bovine", "Buffalo", "Cammel & Llama", "Dog,Cat & Fox", "Duck","Fowl","Goose","Horse","Man","Pig","Rodent","Rodent and Lagomorphs","Sheep & Goat");
        spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();
            }
        });




        MaterialSpinner spinner2 = (MaterialSpinner) findViewById(R.id.orgspn);
        spinner2.setItems("Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "Marshmallow");
        spinner2.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                orgn=item;
                Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menuinfo, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_name) {
            Toast.makeText(getApplicationContext(),"Work in Progress",Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
