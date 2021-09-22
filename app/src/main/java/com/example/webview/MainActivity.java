package com.example.webview;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView webView = new WebView(getBaseContext());
        setContentView(webView);
        webView.loadUrl("https://esii-orion.com/orion-display/assets/sounds/esii_call_sounds.mp3");

    }

}