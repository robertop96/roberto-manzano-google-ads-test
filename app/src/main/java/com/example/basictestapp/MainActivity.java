package com.example.basictestapp;

import androidx.appcompat.app.AppCompatActivity;
//Initialize the Google Mobile Ads SDK
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private AdManagerAdView mAdManagerAdView;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize the Google Mobile Ads SDK
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

//        // Loads and Ad
//        mAdManagerAdView = findViewById(R.id.adManagerAdView);
//        AdManagerAdRequest adRequest = new AdManagerAdRequest.Builder().build();
//        mAdManagerAdView.loadAd(adRequest);

        //WithMcM Button Variable
        Button buttonBannerNoMCM = (Button) findViewById(R.id.buttonBannerNoMCM);

        //WithMcM Button Variable
        Button buttonBannerWithMCM = (Button) findViewById(R.id.buttonBannerWithMCM);

        // Shows Ad Banner with a Ad Unit Id Without MCM code.
        buttonBannerNoMCM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Requests the withoutMcm ad from Main Activity.
                mAdManagerAdView = findViewById(R.id.withoutMcm);
                AdManagerAdRequest adRequest = new AdManagerAdRequest.Builder().build();
                // Loads the the Main Activity Ad
                mAdManagerAdView.loadAd(adRequest);
            }
        });

        // Shows Ad Banner with a Ad Unit Id Without MCM code.
        buttonBannerWithMCM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Requests the withMcm ad from Main Activity.
                mAdManagerAdView = findViewById(R.id.withMcm);
                AdManagerAdRequest adRequest = new AdManagerAdRequest.Builder().build();
                // Loads the the Main Activity Ad
                mAdManagerAdView.loadAd(adRequest);
            }
        });
    }
}