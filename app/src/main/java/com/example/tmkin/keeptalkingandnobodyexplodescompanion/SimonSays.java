package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SimonSays extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simon_says);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }



    public void Pressbuttonblue(View v){
        Log.d("ID", "Test1");
        UpdateButton("blue");

    }
    public void Pressbuttonyellow(View v){


    }
    public void Pressbuttongreen(View v){


    }
    public void Pressbuttonred(View v){


    }
    public void UpdateButton(String Color){
        Log.d("ID", "Test");
        FloatingActionButton userone = (FloatingActionButton) findViewById(R.id.btnuser1);
        FloatingActionButton usertwo = (FloatingActionButton) findViewById(R.id.btnuser2);
        FloatingActionButton userthree = (FloatingActionButton) findViewById(R.id.btnuser3);
        FloatingActionButton userfour = (FloatingActionButton) findViewById(R.id.btnuser4);
        FloatingActionButton userfive = (FloatingActionButton) findViewById(R.id.btnuser5);
        FloatingActionButton keyone = (FloatingActionButton) findViewById(R.id.btnkey1);
        FloatingActionButton keytwo = (FloatingActionButton) findViewById(R.id.btnkey2);
        FloatingActionButton keythree = (FloatingActionButton) findViewById(R.id.btnkey3);
        FloatingActionButton keyfour = (FloatingActionButton) findViewById(R.id.btnkey4);
        FloatingActionButton keyfive = (FloatingActionButton) findViewById(R.id.btnkey5);

        Log.d("ID", "Test");
        if (userone.getVisibility() == View.VISIBLE){
            keyone.setBackgroundColor(0xFFFFFFFF);
        }








    }


}
