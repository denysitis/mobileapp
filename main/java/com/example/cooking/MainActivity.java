package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

import com.onesignal.OneSignal;

public class MainActivity extends AppCompatActivity {

    private long backPressedTime;
    private Toast backToast;

    protected WebView cookingplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId("192e7ffb-6aac-4495-9adc-041c275ad6a3");

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
    //Системна кнопка початок

    @Override
    public void onBackPressed() {

        if(backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            return;
        }else{
            backToast = Toast.makeText(getBaseContext(), "Натисність знову, щоб вийти", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }

    //Системна кнопка кінець
}
