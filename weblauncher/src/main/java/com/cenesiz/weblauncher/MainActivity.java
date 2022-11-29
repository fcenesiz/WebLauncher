package com.cenesiz.weblauncher;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent receivedIntent = getIntent();
        Uri uri = receivedIntent.getData();
        URL webPageUrl = null;

        if (uri != null){
            try {
                webPageUrl = new URL(
                        uri.getScheme(),
                        uri.getHost(),
                        uri.getPath()
                );
            } catch (MalformedURLException e) {
                Toast.makeText(
                        this,
                        "Intent exception occured",
                        Toast.LENGTH_LONG
                ).show();
            }
        }

        WebView webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(webPageUrl.toString());
    }
}