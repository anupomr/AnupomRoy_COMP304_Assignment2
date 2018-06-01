package com.example.anupo.anupomroy_comp304_assignment2;
/*
 * Author:  Anupom Roy
 * Subject: Mobile Application Development
 * date:    May 27, 2018
 * Professor:Vinayagathas Vaithilingam
 * Lab:     LabAssignment 2
 * */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class AccessoriesActivity extends AppCompatActivity {
    String choice;
    CheckBox checkBoxPod,checkBoxEarPhone;
    //Intent checkOutIntent;
    Button btnBack,btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories);

        // Code for Back Button
        btnBack=(Button)findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AccessoriesActivity.this,SecondActivity.class));
            }
        });
        //Check Box
        checkBoxPod=(CheckBox)findViewById(R.id.airPods);
        checkBoxEarPhone=(CheckBox)findViewById(R.id.earPhone);

        //Code For Next Button
        btnNext=(Button)findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAccessory=new Intent(AccessoriesActivity.this, CustomerDetails.class);
                //intentAccessory.
                if (checkBoxPod.isChecked()){choice=checkBoxPod.getText().toString();}
                if (checkBoxEarPhone.isChecked()){choice+=checkBoxEarPhone.getText().toString();}
                intentAccessory.putExtra("choice",choice);
                startActivity(intentAccessory);
            }
        });
    }



}
