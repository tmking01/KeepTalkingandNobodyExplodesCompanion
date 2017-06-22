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
        Button myButtonone = (Button) findViewById(R.id.btnAbort);
        myButtonone.setVisibility(View.VISIBLE);
        Button myButtontwo = (Button) findViewById(R.id.btnDetonate);
        myButtontwo.setVisibility(View.VISIBLE);
        Button myButtonthree = (Button) findViewById(R.id.btnHold);
        myButtonthree.setVisibility(View.VISIBLE);
        Button myButtonfour = (Button) findViewById(R.id.btnOther);
        myButtonfour.setVisibility(View.VISIBLE);
        TextView mylabelone = (TextView) findViewById(R.id.lblStrip);
        mylabelone.setVisibility(View.VISIBLE);
    }
    public void btnDetonate(View v){
        abort = "D";
        Button myButtonone = (Button) findViewById(R.id.btnAbort);
        Button myButtontwo = (Button) findViewById(R.id.btnDetonate);
        Button myButtonthree = (Button) findViewById(R.id.btnHold);
        Button myButtonfour = (Button) findViewById(R.id.btnOther);
        TextView mylabelone = (TextView) findViewById(R.id.lblStrip);
        myButtonone.setVisibility(View.VISIBLE);
        myButtontwo.setVisibility(View.VISIBLE);
        myButtonthree.setVisibility(View.VISIBLE);
        myButtonfour.setVisibility(View.VISIBLE);
        mylabelone.setVisibility(View.VISIBLE);
    }
    public void btnHold(View v){
        abort = "H";
        Button myButtonone = (Button) findViewById(R.id.btnAbort);
        Button myButtontwo = (Button) findViewById(R.id.btnDetonate);
        Button myButtonthree = (Button) findViewById(R.id.btnHold);
        Button myButtonfour = (Button) findViewById(R.id.btnOther);
        TextView mylabelone = (TextView) findViewById(R.id.lblStrip);
        myButtonone.setVisibility(View.VISIBLE);
        myButtontwo.setVisibility(View.VISIBLE);
        myButtonthree.setVisibility(View.VISIBLE);
        myButtonfour.setVisibility(View.VISIBLE);
        mylabelone.setVisibility(View.VISIBLE);
    }
    public void btnOther(View v){
        abort = "O";
        Button myButtonone = (Button) findViewById(R.id.btnAbort);
        Button myButtontwo = (Button) findViewById(R.id.btnDetonate);
        Button myButtonthree = (Button) findViewById(R.id.btnHold);
        Button myButtonfour = (Button) findViewById(R.id.btnOther);
        TextView mylabelone = (TextView) findViewById(R.id.lblStrip);
        myButtonone.setVisibility(View.VISIBLE);
        myButtontwo.setVisibility(View.VISIBLE);
        myButtonthree.setVisibility(View.VISIBLE);
        myButtonfour.setVisibility(View.VISIBLE);
        mylabelone.setVisibility(View.VISIBLE);
    }


}
