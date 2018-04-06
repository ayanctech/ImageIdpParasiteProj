package com.example.pritamghosh.protozoan_parasite;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

public class GenusLevel extends AppCompatActivity {
    PopupWindow popupWindow;
    LinearLayout gl;
    Dialog mydialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genus_level);
        gl=findViewById(R.id.genus);
        mydialog = new Dialog(this);
    }

    public void plasmodium(View view){
        mydialog.setContentView(R.layout.plasmopop);
        Button bt1 = (Button) mydialog.findViewById(R.id.plus1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( GenusLevel.this, Plasmodium.class);
                startActivity(i);
                mydialog.dismiss();
            }
        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();


     /*   LayoutInflater layoutInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        final View view1= layoutInflater.inflate(R.layout.plasmopop,null);
       popupWindow = new PopupWindow(view1,400,300);
        popupWindow.showAtLocation(view, Gravity.CENTER,0,0);

        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        popupWindow.setOutsideTouchable(true);


        Button bt1=view1.findViewById(R.id.plus1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( GenusLevel.this, Plasmodium.class);
                startActivity(i);
                popupWindow.dismiss();
                gl.setVisibility(View.VISIBLE);
            }

        });

*/
    }

    public void carcocystis(View view) {

        mydialog.setContentView(R.layout.sarcopop);

        Button bt1=mydialog.findViewById(R.id.sarco1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( GenusLevel.this, Plasmodium.class);
                popupWindow.dismiss();
                startActivity(i);
            }
        });

        Button bt2=mydialog.findViewById(R.id.sarco2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( GenusLevel.this, Plasmodium.class);
                startActivity(i);
                popupWindow.dismiss();
            }
        });

        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }

    public void toxoplasma(View view) {
        mydialog.setContentView(R.layout.toxopop);
        Button bt1=mydialog.findViewById(R.id.toxo1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( GenusLevel.this, Plasmodium.class);
                popupWindow.dismiss();
                startActivity(i);
            }
        });

        Button bt2=mydialog.findViewById(R.id.toxo2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( GenusLevel.this, Plasmodium.class);
                popupWindow.dismiss();
                startActivity(i);
            }
        });

        Button bt3=mydialog.findViewById(R.id.toxo3);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( GenusLevel.this, Plasmodium.class);
                popupWindow.dismiss();
                startActivity(i);
            }
        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();

    }


}
