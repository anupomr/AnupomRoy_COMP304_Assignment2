package com.example.anupo.anupomroy_comp304_assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class iPhoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_phone);
    }
    CheckBox checkBoxPod;
    public void checkOut(View view){
        //Initialize Edit text object

    checkBoxPod = (CheckBox) findViewById(R.id.airPods);

    String strAirpods = checkBoxPod.getText().toString();
    Intent intent = new Intent(iPhoneActivity.this, CheckOutActivity.class);
    intent.putExtra("device", strAirpods);
    startActivity(intent);

    }
}
