package com.example.pritamghosh.protozoan_parasite;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class popup_layout extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_layout);

        LinearLayout lout=findViewById(R.id.plout);

        Button bt1=findViewById(R.id.morpho);
        Button bt2=findViewById(R.id.patho);
        Button bt3=findViewById(R.id.immun);
        Button bt4=findViewById(R.id.lifec);



        final Intent intent2=new Intent(popup_layout.this,Plasmodium.class);

        final Intent intent=getIntent();
        final int id=intent.getIntExtra("id",1);
     switch(id){
            case 1:
                bt1.setVisibility(View.GONE);
                bt2.setVisibility(View.GONE);
                bt3.setVisibility(View.VISIBLE);
                bt4.setVisibility(View.GONE);
                lout.setBackgroundColor(getResources().getColor(R.color.plusc));
                break;
                case 2:
                bt1.setVisibility(View.GONE);
                bt2.setVisibility(View.VISIBLE);
                bt3.setVisibility(View.GONE);
                bt4.setVisibility(View.VISIBLE);
                lout.setBackgroundColor(getResources().getColor(R.color.sarc));
                break;
                case 3:
                bt1.setVisibility(View.VISIBLE);
                bt2.setVisibility(View.VISIBLE);
                bt3.setVisibility(View.VISIBLE);
                bt4.setVisibility(View.GONE);
                lout.setBackgroundColor(getResources().getColor(R.color.toxc));
                break;
                case 4:
                bt1.setVisibility(View.GONE);
                bt2.setVisibility(View.VISIBLE);
                bt3.setVisibility(View.GONE);
                bt4.setVisibility(View.VISIBLE);
                lout.setBackgroundColor(getResources().getColor(R.color.leuc));
                break;
                case 5:
                bt1.setVisibility(View.VISIBLE);
                bt2.setVisibility(View.VISIBLE);
                bt3.setVisibility(View.VISIBLE);
                bt4.setVisibility(View.VISIBLE);
                lout.setBackgroundColor(getResources().getColor(R.color.besc));
                break;
                case 6:
                bt1.setVisibility(View.VISIBLE);
                bt2.setVisibility(View.VISIBLE);
                bt3.setVisibility(View.GONE);
                bt4.setVisibility(View.VISIBLE);
                lout.setBackgroundColor(getResources().getColor(R.color.haemc));
                break;
                case 7:
                bt1.setVisibility(View.VISIBLE);
                bt2.setVisibility(View.VISIBLE);
                bt3.setVisibility(View.VISIBLE);
                bt4.setVisibility(View.VISIBLE);
                lout.setBackgroundColor(getResources().getColor(R.color.thelc));
                break;
                case 8:
                bt1.setVisibility(View.VISIBLE);
                bt2.setVisibility(View.VISIBLE);
                bt3.setVisibility(View.VISIBLE);
                bt4.setVisibility(View.VISIBLE);
                lout.setBackgroundColor(getResources().getColor(R.color.cocc));
                break;
                case 9:
                bt1.setVisibility(View.GONE);
                bt2.setVisibility(View.GONE);
                bt3.setVisibility(View.GONE);
                bt4.setVisibility(View.VISIBLE);
                lout.setBackgroundColor(getResources().getColor(R.color.babc));
                break;
                case 10:
                bt1.setVisibility(View.VISIBLE);
                bt2.setVisibility(View.GONE);
                bt3.setVisibility(View.GONE);
                bt4.setVisibility(View.GONE);
                lout.setBackgroundColor(getResources().getColor(R.color.tryc));
                break;
                case 11:
                bt1.setVisibility(View.GONE);
                bt2.setVisibility(View.GONE);
                bt3.setVisibility(View.VISIBLE);
                bt4.setVisibility(View.GONE);
                lout.setBackgroundColor(getResources().getColor(R.color.leisc));
                break;

        }

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(popup_layout.this,"button clicked" + id,Toast.LENGTH_SHORT).show();
                intent2.putExtra("id",id);
                startActivity(intent2);
                finish();

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent2.putExtra("id",id);

                startActivity(intent2);
                finish();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(popup_layout.this,"button clicked" + id,Toast.LENGTH_SHORT).show();
                intent2.putExtra("id",id);
                startActivity(intent2);
                finish();

            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent2.putExtra("id",id);
                startActivity(intent2);
                finish();
            }
        });
    }



}
