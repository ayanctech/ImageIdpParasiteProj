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
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genus_level);
        gl=findViewById(R.id.genus);
        mydialog = new Dialog(this);
        intent=new Intent(getApplicationContext(),popup_layout.class);
    }

/*    public void plasmodium(View view){
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


    public void leucocytozoon(View view) {

            mydialog.setContentView(R.layout.lecopop);

            Button bt1=mydialog.findViewById(R.id.leuco1);
            bt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent( GenusLevel.this, Plasmodium.class);
                    popupWindow.dismiss();
                    startActivity(i);
                }
            });

            Button bt2=mydialog.findViewById(R.id.leuco2);
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

    public void besnoitia(View view) {
        mydialog.setContentView(R.layout.besnopop);
        Button bt1=mydialog.findViewById(R.id.besno1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( GenusLevel.this, Plasmodium.class);
                popupWindow.dismiss();
                startActivity(i);
            }
        });

        Button bt2=mydialog.findViewById(R.id.besno2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( GenusLevel.this, Plasmodium.class);
                popupWindow.dismiss();
                startActivity(i);
            }
        });

        Button bt3=mydialog.findViewById(R.id.besno3);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( GenusLevel.this, Plasmodium.class);
                popupWindow.dismiss();
                startActivity(i);
            }
        });
        Button bt4=mydialog.findViewById(R.id.besno4);
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

    public void haemoproteus(View view) {
        mydialog.setContentView(R.layout.haemopop);
        Button bt1=mydialog.findViewById(R.id.haemo1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( GenusLevel.this, Plasmodium.class);
                popupWindow.dismiss();
                startActivity(i);
            }
        });

        Button bt2=mydialog.findViewById(R.id.haemo2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( GenusLevel.this, Plasmodium.class);
                popupWindow.dismiss();
                startActivity(i);
            }
        });

        Button bt3=mydialog.findViewById(R.id.haemo3);
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

    public void coccidia(View view) {
        mydialog.setContentView(R.layout.cocpop);
        Button bt1=mydialog.findViewById(R.id.coco1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( GenusLevel.this, Plasmodium.class);
                popupWindow.dismiss();
                startActivity(i);
            }
        });

        Button bt2=mydialog.findViewById(R.id.coco2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( GenusLevel.this, Plasmodium.class);
                popupWindow.dismiss();
                startActivity(i);
            }
        });

        Button bt3=mydialog.findViewById(R.id.coco3);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( GenusLevel.this, Plasmodium.class);
                popupWindow.dismiss();
                startActivity(i);
            }
        });
        Button bt4=mydialog.findViewById(R.id.coco4);
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

    */

    public void plasmodium(View view){
        intent.putExtra("id",1);
        startActivity(intent);
    }
    public void carcocystis(View view){
        intent.putExtra("id",2);
        startActivity(intent);
    }
    public void toxoplasma(View view){
        intent.putExtra("id",3);
        startActivity(intent);
    }
    public void leucocytozoon(View view){
        intent.putExtra("id",4);
        startActivity(intent);
    }
    public void besnoitia(View view){
        intent.putExtra("id",5);
        startActivity(intent);
    }
    public void haemoproteus(View view){
        intent.putExtra("id",6);
        startActivity(intent);
    }

    public void theileria(View view) {
        intent.putExtra("id",7);
        startActivity(intent);
    }
    public void coccidia(View view){
        intent.putExtra("id",8);
        startActivity(intent);
    }

    public void babesia(View view) {
        intent.putExtra("id",9);
        startActivity(intent);
    }


    public void trypanosoma(View view) {
        intent.putExtra("id",10);
        startActivity(intent);
    }

    public void leishmania(View view) {
        intent.putExtra("id",11);
        startActivity(intent);
    }


}
