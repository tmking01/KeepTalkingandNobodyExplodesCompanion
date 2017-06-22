package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Buttons extends AppCompatActivity {
    public String abort = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

    }


    public void btnAbort(View v){
        abort = "A";
        Button myButtonone = (Button) findViewById(R.id.btnBlue);
        myButtonone.setVisibility(View.VISIBLE);
        Button myButtontwo = (Button) findViewById(R.id.btnYellow);
        myButtontwo.setVisibility(View.VISIBLE);
        Button myButtonthree = (Button) findViewById(R.id.btnWhite);
        myButtonthree.setVisibility(View.VISIBLE);
        Button myButtonfour = (Button) findViewById(R.id.btnOtherColor);
        myButtonfour.setVisibility(View.VISIBLE);
        TextView mylabelone = (TextView) findViewById(R.id.lblStrip);
        mylabelone.setVisibility(View.VISIBLE);
    }
    public void btnDetonate(View v){
        abort = "D";
        Button myButtonone = (Button) findViewById(R.id.btnBlue);
        myButtonone.setVisibility(View.VISIBLE);
        Button myButtontwo = (Button) findViewById(R.id.btnYellow);
        myButtontwo.setVisibility(View.VISIBLE);
        Button myButtonthree = (Button) findViewById(R.id.btnWhite);
        myButtonthree.setVisibility(View.VISIBLE);
        Button myButtonfour = (Button) findViewById(R.id.btnOtherColor);
        myButtonfour.setVisibility(View.VISIBLE);
        TextView mylabelone = (TextView) findViewById(R.id.lblStrip);
        mylabelone.setVisibility(View.VISIBLE);
    }
    public void btnHold(View v){
        abort = "H";
        Button myButtonone = (Button) findViewById(R.id.btnBlue);
        myButtonone.setVisibility(View.VISIBLE);
        Button myButtontwo = (Button) findViewById(R.id.btnYellow);
        myButtontwo.setVisibility(View.VISIBLE);
        Button myButtonthree = (Button) findViewById(R.id.btnWhite);
        myButtonthree.setVisibility(View.VISIBLE);
        Button myButtonfour = (Button) findViewById(R.id.btnOtherColor);
        myButtonfour.setVisibility(View.VISIBLE);
        TextView mylabelone = (TextView) findViewById(R.id.lblStrip);
        mylabelone.setVisibility(View.VISIBLE);
    }
    public void btnOther(View v){
        abort = "O";
        Button myButtonone = (Button) findViewById(R.id.btnBlue);
        myButtonone.setVisibility(View.VISIBLE);
        Button myButtontwo = (Button) findViewById(R.id.btnYellow);
        myButtontwo.setVisibility(View.VISIBLE);
        Button myButtonthree = (Button) findViewById(R.id.btnWhite);
        myButtonthree.setVisibility(View.VISIBLE);
        Button myButtonfour = (Button) findViewById(R.id.btnOtherColor);
        myButtonfour.setVisibility(View.VISIBLE);
        TextView mylabelone = (TextView) findViewById(R.id.lblStrip);
        mylabelone.setVisibility(View.VISIBLE);
    }
    public void btnBlue(View v){
        TextView mylabelone = (TextView) findViewById(R.id.lblAnswer);
        mylabelone.setVisibility(View.VISIBLE);
        mylabelone.setText("Blue");
    }
    public void btnYellow(View v){
        TextView mylabelone = (TextView) findViewById(R.id.lblAnswer);
        mylabelone.setVisibility(View.VISIBLE);
        mylabelone.setText("Yellow");
    }
    public void btnWhite(View v){
        TextView mylabelone = (TextView) findViewById(R.id.lblAnswer);
        mylabelone.setVisibility(View.VISIBLE);
        mylabelone.setText("White");
    }
    public void btnOtherColor(View v){
        TextView mylabelone = (TextView) findViewById(R.id.lblAnswer);
        mylabelone.setVisibility(View.VISIBLE);
        mylabelone.setText("Other");
    }
}
