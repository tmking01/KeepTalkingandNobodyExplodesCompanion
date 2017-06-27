package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.service.carrier.CarrierService;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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


    public String CleanString(String Five,String Four,String Three,String One){
        String Answer = "";
        Integer count = 1;
        Integer Number = 5;
        Integer wordsize = Five.length();

        if (Five.length() <= 1 || Five.equals("") ) {

            if (Number == 5) {

                do {

                    switch (Five.substring(count, count + 1).toUpperCase()) {
                        case "D":
                            Log.d("ID", "Not Happening");
                            if (Three.toUpperCase().contains("R")){
                                Log.d("ID", "No Way!");
                                Answer = "WORLD";
                            }else if (One.toUpperCase().equals("C")){
                                Answer = "COULD";
                            }else if (One.toUpperCase().equals("F")){
                                Answer = "FOUND";
                            }else if (One.toUpperCase().equals("S")){
                                Answer = "SOUND";
                            }else if (One.toUpperCase().equals("W")){
                                Answer = "WOULD";
                            }
                            break;
                        case "E":
                            if (Four.toUpperCase().equals("C")){
                                Answer = "WORLD";
                            }else if (Four.toUpperCase().equals("E")){
                                Answer = "COULD";
                            }else if (Four.toUpperCase().equals("G")){
                                Answer = "FOUND";
                            }else if (Four.toUpperCase().equals("T")){
                                Answer = "SOUND";
                            }else if (Four.toUpperCase().equals("R")){
                                if (One.toUpperCase().equals("T")){
                                    Answer = "THERE";
                                }else if (One.toUpperCase().equals("W")){
                                    Answer = "WHERE";
                                }
                            }else if (Four.toUpperCase().equals("S")){
                                if (One.toUpperCase().equals("H")){
                                    Answer = "HOUSE";
                                }else if (One.toUpperCase().equals("T")){
                                    Answer = "THESE";
                                }
                            }
                            break;
                        case "G":
                            if (Five.contains("G")){}else {
                                Answer = "THING";
                            }
                            break;
                        case "H":
                            if (Five.contains("H")){}else {
                                Answer = "WHICH";
                            }
                            break;
                        case "K":
                            if (Five.contains("K")){}else {
                                Answer = "THINK";
                            }
                            break;
                        case "L":
                            if (Three.toUpperCase().equals("A")) {
                                Answer = "SMALL";
                            } else if (Three.toUpperCase().equals("E")) {
                                Answer = "SPELL";
                            } else if (Three.toUpperCase().equals("I")){
                                Answer = "STILL";
                            }
                            break;
                        case "N":
                            if (Four.toUpperCase().equals("I")) {
                                Answer = "AGAIN";
                            } else if (Four.toUpperCase().equals("R")) {
                                Answer = "LEARN";
                            }
                            break;
                        case "R":
                            if (One.toUpperCase().equals("A")) {
                                Answer = "AFTER";
                            } else if (One.toUpperCase().equals("N")) {
                                Answer = "NEVER";
                            } else if (One.toUpperCase().equals("O")){
                                Answer = "OTHER";
                            } else if (One.toUpperCase().equals("T")) {
                                Answer = "THEIR";
                            } else if (One.toUpperCase().equals("W")){
                                Answer = "WATER";
                            }
                            break;
                        case "T":
                            if (Three.toUpperCase().equals("O")) {
                                Answer = "ABOUT";
                            } else if (Three.toUpperCase().equals("R")) {
                                Answer = "FIRST";
                            } else if (Three.toUpperCase().equals("E")){
                                Answer = "GREAT";
                            } else if (Three.toUpperCase().equals("A")) {
                                Answer = "PLANT";
                            } else if (Three.toUpperCase().equals("I")){
                                Answer = "POINT";
                            } else if (Three.toUpperCase().equals("G")){
                                Answer = "RIGHT";
                            }
                            break;
                        case "W":
                            if (Answer.contains("W")){}else {
                                Answer = "BELOW";
                            }
                            break;
                        case "Y":
                            if (Four.toUpperCase().equals("R")) {
                                Answer = "EVERY";
                            } else if (Four.toUpperCase().equals("D")) {
                                Answer = "STUDY";
                            }
                            break;
                    }
                    count++;
                    Log.d("ID", count.toString());
                    if (count == Five.length() && Answer == "") {
                        Answer = "Not Found!";
                        break;
                    }
                    Log.d("ID", Answer);
                } while (Answer == "");
            }
        }else {
            Answer = "Letters Required";
        }


        //TextView possiblepasswords = (TextView) findViewById(R.id.lblAnswer);
        //possiblepasswords.setText(Answer);
        Log.d("ID", Answer);
        return Answer;
    }






}
