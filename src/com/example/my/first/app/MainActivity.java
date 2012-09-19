package com.example.my.first.app;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity extends Activity {  //file name and class name the same

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //ties layout to the activity_main.xml file (in res/layout folder)
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("http://www.stephenjose.com");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
