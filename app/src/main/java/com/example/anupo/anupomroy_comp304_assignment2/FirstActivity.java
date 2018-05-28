package com.example.anupo.anupomroy_comp304_assignment2;
/*
 * Author:  Anupom Roy
 * Subject: Mobile Application Development
 * date:    May 25, 2018
 * Professor:Vinayagathas Vaithilingam
 * Lab:     LabAssignment 2
 * */
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        // Image for Home Screen
        BitmapDrawable bmpDrawable=(BitmapDrawable)getResources().getDrawable(R.drawable.electronics);
        ImageView imageView=(ImageView)findViewById(R.id.mainImageView);
        imageView.setImageDrawable(bmpDrawable);
    }
}
