package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.app.Application;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;
import android.widget.ToggleButton;

public class Setup extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);
    }
    @Override
    protected void onResume(){
        super.onResume();
        loadViews();
    }

    private void loadViews(){
        Log.d("Answer", "Made it into load views");
        String Answer = "";
        //Setting the Serial Number Toggle Button
        Answer = getGlobals("SerialNumber", Answer);
        ToggleButton AnswerView = (ToggleButton) findViewById(R.id.SerialNumToggle);
        setToggleButtons(AnswerView, Answer);
        //Setting the Contains Vowel Toggle Button
        Answer = getGlobals("ContainsVowel", Answer);
        AnswerView = (ToggleButton) findViewById(R.id.VowelToggle);
        setToggleButtons(AnswerView, Answer);
        //Setting the CAR Toggle Button
        Answer = getGlobals("CARLit", Answer);
        AnswerView = (ToggleButton) findViewById(R.id.CARToggle);
        setToggleButtons(AnswerView, Answer);
        //Setting for FRK Toggle Button
        Answer = getGlobals("FRKLit", Answer);
        AnswerView = (ToggleButton) findViewById(R.id.FRKToggle);
        setToggleButtons(AnswerView, Answer);
        //Setting for Paralell Port Toggle Button
        Answer = getGlobals("ParalellPort", Answer);
        AnswerView = (ToggleButton) findViewById(R.id.ParalellToggle);
        setToggleButtons(AnswerView, Answer);
        //Setting for Battery seek bar
        Answer = getGlobals("Batteries", Answer);
        SeekBar batSeekView = (SeekBar) findViewById(R.id.BatterySeek);
        int batSeekVal = 0;
        try{
            batSeekVal = Integer.parseInt(Answer);
        }catch (NumberFormatException nfe) {
            batSeekVal = 0;
        };
        batSeekView.setProgress(batSeekVal);
    }

    public void saveClicked(View view){
        // Tells the user that the page was saved
        Toast saveMessage = Toast.makeText(getApplicationContext(), "Setup Questions Saved", Toast.LENGTH_LONG);
        saveMessage.show();
        //Gets the even or odd Question answered
        ToggleButton AnswerView = (ToggleButton) findViewById(R.id.SerialNumToggle);
        String Answer = AnswerView.getText().toString();
        setGlobals(0, Answer, "SerialNumber");
        //Answers the SN with a Vowel Question
        AnswerView = (ToggleButton) findViewById(R.id.VowelToggle);
        Answer = AnswerView.getText().toString();
        setGlobals(0, Answer, "ContainsVowel");
        //Answers the CarLit Question
        AnswerView = (ToggleButton) findViewById(R.id.CARToggle);
        Answer = AnswerView.getText().toString();
        setGlobals(0, Answer, "CARLit");
        //Answers the FRK Lit Question
        AnswerView = (ToggleButton) findViewById(R.id.FRKToggle);
        Answer = AnswerView.getText().toString();
        setGlobals(0, Answer, "FRKLit");
        //Answers the Paralell Port Question
        AnswerView = (ToggleButton) findViewById(R.id.ParalellToggle);
        Answer = AnswerView.getText().toString();
        setGlobals(0, Answer, "ParalellPort");
        //Answers the Battery Amount Question
        SeekBar batSeek = (SeekBar) findViewById(R.id.BatterySeek);
        int Batteries = batSeek.getProgress();
        setGlobals(Batteries, Answer, "Batteries");
    }

    public void resetClicked(View view){
        Toast saveMessage = Toast.makeText(getApplicationContext(), "Setup Questions Cleared", Toast.LENGTH_LONG);
        saveMessage.show();
        String Answer = "";
        clearGlobals(0, Answer, "SerialNumber");
        clearGlobals(0, Answer, "ContainsVowel");
        clearGlobals(0, Answer, "CARLit");
        clearGlobals(0, Answer, "FRKLit");
        clearGlobals(0, Answer, "ParalellPort");

        ToggleButton AnswerView = (ToggleButton) findViewById(R.id.SerialNumToggle);
        Answer = "Even";
        setToggleButtons(AnswerView, Answer);
        //Answers the SN with a Vowel Question
        AnswerView = (ToggleButton) findViewById(R.id.VowelToggle);
        Answer = "Yes";
        setToggleButtons(AnswerView, Answer);
        //Answers the CarLit Question
        AnswerView = (ToggleButton) findViewById(R.id.CARToggle);
        Answer = "Yes";
        setToggleButtons(AnswerView, Answer);
        //Answers the FRK Lit Question
        AnswerView = (ToggleButton) findViewById(R.id.FRKToggle);
        Answer = "Yes";
        setToggleButtons(AnswerView, Answer);
        //Answers the Paralell Port Question
        AnswerView = (ToggleButton) findViewById(R.id.ParalellToggle);
        Answer = "Yes";
        setToggleButtons(AnswerView, Answer);
        //Sets the batteries back to 0
        SeekBar batSeek = (SeekBar) findViewById(R.id.BatterySeek);
        batSeek.setProgress(0);
    }

    private void clearGlobals(int Batteries, String Answer, String ID){
        SharedPreferences AnswerStorage = getSharedPreferences(ID, 0);
        SharedPreferences.Editor editor = AnswerStorage.edit().clear();
        editor.putString(ID, Answer);
        editor.commit();
    }

    private void setGlobals(int Batteries, String Answer, String ID){
        SharedPreferences AnswerStorage = getSharedPreferences(ID, 0);
        SharedPreferences.Editor editor = AnswerStorage.edit();
        if(ID == "Batteries"){
            Answer = String.valueOf(Batteries);
        }
        editor.putString(ID, Answer);
        editor.commit();
        Log.d("SetGloabal ID", ID);
        Log.d("SetGlobal Answer", Answer);
    }

    private void setToggleButtons(ToggleButton AnswerView ,String Answer){
        Log.d("SetToggle", Answer);
        if(Answer.equals("Even")){
            AnswerView.setChecked(false);
        }
        if(Answer.equals("Odd")){
            AnswerView.setChecked(true);
        }
        if(Answer.equals("Yes")){
            AnswerView.setChecked(false);
        }
        if(Answer.equals("No")){
            AnswerView.setChecked(true);
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
