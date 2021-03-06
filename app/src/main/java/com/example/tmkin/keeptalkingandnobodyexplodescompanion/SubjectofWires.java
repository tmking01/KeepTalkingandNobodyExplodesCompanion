package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class SubjectofWires extends AppCompatActivity {

    private SeekBar PRICEbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjectof_wires);
        PRICEbar = (SeekBar)findViewById(R.id.WireNumberSlider);
        TextView lastwiretext = (TextView) findViewById(R.id.ResultText);
        lastwiretext.setText("");
        final View v = null;


        PRICEbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    int progress = 0;
                    @Override
                    public void onProgressChanged(SeekBar seekBar,int progresValue, boolean fromUser) {
                        progress = progresValue;
                        GetControls(v);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        // Do something here, 
                        //if you want to do anything at the start of
                        // touching the seekbar
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        // Display the value in textview

                    }
                });
    }



    public void GetControls(View v){
        //Button GetResults = (Button)  findViewById(R.id.GetResult);
        //GetResults.setVisibility(View.VISIBLE);

        int wireNumberSlider = PRICEbar.getProgress();
        wireNumberSlider = wireNumberSlider + 3;
        //String wireNumberslider = String.valueOf(wireNumberSlider);
        //Toast myToast = Toast.makeText(getApplicationContext(), wireNumberslider, Toast.LENGTH_SHORT);
        //myToast.show();


        if (wireNumberSlider == 3) {
            RadioGroup myRadioGroup = (RadioGroup) findViewById(R.id.WireFour);
            myRadioGroup.setVisibility(View.INVISIBLE);
            RadioGroup myRadioGrouptwo = (RadioGroup) findViewById(R.id.WireFive);
            myRadioGrouptwo.setVisibility(View.INVISIBLE);
            RadioGroup myRadioGroupthree = (RadioGroup) findViewById(R.id.WireSix);
            myRadioGroupthree.setVisibility(View.INVISIBLE);
            TextView lastwiretext = (TextView) findViewById(R.id.WireFourtext);
            lastwiretext.setVisibility(View.INVISIBLE);
            TextView lastwiretexttwo = (TextView) findViewById(R.id.WireFivetext);
            lastwiretexttwo.setVisibility(View.INVISIBLE);
            TextView lastwiretextthree = (TextView) findViewById(R.id.Wiresixtext);
            lastwiretextthree.setVisibility(View.INVISIBLE);
        }else if (wireNumberSlider == 4) {
            RadioGroup myRadioGroup = (RadioGroup) findViewById(R.id.WireFour);
            myRadioGroup.setVisibility(View.VISIBLE);
            RadioGroup myRadioGrouptwo = (RadioGroup) findViewById(R.id.WireFive);
            myRadioGrouptwo.setVisibility(View.INVISIBLE);
            RadioGroup myRadioGroupthree = (RadioGroup) findViewById(R.id.WireSix);
            myRadioGroupthree.setVisibility(View.INVISIBLE);
            TextView lastwiretext = (TextView) findViewById(R.id.WireFourtext);
            lastwiretext.setVisibility(View.VISIBLE);
            TextView lastwiretexttwo = (TextView) findViewById(R.id.WireFivetext);
            lastwiretexttwo.setVisibility(View.INVISIBLE);
            TextView lastwiretextthree = (TextView) findViewById(R.id.Wiresixtext);
            lastwiretextthree.setVisibility(View.INVISIBLE);
        }else if (wireNumberSlider == 5) {
            RadioGroup myRadioGroup = (RadioGroup) findViewById(R.id.WireFour);
            myRadioGroup.setVisibility(View.VISIBLE);
            RadioGroup myRadioGrouptwo = (RadioGroup) findViewById(R.id.WireFive);
            myRadioGrouptwo.setVisibility(View.VISIBLE);
            RadioGroup myRadioGroupthree = (RadioGroup) findViewById(R.id.WireSix);
            myRadioGroupthree.setVisibility(View.INVISIBLE);
            TextView lastwiretext = (TextView) findViewById(R.id.WireFourtext);
            lastwiretext.setVisibility(View.VISIBLE);
            TextView lastwiretexttwo = (TextView) findViewById(R.id.WireFivetext);
            lastwiretexttwo.setVisibility(View.VISIBLE);
            TextView lastwiretextthree = (TextView) findViewById(R.id.Wiresixtext);
            lastwiretextthree.setVisibility(View.INVISIBLE);
        }else if (wireNumberSlider == 6) {
            RadioGroup myRadioGroup = (RadioGroup) findViewById(R.id.WireFour);
            myRadioGroup.setVisibility(View.VISIBLE);
            RadioGroup myRadioGrouptwo = (RadioGroup) findViewById(R.id.WireFive);
            myRadioGrouptwo.setVisibility(View.VISIBLE);
            RadioGroup myRadioGroupthree = (RadioGroup) findViewById(R.id.WireSix);
            myRadioGroupthree.setVisibility(View.VISIBLE);
            TextView lastwiretext = (TextView) findViewById(R.id.WireFourtext);
            lastwiretext.setVisibility(View.VISIBLE);
            TextView lastwiretexttwo = (TextView) findViewById(R.id.WireFivetext);
            lastwiretexttwo.setVisibility(View.VISIBLE);
            TextView lastwiretextthree = (TextView) findViewById(R.id.Wiresixtext);
            lastwiretextthree.setVisibility(View.VISIBLE);
        }else {}
    }


    public void onStopTrackingTouch(SeekBar PRICEbar){

        Toast myToast = Toast.makeText(getApplicationContext(), "Testing", Toast.LENGTH_SHORT);
        myToast.show();

    }

    public void onProgressChanged(SeekBar PRICEbar, int progress,
                                  boolean fromUser)
    {
        int wireNumberSlider = PRICEbar.getProgress();
        String wireNumberslider = String.valueOf(wireNumberSlider);
        Toast myToast = Toast.makeText(getApplicationContext(), wireNumberslider, Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void updatecontrols(View v) {

        int wireNumberSlider = PRICEbar.getProgress();
        wireNumberSlider = wireNumberSlider + 3;

    }


    public void getresults(View v) {
        //Gets the number of wires and adds 3 since the minimum is 3
        int wireNumberSlider = PRICEbar.getProgress();
        wireNumberSlider = wireNumberSlider + 3;

        //Gets the setup question answer for if the serial number is even or odd
        SharedPreferences AnswerStorage = getSharedPreferences("SerialNumber", 0);
        String EvenOddStr = AnswerStorage.getString("SerialNumber", "");
        Log.d("ID",EvenOddStr);



        RadioGroup Radioone = (RadioGroup) findViewById(R.id.WireOne);
        RadioGroup Radiotwo = (RadioGroup) findViewById(R.id.WireTwo);
        RadioGroup Radiothree = (RadioGroup) findViewById(R.id.WireThree);
        RadioGroup Radiofour = (RadioGroup) findViewById(R.id.WireFour);
        RadioGroup Radiofive = (RadioGroup) findViewById(R.id.WireFive);
        RadioGroup Radiosix = (RadioGroup) findViewById(R.id.WireSix);


        RadioButton WireOneColor = ((RadioButton) findViewById(Radioone.getCheckedRadioButtonId()));
        RadioButton WireTwoColor = ((RadioButton) findViewById(Radiotwo.getCheckedRadioButtonId()));
        RadioButton WireThreeColor = ((RadioButton) findViewById(Radiothree.getCheckedRadioButtonId()));
        RadioButton WireFourColor = ((RadioButton) findViewById(Radiofour.getCheckedRadioButtonId()));
        RadioButton WireFiveColor = ((RadioButton) findViewById(Radiofive.getCheckedRadioButtonId()));
        RadioButton WireSixColor = ((RadioButton) findViewById(Radiosix.getCheckedRadioButtonId()));

        //Count all of the wires
        //Counting the red wires
        int RedCounter = 0;
        if(WireOneColor.getText().equals("Red"))RedCounter++;
        if(WireTwoColor.getText().equals("Red"))RedCounter++;
        if(WireThreeColor.getText().equals("Red"))RedCounter++;
        if (wireNumberSlider > 3) {if(WireFourColor.getText().equals("Red"))RedCounter++;}
        if (wireNumberSlider > 4) {if(WireFiveColor.getText().equals("Red"))RedCounter++;}
        if (wireNumberSlider > 5) {if(WireSixColor.getText().equals("Red"))RedCounter++;}
        //Counting the blue wires
        int BlueCounter = 0;
        if(WireOneColor.getText().equals("Blue"))BlueCounter++;
        if(WireTwoColor.getText().equals("Blue"))BlueCounter++;
        if(WireThreeColor.getText().equals("Blue"))BlueCounter++;
        if (wireNumberSlider > 3) {if(WireFourColor.getText().equals("Blue"))BlueCounter++;}
        if (wireNumberSlider > 4) {if(WireFiveColor.getText().equals("Blue"))BlueCounter++;}
        if (wireNumberSlider > 5) {if(WireSixColor.getText().equals("Blue"))BlueCounter++;}
        //Counting the yellow wires
        int YellowCounter = 0;
        if(WireOneColor.getText().equals("Yellow"))YellowCounter++;
        if(WireTwoColor.getText().equals("Yellow"))YellowCounter++;
        if(WireThreeColor.getText().equals("Yellow"))YellowCounter++;
        if (wireNumberSlider > 3) {if(WireFourColor.getText().equals("Yellow"))YellowCounter++;}
        if (wireNumberSlider > 4) {if(WireFiveColor.getText().equals("Yellow"))YellowCounter++;}
        if (wireNumberSlider > 5) {if(WireSixColor.getText().equals("Yellow"))YellowCounter++;}
        //Counting the Black wires
        int GreenCounter = 0;
        if(WireOneColor.getText().equals("Black"))GreenCounter++;
        if(WireTwoColor.getText().equals("Black"))GreenCounter++;
        if(WireThreeColor.getText().equals("Black"))GreenCounter++;
        if (wireNumberSlider > 3) {if(WireFourColor.getText().equals("Black"))GreenCounter++;}
        if (wireNumberSlider > 4) {if(WireFiveColor.getText().equals("Black"))GreenCounter++;}
        if (wireNumberSlider > 5) {if(WireSixColor.getText().equals("Black"))GreenCounter++;}
        //Counting the White wires
        int WhiteCounter = 0;
        if(WireOneColor.getText().equals("White"))WhiteCounter++;
        if(WireTwoColor.getText().equals("White"))WhiteCounter++;
        if(WireThreeColor.getText().equals("White"))WhiteCounter++;
        if (wireNumberSlider > 3) {if(WireFourColor.getText().equals("White"))WhiteCounter++;}
        if (wireNumberSlider > 4) {if(WireFiveColor.getText().equals("White"))WhiteCounter++;}
        if (wireNumberSlider > 5) {if(WireSixColor.getText().equals("White"))WhiteCounter++;}

        if (wireNumberSlider == 3){
            if (RedCounter == 0){
                TextView lastwiretext = (TextView) findViewById(R.id.ResultText);
                lastwiretext.setText("Cut the Second Wire!");
            } else if (WireThreeColor.getText().equals("White")){
                TextView lastwiretext = (TextView) findViewById(R.id.ResultText);
                lastwiretext.setText("Cut the Last Wire!");
            } else if (BlueCounter > 1){
                TextView lastwiretext = (TextView) findViewById(R.id.ResultText);
                lastwiretext.setText("Cut the Last Blue Wire!");
            } else {
                TextView lastwiretext = (TextView) findViewById(R.id.ResultText);
                lastwiretext.setText("Cut the Last Wire!");
            }
        }

        if (wireNumberSlider == 4){
            if (RedCounter > 1 && EvenOddStr.equals("Odd")){
                    TextView lastwiretext = (TextView) findViewById(R.id.ResultText);
                    lastwiretext.setText("Cut the last Red Wire!");
            } else if (WireFourColor.getText().equals("Yellow")){
                    TextView lastwiretext = (TextView) findViewById(R.id.ResultText);
                    lastwiretext.setText("Cut the First Wire!");
            } else if (BlueCounter == 1){
                TextView lastwiretext = (TextView) findViewById(R.id.ResultText);
                lastwiretext.setText("Cut the First Wire!");
            } else if (YellowCounter > 1){
                TextView lastwiretext = (TextView) findViewById(R.id.ResultText);
                lastwiretext.setText("Cut the Last Wire!");
            } else {
                TextView lastwiretext = (TextView) findViewById(R.id.ResultText);
                lastwiretext.setText("Cut the Second Wire!");
            }
        }

        if (wireNumberSlider == 5){
            if (WireFiveColor.getText().equals("Black") && EvenOddStr.equals("Odd")){
                    TextView lastwiretext = (TextView) findViewById(R.id.ResultText);
                    lastwiretext.setText("Cut the Fourth Wire!");
            } else if (RedCounter == 1 && YellowCounter > 1){
                    TextView lastwiretext = (TextView) findViewById(R.id.ResultText);
                    lastwiretext.setText("Cut the First Wire!");
            } else if (GreenCounter == 0){
                TextView lastwiretext = (TextView) findViewById(R.id.ResultText);
                lastwiretext.setText("Cut the Second Wire!");
            }  else {
                TextView lastwiretext = (TextView) findViewById(R.id.ResultText);
                lastwiretext.setText("Cut the First Wire!");
            }
        }

        if (wireNumberSlider == 6){
            if (YellowCounter == 0 && EvenOddStr.equals("Odd")){
                    TextView lastwiretext = (TextView) findViewById(R.id.ResultText);
                    lastwiretext.setText("Cut the Thrid Wire!");
            } else if (YellowCounter == 1 && WhiteCounter < 1){
                    TextView lastwiretext = (TextView) findViewById(R.id.ResultText);
                    lastwiretext.setText("Cut the Fourth Wire!");
            } else if (RedCounter == 0){
                TextView lastwiretext = (TextView) findViewById(R.id.ResultText);
                lastwiretext.setText("Cut the Last Wire!");
            }  else {
                TextView lastwiretext = (TextView) findViewById(R.id.ResultText);
                lastwiretext.setText("Cut the Fourth Wire!");
            }
        }
    }

    private String getGlobals(String ID, String Answer){
        Log.d("getGlobal ID", ID);
        Log.d("getGlobal Answer", Answer);
        SharedPreferences AnswerStorage = getSharedPreferences(ID, 0);
        Answer = AnswerStorage.getString(ID, "");
        Log.d("getGlobal Get", Answer);
        return Answer;
    }



}
