package com.example.anupo.anupomroy_comp304_assignment2;
/*
 * Author:  Anupom Roy
 * Subject: Mobile Application Development
 * date:    May 28, 2018
 * Professor:Vinayagathas Vaithilingam
 * Lab:     LabAssignment 2
 * */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CheckOutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);
        //initializing getintent
        Intent intent=getIntent();
        String nameString="Thanks "+getIntent().getStringExtra("Name");
        String addressString=" for ordering.\nYour Mailing Address :"+getIntent().getStringExtra("Address");
        String resultString=" \nYour order :"+getIntent().getStringExtra("choice");

        TextView textView=(TextView)findViewById(R.id.result);
        textView.setText(nameString+"\n"+addressString+"\n"+resultString+"\n Order will take three business day to deliver");
    }
}
