package com.example.webview

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

@SuppressLint("SetJavaScriptEnabled")
class MyWebView constructor(context: Context) : WebView(context) {

    init {
        isFocusable = false
        isFocusableInTouchMode = false
        settings.javaScriptEnabled = true
        settings.mediaPlaybackRequiresUserGesture = false
        settings.loadWithOverviewMode = true
        settings.javaScriptCanOpenWindowsAutomatically = true;
        settings.useWideViewPort = true

        settings.allowFileAccess = true
        settings.pluginState = WebSettings.PluginState.ON
        settings.pluginState = WebSettings.PluginState.ON_DEMAND
        settings.domStorageEnabled = true
        settings.layoutAlgorithm = WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING
        settings.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW;
        webChromeClient = WebChromeClient()
        webViewClient = WebViewClient()

        setLayerType(View.LAYER_TYPE_NONE, null)


//        webViewClient = object : WebViewClient() {
//            override fun onPageFinished(view: WebView?, url: String?) {
//                super.onPageFinished(view, url)
//                loadUrl("javascript:(function() { document.getElementsByTagName('video')[0].play(); })()")
//            }
//        }
    }
}
