package com.example.anupo.anupomroy_comp304_assignment2;

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
        String displayName =intent.getStringExtra("device");
        TextView textView=(TextView)findViewById(R.id.result);
        textView.setText(displayName);
    }
}
