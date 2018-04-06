package com.example.pritamghosh.protozoan_parasite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Diagnosis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis);

        WebView myWebView = findViewById(R.id.refwv);
        myWebView.loadUrl("file:///android_asset/proj-html/index1.html");
    }
}
