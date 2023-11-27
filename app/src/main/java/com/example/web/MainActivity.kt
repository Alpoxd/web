package com.example.web

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.web)

        webView.loadUrl("https://ostroweb.ru/5word/index.html")

        webView.settings.javaScriptEnabled = true

        webView.webViewClient = WebViewClient()
    }
}