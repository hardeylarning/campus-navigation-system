package com.rocktech.campusnavigationsystem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {
    WebView map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        map = findViewById(R.id.map);
        WebSettings webSettings = map.getSettings();
        webSettings.setJavaScriptEnabled(true);
        map.loadUrl("https://www.google.com/maps/d/embed?mid=1-lg0XbOZyh6HtmtUGm5mEnFCjPbHTpWL&hl=en");
        map.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        finish();
        finishAffinity();
        System.exit(0);
       // super.onBackPressed();
    }
}
