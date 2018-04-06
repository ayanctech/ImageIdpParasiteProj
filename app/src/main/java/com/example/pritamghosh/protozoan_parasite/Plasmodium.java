package com.example.pritamghosh.protozoan_parasite;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class Plasmodium extends AppCompatActivity {
    int id;
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static final Integer[] XMEN= {R.drawable.plasimm1,R.drawable.plasimm2,R.drawable.plasimm3,R.drawable.plasimm4,R.drawable.plasimm5,R.drawable.plasimm6};
    private ArrayList<Integer> XMENArray = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plasmodium);

        Intent intent=getIntent();
        id=intent.getIntExtra("id",1);
        Toast.makeText(getApplicationContext(),"ID is "+id,Toast.LENGTH_SHORT).show();
        init();
    }
    private void init() {
        for(int i=0;i<XMEN.length;i++)
            XMENArray.add(XMEN[i]);

        mPager = (ViewPager) findViewById(R.id.viewpager);
        mPager.setAdapter(new SlidingImage_Adapter(Plasmodium.this,XMENArray));
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(mPager);

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == XMEN.length) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 9500, 12500);
    }
}
