package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.service.carrier.CarrierService;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.TextView;

public class Password extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
    }


    public void Password(View v){


        TextView possiblepasswords = (TextView) findViewById(R.id.lblAnswer);
        EditText LETTERSONE = (EditText) findViewById(R.id.txtOne);
        EditText LETTERSTHREE = (EditText) findViewById(R.id.txtThree);
        EditText LETTERSFOUR = (EditText) findViewById(R.id.txtFour);
        EditText LETTERSFIVE = (EditText) findViewById(R.id.txtFive);
        String Lettersone = LETTERSONE.getText().toString();
        String Lettersthree = LETTERSTHREE.getText().toString();
        String Lettersfour = LETTERSFOUR.getText().toString();
        String Lettersfive = LETTERSFIVE.getText().toString();


        if (Lettersone.equals("") || Lettersthree.equals("") || Lettersfour.equals("") || Lettersfive.equals("")){
            possiblepasswords.setText("Fill out All Fields!");
        }else {
            String Combo = CleanString(Lettersfive, Lettersfour, Lettersthree, Lettersone);
            possiblepasswords.setText(Combo);
        }

    }


    public Integer AnswerCheck(String Answer, String five,String four,String three,String one){
        Log.d("ID", "Entered Function");


        Integer Check = 0;



        Log.d("ID", Answer.substring(4,5).toUpperCase());


        if ((five.toUpperCase()).contains(Answer.substring(4,5).toUpperCase())){
            Log.d("ID", "that worked btw...");
            if ((four.toUpperCase()).contains(Answer.substring(3,4).toUpperCase())){
                if ((three.toUpperCase()).contains(Answer.substring(2,3).toUpperCase())){
                    if ((one.toUpperCase()).contains(Answer.substring(0,1).toUpperCase())){
                        Check = 1;
                        Log.d("ID", "Checking");
                        }
                    }
                }
            }

        return Check;
    }



    public String CleanString(String Five,String Four,String Three,String One){
        String Answer = "";
        Integer temp = 0;
        if (AnswerCheck("ABOUT",Five.toUpperCase(),Four.toUpperCase(),Three.toUpperCase(),One.toUpperCase()) == 1 && Answer == "") {Answer = "ABOUT";}
        if (AnswerCheck("AFTER",Five,Four,Three,One) == 1 && Answer == "") {Answer = "AFTER";}
        if (AnswerCheck("AGAIN",Five,Four,Three,One) == 1 && Answer == "") {Answer = "AGAIN";}
        if (AnswerCheck("BELOW",Five,Four,Three,One) == 1 && Answer == "") {Answer = "BELOW";}
        if (AnswerCheck("COULD",Five,Four,Three,One) == 1 && Answer == "") {Answer = "COULD";}
        if (AnswerCheck("EVERY",Five,Four,Three,One) == 1 && Answer == "") {Answer = "EVERY";}
        if (AnswerCheck("FIRST",Five,Four,Three,One) == 1 && Answer == "") {Answer = "FIRST";}
        if (AnswerCheck("FOUND",Five,Four,Three,One) == 1 && Answer == "") {Answer = "FOUND";}
        if (AnswerCheck("GREAT",Five,Four,Three,One) == 1 && Answer == "") {Answer = "GREAT";}
        if (AnswerCheck("HOUSE",Five,Four,Three,One) == 1 && Answer == "") {Answer = "HOUSE";}
        if (AnswerCheck("LARGE",Five,Four,Three,One) == 1 && Answer == "") {Answer = "LARGE";}
        if (AnswerCheck("LEARN",Five,Four,Three,One) == 1 && Answer == "") {Answer = "LEARN";}
        if (AnswerCheck("NEVER",Five,Four,Three,One) == 1 && Answer == "") {Answer = "NEVER";}
        if (AnswerCheck("OTHER",Five,Four,Three,One) == 1 && Answer == "") {Answer = "OTHER";}
        if (AnswerCheck("PLACE",Five,Four,Three,One) == 1 && Answer == "") {Answer = "PLACE";}
        if (AnswerCheck("PLANT",Five,Four,Three,One) == 1 && Answer == "") {Answer = "PLANT";}
        if (AnswerCheck("POINT",Five,Four,Three,One) == 1 && Answer == "") {Answer = "POINT";}
        if (AnswerCheck("RIGHT",Five,Four,Three,One) == 1 && Answer == "") {Answer = "RIGHT";}
        if (AnswerCheck("SMALL",Five,Four,Three,One) == 1 && Answer == "") {Answer = "SMALL";}
        if (AnswerCheck("SOUND",Five,Four,Three,One) == 1 && Answer == "") {Answer = "SOUND";}
        if (AnswerCheck("SPELL",Five,Four,Three,One) == 1 && Answer == "") {Answer = "SPELL";}
        if (AnswerCheck("STILL",Five,Four,Three,One) == 1 && Answer == "") {Answer = "STILL";}
        if (AnswerCheck("STUDY",Five,Four,Three,One) == 1 && Answer == "") {Answer = "STUDY";}
        if (AnswerCheck("THEIR",Five,Four,Three,One) == 1 && Answer == "") {Answer = "THEIR";}
        if (AnswerCheck("THERE",Five,Four,Three,One) == 1 && Answer == "") {Answer = "THERE";}
        if (AnswerCheck("THESE",Five,Four,Three,One) == 1 && Answer == "") {Answer = "THESE";}
        if (AnswerCheck("THING",Five,Four,Three,One) == 1 && Answer == "") {Answer = "THING";}
        if (AnswerCheck("THINK",Five,Four,Three,One) == 1 && Answer == "") {Answer = "THINK";}
        if (AnswerCheck("THREE",Five,Four,Three,One) == 1 && Answer == "") {Answer = "THREE";}
        if (AnswerCheck("WATER",Five,Four,Three,One) == 1 && Answer == "") {Answer = "WATER";}
        if (AnswerCheck("WHERE",Five,Four,Three,One) == 1 && Answer == "") {Answer = "WHERE";}
        if (AnswerCheck("WHICH",Five,Four,Three,One) == 1 && Answer == "") {Answer = "WHICH";}
        if (AnswerCheck("WORLD",Five,Four,Three,One) == 1 && Answer == "") {Answer = "WORLD";}
        if (AnswerCheck("WOULD",Five,Four,Three,One) == 1 && Answer == "") {Answer = "WOULD";}
        if (AnswerCheck("WRITE",Five,Four,Three,One) == 1 && Answer == "") {Answer = "WRITE";}
        if (Answer == "") {Answer = "Not Found";}

        return Answer;
    }






}
