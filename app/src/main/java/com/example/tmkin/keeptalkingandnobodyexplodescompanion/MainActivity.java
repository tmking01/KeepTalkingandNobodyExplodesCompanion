package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
    }

    public void onbuttontap(View v) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Ouch!", Toast.LENGTH_LONG);
        myToast.show();
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, SubjectofWires.class);
        startActivity(intent);
    }
    public void BTN(View view) {
        Intent intent = new Intent(this, Buttons.class);
        startActivity(intent);
    }

    public void Setupquestions(View view) {
        Intent setupIntent = new Intent(this, Setup.class);
        startActivity(setupIntent);
    }

    public void resetGlobals(View view){
        Toast saveMessage = Toast.makeText(getApplicationContext(), "Setup Questions Cleared", Toast.LENGTH_LONG);
        saveMessage.show();
        String Answer = "";
        setGlobals(0, Answer, "SerialNumber");
        setGlobals(0, Answer, "ContainsVowel");
        setGlobals(0, Answer, "CARLit");
        setGlobals(0, Answer, "FRKLit");
        setGlobals(0, Answer, "ParalellPort");
    }

    private void setGlobals(int Batteries, String Answer, String ID){
        Log.d("ID", ID);
        Log.d("Answer", Answer);
        SharedPreferences AnswerStorage = getSharedPreferences(ID, 0);
        SharedPreferences.Editor editor = AnswerStorage.edit().clear();
        editor.putString(ID, Answer);
        editor.commit();
    }
}

