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
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CustomerDetails extends AppCompatActivity
{
public EditText txtName,txtAddress;
String name,address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_details);

        txtName=(EditText)findViewById(R.id.txtName);
        txtAddress=(EditText) findViewById(R.id.txtAddress);
        Button btnOrder=(Button)findViewById(R.id.btnOrder);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickOrder();
            }
        });
    }
    public void onClickOrder()
    {

        Intent intent = new Intent(CustomerDetails.this, CheckOutActivity.class);
        name= txtName.getText().toString();
        address=txtAddress.getText().toString();
        //assigning key to reference to the use input with putExtra
        intent.putExtra("Name",name);

        intent.putExtra("Address", address);
        /*intent.putExtra("PostalCode", posCode);
        intent.putExtra("Phone", phone);
        intent.putExtra("Type", payType);
        intent.putExtra("CardNumber", number);
        intent.putExtra("Date", date);*/
        String myAccessories = getIntent().getStringExtra("choice");
        intent.putExtra("choice",myAccessories);
        startActivity(intent);
    }
}
