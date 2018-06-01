package com.example.anupo.anupomroy_comp304_assignment2;
/*
 * Author:  Anupom Roy
 * Subject: Mobile Application Development
 * date:    May 30, 2018
 * Professor:Vinayagathas Vaithilingam
 * Lab:     LabAssignment 2
 * */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class iPhoneActivity extends AppCompatActivity {

    Button btnBack,btnNext;
    CheckBox iphone6, iphone7, iphone8,iphone9;
    String choice;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_phone);
        //CheckBox
        iphone6=(CheckBox)findViewById(R.id.iPhone6);
        iphone7=(CheckBox)findViewById(R.id.iPhone7);
        iphone8=(CheckBox)findViewById(R.id.iPhone8);
        iphone9=(CheckBox)findViewById(R.id.iPhone9);
        // For Back Button
        btnBack=(Button)findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(iPhoneActivity.this,CellPhoneActivity.class));
            }
        });
        //For Check Box

        //For Next button
        btnNext=(Button)findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(iPhoneActivity.this, CustomerDetails.class);
                if (iphone6.isChecked()){choice=iphone6.getText().toString();}
                if (iphone7.isChecked()){choice+="\n"+iphone7.getText().toString();}
                if (iphone8.isChecked()){choice+=iphone8.getText().toString();}
                if (iphone9.isChecked()){choice+=iphone9.getText().toString();}
                intent.putExtra("choice",choice);
                startActivity(intent);
            }
        });
    }


}
