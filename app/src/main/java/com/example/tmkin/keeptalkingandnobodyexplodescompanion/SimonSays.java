package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class SimonSays extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simon_says);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String Answer = "";
        Answer = getGlobals("ContainsVowel", Answer);
        Log.d("ID",Answer);


    }

    public void Strikes(View v) {
        Button strike = (Button) findViewById(R.id.btnStrikes);
        switch (strike.getText().toString()){
            case "0":
                strike.setText("1");
                Pressbuttonone(null);
                break;
            case "1":
                strike.setText("2");
                Pressbuttonone(null);
                break;
            case "2":
                strike.setText("0");
                Pressbuttonone(null);
                break;
        }
    }

    public void Pressbuttonone(View v){

        ImageButton btnone = (ImageButton) findViewById(R.id.btnuser1);
        btnone.setVisibility(View.INVISIBLE);
        Hidestuff((ImageButton) findViewById(R.id.btnuser1)
                , (ImageButton) findViewById(R.id.btnkey1)
                , (TextView) findViewById(R.id.lblcomplexone)
                ,(TextView) findViewById(R.id.eq1) );
        Hidestuff((ImageButton) findViewById(R.id.btnuser2)
                , (ImageButton) findViewById(R.id.btnkey2)
                , (TextView) findViewById(R.id.lbltwo)
                ,(TextView) findViewById(R.id.eq2) );
        Hidestuff((ImageButton) findViewById(R.id.btnuser3)
                , (ImageButton) findViewById(R.id.btnkey3)
                , (TextView) findViewById(R.id.lblthree)
                ,(TextView) findViewById(R.id.eq3) );
        Hidestuff((ImageButton) findViewById(R.id.btnuser4)
                , (ImageButton) findViewById(R.id.btnkey4)
                , (TextView) findViewById(R.id.lblfour)
                ,(TextView) findViewById(R.id.eq4) );
        Hidestuff((ImageButton) findViewById(R.id.btnuser5)
                , (ImageButton) findViewById(R.id.btnkey5)
                , (TextView) findViewById(R.id.lblfive)
                ,(TextView) findViewById(R.id.eq5) );

    }
    public void Pressbuttontwo(View v){
        Hidestuff((ImageButton) findViewById(R.id.btnuser2)
                , (ImageButton) findViewById(R.id.btnkey2)
                , (TextView) findViewById(R.id.lbltwo)
                ,(TextView) findViewById(R.id.eq2) );
        Hidestuff((ImageButton) findViewById(R.id.btnuser3)
                , (ImageButton) findViewById(R.id.btnkey3)
                , (TextView) findViewById(R.id.lblthree)
                ,(TextView) findViewById(R.id.eq3) );
        Hidestuff((ImageButton) findViewById(R.id.btnuser4)
                , (ImageButton) findViewById(R.id.btnkey4)
                , (TextView) findViewById(R.id.lblfour)
                ,(TextView) findViewById(R.id.eq4) );
        Hidestuff((ImageButton) findViewById(R.id.btnuser5)
                , (ImageButton) findViewById(R.id.btnkey5)
                , (TextView) findViewById(R.id.lblfive)
                ,(TextView) findViewById(R.id.eq5) );

    }
    public void Pressbuttonthree(View v){
        Hidestuff((ImageButton) findViewById(R.id.btnuser3)
                , (ImageButton) findViewById(R.id.btnkey3)
                , (TextView) findViewById(R.id.lblthree)
                ,(TextView) findViewById(R.id.eq3) );
        Hidestuff((ImageButton) findViewById(R.id.btnuser4)
                , (ImageButton) findViewById(R.id.btnkey4)
                , (TextView) findViewById(R.id.lblfour)
                ,(TextView) findViewById(R.id.eq4) );
        Hidestuff((ImageButton) findViewById(R.id.btnuser5)
                , (ImageButton) findViewById(R.id.btnkey5)
                , (TextView) findViewById(R.id.lblfive)
                ,(TextView) findViewById(R.id.eq5) );
    }
    public void Pressbuttonfour(View v){

        Hidestuff((ImageButton) findViewById(R.id.btnuser4)
                , (ImageButton) findViewById(R.id.btnkey4)
                , (TextView) findViewById(R.id.lblfour)
                ,(TextView) findViewById(R.id.eq4) );
        Hidestuff((ImageButton) findViewById(R.id.btnuser5)
                , (ImageButton) findViewById(R.id.btnkey5)
                , (TextView) findViewById(R.id.lblfive)
                ,(TextView) findViewById(R.id.eq5) );
    }
    public void Pressbuttonfive(View v){

        Hidestuff((ImageButton) findViewById(R.id.btnuser5)
                , (ImageButton) findViewById(R.id.btnkey5)
                , (TextView) findViewById(R.id.lblfive)
                ,(TextView) findViewById(R.id.eq5) );


    }
    public void Hidestuff(ImageButton Userbutton, ImageButton KeyButton, TextView Label, TextView Label2){

        Userbutton.setVisibility(View.INVISIBLE);
        KeyButton.setVisibility(View.INVISIBLE);
        Label.setVisibility(View.INVISIBLE);
        Label2.setVisibility(View.INVISIBLE);
    }
    public void UnHidestuff(ImageButton Userbutton, ImageButton KeyButton, TextView Label, TextView Label2){

        Userbutton.setVisibility(View.VISIBLE);
        KeyButton.setVisibility(View.VISIBLE);
        Label.setVisibility(View.VISIBLE);
        Label2.setVisibility(View.VISIBLE);
    }

    private String getGlobals(String ID, String Answer){
        Log.d("getGlobal ID", ID);
        Log.d("getGlobal Answer", Answer);
        SharedPreferences AnswerStorage = getSharedPreferences(ID, 0);
        Answer = AnswerStorage.getString(ID, "");
        Log.d("getGlobal Get", Answer);
        return Answer;
    }


    public void Pressbuttonblue(View v){
        //Need to pull # of Strikes

        Button strike = (Button) findViewById(R.id.btnStrikes);


        int red = Color.parseColor("#ff3300"); //The color u want
        int blue = Color.parseColor("#0040ff"); //The color u want
        int green = Color.parseColor("#009933"); //The color u want
        int yellow = Color.parseColor("#e6e600"); //The color u want
        Integer Nextbtn = NextOpenButton();
        String Newcolor = "";



        switch(Nextbtn) {
            case 1:
                //Change the User button color
                    ((ImageButton) findViewById(R.id.btnuser1)).setColorFilter(blue);
                //Change Color of Key Button based on Strikes
                //Strikes needed
                Newcolor = FindColor("blue",Integer.valueOf(strike.getText().toString()));
                if (Newcolor.equals("green")){
                    ((ImageButton) findViewById(R.id.btnkey1)).setColorFilter(green);
                } else if (Newcolor.equals("blue")) {
                    ((ImageButton) findViewById(R.id.btnkey1)).setColorFilter(blue);
                } else if (Newcolor.equals("yellow")) {
                    ((ImageButton) findViewById(R.id.btnkey1)).setColorFilter(yellow);
                } else if (Newcolor.equals("red")) {
                    ((ImageButton) findViewById(R.id.btnkey1)).setColorFilter(red);
                }
                // UnHide the buttons
                UnHidestuff((ImageButton) findViewById(R.id.btnuser1)
                        , (ImageButton) findViewById(R.id.btnkey1)
                        , (TextView) findViewById(R.id.lblcomplexone)
                        ,(TextView) findViewById(R.id.eq1) );
                break;
            case 2:
                //Change the User button color
                ((ImageButton) findViewById(R.id.btnuser2)).setColorFilter(blue);
                //Change Color of Key Button based on Strikes
                //Strikes needed
                Newcolor = FindColor("blue",Integer.valueOf(strike.getText().toString()));
                if (Newcolor.equals("green")){
                    ((ImageButton) findViewById(R.id.btnkey2)).setColorFilter(green);
                } else if (Newcolor.equals("blue")) {
                    ((ImageButton) findViewById(R.id.btnkey2)).setColorFilter(blue);
                } else if (Newcolor.equals("yellow")) {
                    ((ImageButton) findViewById(R.id.btnkey2)).setColorFilter(yellow);
                } else if (Newcolor.equals("red")) {
                    ((ImageButton) findViewById(R.id.btnkey2)).setColorFilter(red);
                }
                // UnHide the buttons
                UnHidestuff((ImageButton) findViewById(R.id.btnuser2)
                        , (ImageButton) findViewById(R.id.btnkey2)
                        , (TextView) findViewById(R.id.lbltwo)
                        ,(TextView) findViewById(R.id.eq2) );
                break;
            case 3:
                //Change the User button color
                ((ImageButton) findViewById(R.id.btnuser3)).setColorFilter(blue);
                //Change Color of Key Button based on Strikes
                //Strikes needed
                Newcolor = FindColor("blue",Integer.valueOf(strike.getText().toString()));
                if (Newcolor.equals("green")){
                    ((ImageButton) findViewById(R.id.btnkey3)).setColorFilter(green);
                } else if (Newcolor.equals("blue")) {
                    ((ImageButton) findViewById(R.id.btnkey3)).setColorFilter(blue);
                } else if (Newcolor.equals("yellow")) {
                    ((ImageButton) findViewById(R.id.btnkey3)).setColorFilter(yellow);
                } else if (Newcolor.equals("red")) {
                    ((ImageButton) findViewById(R.id.btnkey3)).setColorFilter(red);
                }
                // UnHide the buttons
                UnHidestuff((ImageButton) findViewById(R.id.btnuser3)
                        , (ImageButton) findViewById(R.id.btnkey3)
                        , (TextView) findViewById(R.id.lblthree)
                        ,(TextView) findViewById(R.id.eq3) );
                break;
            case 4:
                //Change the User button color
                ((ImageButton) findViewById(R.id.btnuser4)).setColorFilter(blue);
                //Change Color of Key Button based on Strikes
                //Strikes needed
                Newcolor = FindColor("blue",Integer.valueOf(strike.getText().toString()));
                if (Newcolor.equals("green")){
                    ((ImageButton) findViewById(R.id.btnkey4)).setColorFilter(green);
                } else if (Newcolor.equals("blue")) {
                    ((ImageButton) findViewById(R.id.btnkey4)).setColorFilter(blue);
                } else if (Newcolor.equals("yellow")) {
                    ((ImageButton) findViewById(R.id.btnkey4)).setColorFilter(yellow);
                } else if (Newcolor.equals("red")) {
                    ((ImageButton) findViewById(R.id.btnkey4)).setColorFilter(red);
                }
                // UnHide the buttons
                UnHidestuff((ImageButton) findViewById(R.id.btnuser4)
                        , (ImageButton) findViewById(R.id.btnkey4)
                        , (TextView) findViewById(R.id.lblfour)
                        ,(TextView) findViewById(R.id.eq4) );
                break;
            case 5:
                //Change the User button color
                ((ImageButton) findViewById(R.id.btnuser5)).setColorFilter(blue);
                //Change Color of Key Button based on Strikes
                //Strikes needed
                Newcolor = FindColor("blue",Integer.valueOf(strike.getText().toString()));
                if (Newcolor.equals("green")){
                    ((ImageButton) findViewById(R.id.btnkey5)).setColorFilter(green);
                } else if (Newcolor.equals("blue")) {
                    ((ImageButton) findViewById(R.id.btnkey5)).setColorFilter(blue);
                } else if (Newcolor.equals("yellow")) {
                    ((ImageButton) findViewById(R.id.btnkey5)).setColorFilter(yellow);
                } else if (Newcolor.equals("red")) {
                    ((ImageButton) findViewById(R.id.btnkey5)).setColorFilter(red);
                }
                // UnHide the buttons
                UnHidestuff((ImageButton) findViewById(R.id.btnuser5)
                        , (ImageButton) findViewById(R.id.btnkey5)
                        , (TextView) findViewById(R.id.lblfive)
                        ,(TextView) findViewById(R.id.eq5) );
                break;
        }
    }
    public void Pressbuttonyellow(View v){

        Button strike = (Button) findViewById(R.id.btnStrikes);

        //Need to pull # of Strikes
        int red = Color.parseColor("#ff3300"); //The color u want
        int blue = Color.parseColor("#0040ff"); //The color u want
        int green = Color.parseColor("#009933"); //The color u want
        int yellow = Color.parseColor("#e6e600"); //The color u want
        Integer Nextbtn = NextOpenButton();
        String Newcolor = "";

        switch(Nextbtn) {
            case 1:
                //Change the User button color
                ((ImageButton) findViewById(R.id.btnuser1)).setColorFilter(yellow);
                //Change Color of Key Button based on Strikes
                //Strikes needed
                Newcolor = FindColor("yellow",Integer.valueOf(strike.getText().toString()));
                if (Newcolor.equals("green")){
                    ((ImageButton) findViewById(R.id.btnkey1)).setColorFilter(green);
                } else if (Newcolor.equals("blue")) {
                    ((ImageButton) findViewById(R.id.btnkey1)).setColorFilter(blue);
                } else if (Newcolor.equals("yellow")) {
                    ((ImageButton) findViewById(R.id.btnkey1)).setColorFilter(yellow);
                } else if (Newcolor.equals("red")) {
                    ((ImageButton) findViewById(R.id.btnkey1)).setColorFilter(red);
                }
                // UnHide the buttons
                UnHidestuff((ImageButton) findViewById(R.id.btnuser1)
                        , (ImageButton) findViewById(R.id.btnkey1)
                        , (TextView) findViewById(R.id.lblcomplexone)
                        ,(TextView) findViewById(R.id.eq1) );
                break;
            case 2:
                //Change the User button color
                ((ImageButton) findViewById(R.id.btnuser2)).setColorFilter(yellow);
                //Change Color of Key Button based on Strikes
                //Strikes needed
                Newcolor = FindColor("yellow",Integer.valueOf(strike.getText().toString()));
                if (Newcolor.equals("green")){
                    ((ImageButton) findViewById(R.id.btnkey2)).setColorFilter(green);
                } else if (Newcolor.equals("blue")) {
                    ((ImageButton) findViewById(R.id.btnkey2)).setColorFilter(blue);
                } else if (Newcolor.equals("yellow")) {
                    ((ImageButton) findViewById(R.id.btnkey2)).setColorFilter(yellow);
                } else if (Newcolor.equals("red")) {
                    ((ImageButton) findViewById(R.id.btnkey2)).setColorFilter(red);
                }
                // UnHide the buttons
                UnHidestuff((ImageButton) findViewById(R.id.btnuser2)
                        , (ImageButton) findViewById(R.id.btnkey2)
                        , (TextView) findViewById(R.id.lbltwo)
                        ,(TextView) findViewById(R.id.eq2) );
                break;
            case 3:
                //Change the User button color
                ((ImageButton) findViewById(R.id.btnuser3)).setColorFilter(yellow);
                //Change Color of Key Button based on Strikes
                //Strikes needed
                Newcolor = FindColor("yellow",Integer.valueOf(strike.getText().toString()));
                if (Newcolor.equals("green")){
                    ((ImageButton) findViewById(R.id.btnkey3)).setColorFilter(green);
                } else if (Newcolor.equals("blue")) {
                    ((ImageButton) findViewById(R.id.btnkey3)).setColorFilter(blue);
                } else if (Newcolor.equals("yellow")) {
                    ((ImageButton) findViewById(R.id.btnkey3)).setColorFilter(yellow);
                } else if (Newcolor.equals("red")) {
                    ((ImageButton) findViewById(R.id.btnkey3)).setColorFilter(red);
                }
                // UnHide the buttons
                UnHidestuff((ImageButton) findViewById(R.id.btnuser3)
                        , (ImageButton) findViewById(R.id.btnkey3)
                        , (TextView) findViewById(R.id.lblthree)
                        ,(TextView) findViewById(R.id.eq3) );
                break;
            case 4:
                //Change the User button color
                ((ImageButton) findViewById(R.id.btnuser4)).setColorFilter(yellow);
                //Change Color of Key Button based on Strikes
                //Strikes needed
                Newcolor = FindColor("yellow",Integer.valueOf(strike.getText().toString()));
                if (Newcolor.equals("green")){
                    ((ImageButton) findViewById(R.id.btnkey4)).setColorFilter(green);
                } else if (Newcolor.equals("blue")) {
                    ((ImageButton) findViewById(R.id.btnkey4)).setColorFilter(blue);
                } else if (Newcolor.equals("yellow")) {
                    ((ImageButton) findViewById(R.id.btnkey4)).setColorFilter(yellow);
                } else if (Newcolor.equals("red")) {
                    ((ImageButton) findViewById(R.id.btnkey4)).setColorFilter(red);
                }
                // UnHide the buttons
                UnHidestuff((ImageButton) findViewById(R.id.btnuser4)
                        , (ImageButton) findViewById(R.id.btnkey4)
                        , (TextView) findViewById(R.id.lblfour)
                        ,(TextView) findViewById(R.id.eq4) );
                break;
            case 5:
                //Change the User button color
                ((ImageButton) findViewById(R.id.btnuser5)).setColorFilter(yellow);
                //Change Color of Key Button based on Strikes
                //Strikes needed
                Newcolor = FindColor("yellow",Integer.valueOf(strike.getText().toString()));
                if (Newcolor.equals("green")){
                    ((ImageButton) findViewById(R.id.btnkey5)).setColorFilter(green);
                } else if (Newcolor.equals("blue")) {
                    ((ImageButton) findViewById(R.id.btnkey5)).setColorFilter(blue);
                } else if (Newcolor.equals("yellow")) {
                    ((ImageButton) findViewById(R.id.btnkey5)).setColorFilter(yellow);
                } else if (Newcolor.equals("red")) {
                    ((ImageButton) findViewById(R.id.btnkey5)).setColorFilter(red);
                }
                // UnHide the buttons
                UnHidestuff((ImageButton) findViewById(R.id.btnuser5)
                        , (ImageButton) findViewById(R.id.btnkey5)
                        , (TextView) findViewById(R.id.lblfive)
                        ,(TextView) findViewById(R.id.eq5) );
                break;
        }

    }
    public void Pressbuttongreen(View v){

        Button strike = (Button) findViewById(R.id.btnStrikes);

        //Need to pull # of Strikes
        int red = Color.parseColor("#ff3300"); //The color u want
        int blue = Color.parseColor("#0040ff"); //The color u want
        int green = Color.parseColor("#009933"); //The color u want
        int yellow = Color.parseColor("#e6e600"); //The color u want
        Integer Nextbtn = NextOpenButton();
        String Newcolor = "";

        switch(Nextbtn) {
            case 1:
                //Change the User button color
                ((ImageButton) findViewById(R.id.btnuser1)).setColorFilter(green);
                //Change Color of Key Button based on Strikes
                //Strikes needed
                Newcolor = FindColor("green",Integer.valueOf(strike.getText().toString()));
                if (Newcolor.equals("green")){
                    ((ImageButton) findViewById(R.id.btnkey1)).setColorFilter(green);
                } else if (Newcolor.equals("blue")) {
                    ((ImageButton) findViewById(R.id.btnkey1)).setColorFilter(blue);
                } else if (Newcolor.equals("yellow")) {
                    ((ImageButton) findViewById(R.id.btnkey1)).setColorFilter(yellow);
                } else if (Newcolor.equals("red")) {
                    ((ImageButton) findViewById(R.id.btnkey1)).setColorFilter(red);
                }
                // UnHide the buttons
                UnHidestuff((ImageButton) findViewById(R.id.btnuser1)
                        , (ImageButton) findViewById(R.id.btnkey1)
                        , (TextView) findViewById(R.id.lblcomplexone)
                        ,(TextView) findViewById(R.id.eq1) );
                break;
            case 2:
                //Change the User button color
                ((ImageButton) findViewById(R.id.btnuser2)).setColorFilter(green);
                //Change Color of Key Button based on Strikes
                //Strikes needed
                Newcolor = FindColor("green",Integer.valueOf(strike.getText().toString()));
                if (Newcolor.equals("green")){
                    ((ImageButton) findViewById(R.id.btnkey2)).setColorFilter(green);
                } else if (Newcolor.equals("blue")) {
                    ((ImageButton) findViewById(R.id.btnkey2)).setColorFilter(blue);
                } else if (Newcolor.equals("yellow")) {
                    ((ImageButton) findViewById(R.id.btnkey2)).setColorFilter(yellow);
                } else if (Newcolor.equals("red")) {
                    ((ImageButton) findViewById(R.id.btnkey2)).setColorFilter(red);
                }
                // UnHide the buttons
                UnHidestuff((ImageButton) findViewById(R.id.btnuser2)
                        , (ImageButton) findViewById(R.id.btnkey2)
                        , (TextView) findViewById(R.id.lbltwo)
                        ,(TextView) findViewById(R.id.eq2) );
                break;
            case 3:
                //Change the User button color
                ((ImageButton) findViewById(R.id.btnuser3)).setColorFilter(green);
                //Change Color of Key Button based on Strikes
                //Strikes needed
                Newcolor = FindColor("green",Integer.valueOf(strike.getText().toString()));
                if (Newcolor.equals("green")){
                    ((ImageButton) findViewById(R.id.btnkey3)).setColorFilter(green);
                } else if (Newcolor.equals("blue")) {
                    ((ImageButton) findViewById(R.id.btnkey3)).setColorFilter(blue);
                } else if (Newcolor.equals("yellow")) {
                    ((ImageButton) findViewById(R.id.btnkey3)).setColorFilter(yellow);
                } else if (Newcolor.equals("red")) {
                    ((ImageButton) findViewById(R.id.btnkey3)).setColorFilter(red);
                }
                // UnHide the buttons
                UnHidestuff((ImageButton) findViewById(R.id.btnuser3)
                        , (ImageButton) findViewById(R.id.btnkey3)
                        , (TextView) findViewById(R.id.lblthree)
                        ,(TextView) findViewById(R.id.eq3) );
                break;
            case 4:
                //Change the User button color
                ((ImageButton) findViewById(R.id.btnuser4)).setColorFilter(green);
                //Change Color of Key Button based on Strikes
                //Strikes needed
                Newcolor = FindColor("green",Integer.valueOf(strike.getText().toString()));
                if (Newcolor.equals("green")){
                    ((ImageButton) findViewById(R.id.btnkey4)).setColorFilter(green);
                } else if (Newcolor.equals("blue")) {
                    ((ImageButton) findViewById(R.id.btnkey4)).setColorFilter(blue);
                } else if (Newcolor.equals("yellow")) {
                    ((ImageButton) findViewById(R.id.btnkey4)).setColorFilter(yellow);
                } else if (Newcolor.equals("red")) {
                    ((ImageButton) findViewById(R.id.btnkey4)).setColorFilter(red);
                }
                // UnHide the buttons
                UnHidestuff((ImageButton) findViewById(R.id.btnuser4)
                        , (ImageButton) findViewById(R.id.btnkey4)
                        , (TextView) findViewById(R.id.lblfour)
                        ,(TextView) findViewById(R.id.eq4) );
                break;
            case 5:
                //Change the User button color
                ((ImageButton) findViewById(R.id.btnuser5)).setColorFilter(green);
                //Change Color of Key Button based on Strikes
                //Strikes needed
                Newcolor = FindColor("green",Integer.valueOf(strike.getText().toString()));
                if (Newcolor.equals("green")){
                    ((ImageButton) findViewById(R.id.btnkey5)).setColorFilter(green);
                } else if (Newcolor.equals("blue")) {
                    ((ImageButton) findViewById(R.id.btnkey5)).setColorFilter(blue);
                } else if (Newcolor.equals("yellow")) {
                    ((ImageButton) findViewById(R.id.btnkey5)).setColorFilter(yellow);
                } else if (Newcolor.equals("red")) {
                    ((ImageButton) findViewById(R.id.btnkey5)).setColorFilter(red);
                }
                // UnHide the buttons
                UnHidestuff((ImageButton) findViewById(R.id.btnuser5)
                        , (ImageButton) findViewById(R.id.btnkey5)
                        , (TextView) findViewById(R.id.lblfive)
                        ,(TextView) findViewById(R.id.eq5) );
                break;
        }

    }
    public void Pressbuttonred(View v){


        Button strike = (Button) findViewById(R.id.btnStrikes);

        //Need to pull # of Strikes
        int red = Color.parseColor("#ff3300"); //The color u want
        int blue = Color.parseColor("#0040ff"); //The color u want
        int green = Color.parseColor("#009933"); //The color u want
        int yellow = Color.parseColor("#e6e600"); //The color u want
        Integer Nextbtn = NextOpenButton();
        String Newcolor = "";

        switch(Nextbtn) {
            case 1:
                //Change the User button color
                ((ImageButton) findViewById(R.id.btnuser1)).setColorFilter(red);
                //Change Color of Key Button based on Strikes
                //Strikes needed
                Newcolor = FindColor("red",Integer.valueOf(strike.getText().toString()));
                if (Newcolor.equals("green")){
                    ((ImageButton) findViewById(R.id.btnkey1)).setColorFilter(green);
                } else if (Newcolor.equals("blue")) {
                    ((ImageButton) findViewById(R.id.btnkey1)).setColorFilter(blue);
                } else if (Newcolor.equals("yellow")) {
                    ((ImageButton) findViewById(R.id.btnkey1)).setColorFilter(yellow);
                } else if (Newcolor.equals("red")) {
                    ((ImageButton) findViewById(R.id.btnkey1)).setColorFilter(red);
                }
                // UnHide the buttons
                UnHidestuff((ImageButton) findViewById(R.id.btnuser1)
                        , (ImageButton) findViewById(R.id.btnkey1)
                        , (TextView) findViewById(R.id.lblcomplexone)
                        ,(TextView) findViewById(R.id.eq1) );
                break;
            case 2:
                //Change the User button color
                ((ImageButton) findViewById(R.id.btnuser2)).setColorFilter(red);
                //Change Color of Key Button based on Strikes
                //Strikes needed
                Newcolor = FindColor("red",Integer.valueOf(strike.getText().toString()));
                if (Newcolor.equals("green")){
                    ((ImageButton) findViewById(R.id.btnkey2)).setColorFilter(green);
                } else if (Newcolor.equals("blue")) {
                    ((ImageButton) findViewById(R.id.btnkey2)).setColorFilter(blue);
                } else if (Newcolor.equals("yellow")) {
                    ((ImageButton) findViewById(R.id.btnkey2)).setColorFilter(yellow);
                } else if (Newcolor.equals("red")) {
                    ((ImageButton) findViewById(R.id.btnkey2)).setColorFilter(red);
                }
                // UnHide the buttons
                UnHidestuff((ImageButton) findViewById(R.id.btnuser2)
                        , (ImageButton) findViewById(R.id.btnkey2)
                        , (TextView) findViewById(R.id.lbltwo)
                        ,(TextView) findViewById(R.id.eq2) );
                break;
            case 3:
                //Change the User button color
                ((ImageButton) findViewById(R.id.btnuser3)).setColorFilter(red);
                //Change Color of Key Button based on Strikes
                //Strikes needed
                Newcolor = FindColor("red",Integer.valueOf(strike.getText().toString()));
                if (Newcolor.equals("green")){
                    ((ImageButton) findViewById(R.id.btnkey3)).setColorFilter(green);
                } else if (Newcolor.equals("blue")) {
                    ((ImageButton) findViewById(R.id.btnkey3)).setColorFilter(blue);
                } else if (Newcolor.equals("yellow")) {
                    ((ImageButton) findViewById(R.id.btnkey3)).setColorFilter(yellow);
                } else if (Newcolor.equals("red")) {
                    ((ImageButton) findViewById(R.id.btnkey3)).setColorFilter(red);
                }
                // UnHide the buttons
                UnHidestuff((ImageButton) findViewById(R.id.btnuser3)
                        , (ImageButton) findViewById(R.id.btnkey3)
                        , (TextView) findViewById(R.id.lblthree)
                        ,(TextView) findViewById(R.id.eq3) );
                break;
            case 4:
                //Change the User button color
                ((ImageButton) findViewById(R.id.btnuser4)).setColorFilter(red);
                //Change Color of Key Button based on Strikes
                //Strikes needed
                Newcolor = FindColor("red",Integer.valueOf(strike.getText().toString()));
                if (Newcolor.equals("green")){
                    ((ImageButton) findViewById(R.id.btnkey4)).setColorFilter(green);
                } else if (Newcolor.equals("blue")) {
                    ((ImageButton) findViewById(R.id.btnkey4)).setColorFilter(blue);
                } else if (Newcolor.equals("yellow")) {
                    ((ImageButton) findViewById(R.id.btnkey4)).setColorFilter(yellow);
                } else if (Newcolor.equals("red")) {
                    ((ImageButton) findViewById(R.id.btnkey4)).setColorFilter(red);
                }
                // UnHide the buttons
                UnHidestuff((ImageButton) findViewById(R.id.btnuser4)
                        , (ImageButton) findViewById(R.id.btnkey4)
                        , (TextView) findViewById(R.id.lblfour)
                        ,(TextView) findViewById(R.id.eq4) );
                break;
            case 5:
                //Change the User button color
                ((ImageButton) findViewById(R.id.btnuser5)).setColorFilter(red);
                //Change Color of Key Button based on Strikes
                //Strikes needed
                Newcolor = FindColor("red",Integer.valueOf(strike.getText().toString()));
                if (Newcolor.equals("green")){
                    ((ImageButton) findViewById(R.id.btnkey5)).setColorFilter(green);
                } else if (Newcolor.equals("blue")) {
                    ((ImageButton) findViewById(R.id.btnkey5)).setColorFilter(blue);
                } else if (Newcolor.equals("yellow")) {
                    ((ImageButton) findViewById(R.id.btnkey5)).setColorFilter(yellow);
                } else if (Newcolor.equals("red")) {
                    ((ImageButton) findViewById(R.id.btnkey5)).setColorFilter(red);
                }
                // UnHide the buttons
                UnHidestuff((ImageButton) findViewById(R.id.btnuser5)
                        , (ImageButton) findViewById(R.id.btnkey5)
                        , (TextView) findViewById(R.id.lblfive)
                        ,(TextView) findViewById(R.id.eq5) );
                break;
        }
    }

    public Integer NextOpenButton(){
        ImageButton a = (ImageButton) findViewById(R.id.btnuser1);
        ImageButton b = (ImageButton) findViewById(R.id.btnuser2);
        ImageButton c = (ImageButton) findViewById(R.id.btnuser3);
        ImageButton d = (ImageButton) findViewById(R.id.btnuser4);
        ImageButton e = (ImageButton) findViewById(R.id.btnuser5);
        Integer Lastnumber = 0;
        Log.d("ID", "Not Happening");
        if(a.getVisibility()== View.INVISIBLE ){
            Lastnumber = 1;
        } else if (b.getVisibility()== View.INVISIBLE ){
            Lastnumber =2;
        } else if (c.getVisibility()== View.INVISIBLE ){
            Lastnumber =3;
        } else if (d.getVisibility()== View.INVISIBLE ){
            Lastnumber =4;
        } else if (e.getVisibility()== View.INVISIBLE ){
            Lastnumber =5;
        }
        Log.d("ID", Lastnumber.toString());
        return Lastnumber;

    }

    public String FindColor(String Color, Integer Strikes) {

        String Answer = "";
        Answer = getGlobals("ContainsVowel", Answer);

        String Newcolor = "";

        //Need to pull Whether Serial Number contains a vowel. If is Yes, Else is No.
        if (Answer.equals("Yes")) {
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
