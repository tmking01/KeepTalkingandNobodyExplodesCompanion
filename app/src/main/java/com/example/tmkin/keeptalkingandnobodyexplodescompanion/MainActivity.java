package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
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
        Toast myToast = Toast.makeText(getApplicationContext(), "Ouch!", Toast.LENGTH_SHORT);
        myToast.show();
    }
    public void Keypads(View view) {
        Intent intent = new Intent(this, Keypads.class);
        startActivity(intent);
    }
    public void simpleWiresClick(View view) {
        Intent intent = new Intent(this, SubjectofWires.class);
        startActivity(intent);
    }
    public void buttonsClick(View view) {
        Intent intent = new Intent(this, Buttons.class);
        startActivity(intent);
    }
    public void password(View view) {
        Intent intent = new Intent(this, Password.class);
        startActivity(intent);
    }

    public void Setupquestions(View view) {
        Intent setupIntent = new Intent(this, Setup.class);
        startActivity(setupIntent);
    }
    public void Simonsays(View view) {
        Intent intent = new Intent(this, SimonSays.class);
        startActivity(intent);
    }


    public void openBombDefuse(View view){
        Uri defuseLink = Uri.parse("http://www.bombmanual.com/manual/1/html/index.html");
        Intent intent = new Intent(Intent.ACTION_VIEW, defuseLink);
        startActivity(intent);
    }
}

