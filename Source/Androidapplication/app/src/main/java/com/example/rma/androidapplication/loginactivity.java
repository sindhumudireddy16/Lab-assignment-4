package com.example.rma.androidapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class loginactivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
    }

    public void onbuttonclick(View v) {
        if (v.getId() == R.id.blogin) ;
        {
            Intent i = new Intent(loginactivity.this,googleMapsActivity.class);
            startActivity(i);
        }
    }
    public void onregisterclick(View v) {
        if (v.getId() == R.id.bregister) ;
        {
            Intent i = new Intent(loginactivity.this,Registeractivity.class);
            startActivity(i);
        }
    }
}