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
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class CellPhoneActivity extends AppCompatActivity {

    Button btnBack,btnNext;
    RadioGroup radioGroupCell;
    RadioButton radioButtoniPhone, radioButtonSamsung,radioButtonBlackBerry,radioButtonGoogle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cell_phone);
        //For Radio Button
        radioGroupCell=(RadioGroup)findViewById(R.id.radioGroupCell);
        radioGroupCell.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {

                radioButtoniPhone=(RadioButton)findViewById(R.id.iPhone);
                radioButtonSamsung=(RadioButton)findViewById(R.id.samsung);
                radioButtonBlackBerry=(RadioButton)findViewById(R.id.blackBerry);
                radioButtonGoogle=(RadioButton)findViewById(R.id.google);
                if(radioButtoniPhone.isChecked())
                {
                    startActivity(new Intent(CellPhoneActivity.this,iPhoneActivity.class));
                }
                else if(radioButtonSamsung.isChecked())
                {
                    startActivity(new Intent(CellPhoneActivity.this,SamsungActivity.class));
                }
                else if(radioButtonBlackBerry.isChecked())
                {
                    startActivity(new Intent(CellPhoneActivity.this,BlackBerryActivity.class));
                }
                else if(radioButtonGoogle.isChecked())
                {
                    startActivity(new Intent(CellPhoneActivity.this,GoogleActivity.class));
                }
                else
                    {
                        startActivity(new Intent(CellPhoneActivity.this,LgActivity.class));
                }
            }
        });

        btnNext=(Button)findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CellPhoneActivity.this,iPhoneActivity.class));
            }
        });
        btnBack = (Button)findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(CellPhoneActivity.this,SecondActivity.class));
            }
        });
    }
}
