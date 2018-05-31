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
    CheckBox checkBoxPod;
    Intent checkOutIntent;
    Button btnBack,btnCheckout;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories);

        btnBack=(Button)findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AccessoriesActivity.this,SecondActivity.class));
            }
        });
    }


    public void onCheckboxClicked(View view)
    {
        boolean checked=((CheckBox)view).isChecked();
        switch (view.getId()){
            case R.id.airPods:
                if (checked) { checkOutIntent.putExtra("accessories","Air Pods");}
                break;
            case R.id.earPhone:
                if (checked){checkOutIntent.putExtra("accessories","Ear Phone");}
                break;
            case R.id.headPhone:
                if (checked){checkOutIntent.putExtra("accessories","Head Phone");}
                break;
            case  R.id.crgPad:
                if (checked){checkOutIntent.putExtra("accessories","Charging Pad");}
                break;
            case  R.id.leCase:
                if (checked){checkOutIntent.putExtra("accessories","Leather Case");}
            break;

        }
    }
    public void checkOut(View view)
    {
        if (view.getId()==R.id.chkOut) {
            checkOutIntent=new Intent(AccessoriesActivity.this,CustomerDetails.class);
            //onCheckboxClicked(view);
            String acc =getIntent().getStringExtra("acc");
            checkOutIntent.putExtra("Item",acc);
            startActivity(checkOutIntent);
        }

    }
}
