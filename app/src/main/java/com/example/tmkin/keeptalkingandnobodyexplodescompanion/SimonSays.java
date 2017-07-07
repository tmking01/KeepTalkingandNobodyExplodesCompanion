package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.HideReturnsTransformationMethod;
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

    public void Pressbuttonone(View v){
        FindColor("blue", 0);
        FloatingActionButton btn = (FloatingActionButton) findViewById(R.id.btnuser1);
        btn.hide();
    }
    public void Pressbuttontwo(View v){
        FindColor("blue", 0);

    }
    public void Pressbuttonthree(View v){
        FindColor("blue", 0);

    }
    public void Pressbuttonfour(View v){
        FindColor("blue", 0);

    }
    public void Pressbuttonfive(View v){
        FindColor("blue", 0);

    }



    public void Pressbuttonblue(View v){
        FindColor("blue", 0);

    }
    public void Pressbuttonyellow(View v){


    }
    public void Pressbuttongreen(View v){


    }
    public void Pressbuttonred(View v){


    }
    public String FindColor(String Color, Integer Strikes) {
        String Newcolor = "";

        if (1 == 1) {
            switch (Color) {
                case "blue":
                    if (Strikes == 0) {
                        Newcolor = "red";
                    } else if (Strikes == 1) {
                        Newcolor = "green";
                    } else if (Strikes == 2) {
                        Newcolor = "red";
                    }
                    break;
                case "yellow":
                    if (Strikes == 0) {
                        Newcolor = "green";
                    } else if (Strikes == 1) {
                        Newcolor = "red";
                    } else if (Strikes == 2) {
                        Newcolor = "blue";
                    }
                    break;
                case "green":
                    if (Strikes == 0) {
                        Newcolor = "yellow";
                    } else if (Strikes == 1) {
                        Newcolor = "blue";
                    } else if (Strikes == 2) {
                        Newcolor = "yellow";
                    }
                    break;
                case "red":
                    if (Strikes == 0) {
                        Newcolor = "blue";
                    } else if (Strikes == 1) {
                        Newcolor = "yellow";
                    } else if (Strikes == 2) {
                        Newcolor = "green";
                    }
                    break;
            }
        } else {
            switch (Color) {
                case "blue":
                    if (Strikes == 0) {
                        Newcolor = "yellow";
                    } else if (Strikes == 1) {
                        Newcolor = "blue";
                    } else if (Strikes == 2) {
                        Newcolor = "green";
                    }
                    break;
                case "yellow":
                    if (Strikes == 0) {
                        Newcolor = "red";
                    } else if (Strikes == 1) {
                        Newcolor = "green";
                    } else if (Strikes == 2) {
                        Newcolor = "red";
                    }
                    break;
                case "green":
                    if (Strikes == 0) {
                        Newcolor = "green";
                    } else if (Strikes == 1) {
                        Newcolor = "yellow";
                    } else if (Strikes == 2) {
                        Newcolor = "blue";
                    }
                    break;
                case "red":
                    if (Strikes == 0) {
                        Newcolor = "blue";
                    } else if (Strikes == 1) {
                        Newcolor = "red";
                    } else if (Strikes == 2) {
                        Newcolor = "yellow";
                    }
                    break;
            }
        }
        return Newcolor;
    }
}
