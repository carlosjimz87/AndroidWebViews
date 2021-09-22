package com.example.webview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyWebView webView = new MyWebView(getBaseContext());
        setContentView(webView);
        webView.loadUrl("http://touchpianist.com/");

    }

}