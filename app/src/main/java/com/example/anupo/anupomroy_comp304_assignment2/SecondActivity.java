package com.example.anupo.anupomroy_comp304_assignment2;
/*
 * Author:  Anupom Roy
 * Subject: Mobile Application Development
 * date:    May 25, 2018
 * Professor:Vinayagathas Vaithilingam
 * Lab:     LabAssignment 2
 * */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String heading=getString(R.string.mainHeading);
        TextView textView=(TextView)findViewById(R.id.textViewSecond);
        textView.setText(heading);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.electronics, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.phone:
                Toast.makeText(this,"Desktop is selected",Toast.LENGTH_LONG).show();
                break;
            case R.id.laptop:

                Intent intent=new Intent(SecondActivity.this,iPhoneActivity.class);
                startActivity(intent);
                break;
            case R.id.tv:
                break;
            case R.id.printer:
                break;
            case R.id.accessories:
                break;

        }
        return true;
    }
}
