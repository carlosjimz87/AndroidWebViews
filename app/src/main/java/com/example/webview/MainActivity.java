package com.example.webview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyWebView webView = new MyWebView(getBaseContext());
        setContentView(webView);
        webView.loadUrl("http://go-fit.es/");
//        webView.loadUrl("https://manager-pre.mygofitapp.com/landing/3fbf7961-5ffb-44ee-85a9-a533b2074146/capacity");

    }

}