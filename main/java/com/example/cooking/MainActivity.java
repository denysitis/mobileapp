package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    protected WebView cookingplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init
        cookingplay = (WebView) findViewById(R.id.cookingplay);

        //settings
        cookingplay.setInitialScale(1);
        cookingplay.getSettings().setUseWideViewPort(true);
        cookingplay.getSettings().setJavaScriptEnabled(true);
        cookingplay.getSettings().setLoadWithOverviewMode(true);
        cookingplay.getSettings().setAllowContentAccess(true);
        cookingplay.getSettings().setDomStorageEnabled(true);
        cookingplay.getSettings().setAllowFileAccessFromFileURLs(true);
        cookingplay.getSettings().setAllowUniversalAccessFromFileURLs(true);

        //loading
        cookingplay.loadUrl("file:///android_asset/cookingplay/index.html");
    }
}
