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
        mylabelone.setText("Press and Hold!");
        TextView mylabeltwo = (TextView) findViewById(R.id.lblAnswer);
        mylabeltwo.setVisibility(View.INVISIBLE);
        //This is done.
    }
    public void btnDetonate(View v){
        abort = "D";
        //Check if more than one battery
        if (1 == 1) {
            //Press and Release
            Button myButtonone = (Button) findViewById(R.id.btnBlue);
            myButtonone.setVisibility(View.INVISIBLE);
            Button myButtontwo = (Button) findViewById(R.id.btnYellow);
            myButtontwo.setVisibility(View.INVISIBLE);
            Button myButtonthree = (Button) findViewById(R.id.btnWhite);
            myButtonthree.setVisibility(View.INVISIBLE);
            Button myButtonfour = (Button) findViewById(R.id.btnOtherColor);
            myButtonfour.setVisibility(View.INVISIBLE);
            TextView mylabelone = (TextView) findViewById(R.id.lblStrip);
            mylabelone.setVisibility(View.VISIBLE);
            mylabelone.setText("Press and Release!");
            TextView mylabeltwo = (TextView) findViewById(R.id.lblAnswer);
            mylabeltwo.setVisibility(View.INVISIBLE);
        } else {
            //If more than 2 batteries and a lit indicator of FRK
            if (2 == 2) {
                //press and release
                Button myButtonone = (Button) findViewById(R.id.btnBlue);
                myButtonone.setVisibility(View.INVISIBLE);
                Button myButtontwo = (Button) findViewById(R.id.btnYellow);
                myButtontwo.setVisibility(View.INVISIBLE);
                Button myButtonthree = (Button) findViewById(R.id.btnWhite);
                myButtonthree.setVisibility(View.INVISIBLE);
                Button myButtonfour = (Button) findViewById(R.id.btnOtherColor);
                myButtonfour.setVisibility(View.INVISIBLE);
                TextView mylabelone = (TextView) findViewById(R.id.lblStrip);
                mylabelone.setVisibility(View.VISIBLE);
                mylabelone.setText("Press and Release!");
                TextView mylabeltwo = (TextView) findViewById(R.id.lblAnswer);
                mylabeltwo.setVisibility(View.INVISIBLE);
            } else {
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
                mylabelone.setText("Press and Hold!");
                TextView mylabeltwo = (TextView) findViewById(R.id.lblAnswer);
                mylabeltwo.setVisibility(View.INVISIBLE);
            }
        }
    }
    public void btnHold(View v){
        abort = "H";
        //If the label color is Red - Press and release
        if (1 == 1) {
            //press and release
            Button myButtonone = (Button) findViewById(R.id.btnBlue);
            myButtonone.setVisibility(View.INVISIBLE);
            Button myButtontwo = (Button) findViewById(R.id.btnYellow);
            myButtontwo.setVisibility(View.INVISIBLE);
            Button myButtonthree = (Button) findViewById(R.id.btnWhite);
            myButtonthree.setVisibility(View.INVISIBLE);
            Button myButtonfour = (Button) findViewById(R.id.btnOtherColor);
            myButtonfour.setVisibility(View.INVISIBLE);
            TextView mylabelone = (TextView) findViewById(R.id.lblStrip);
            mylabelone.setVisibility(View.VISIBLE);
            mylabelone.setText("Press and Release!");
            TextView mylabeltwo = (TextView) findViewById(R.id.lblAnswer);
            mylabeltwo.setVisibility(View.INVISIBLE);
        } else {
            //If more than 2 batteries and a lit indicator of FRK
            if (2 == 2) {
                //press and release
                Button myButtonone = (Button) findViewById(R.id.btnBlue);
                myButtonone.setVisibility(View.INVISIBLE);
                Button myButtontwo = (Button) findViewById(R.id.btnYellow);
                myButtontwo.setVisibility(View.INVISIBLE);
                Button myButtonthree = (Button) findViewById(R.id.btnWhite);
                myButtonthree.setVisibility(View.INVISIBLE);
                Button myButtonfour = (Button) findViewById(R.id.btnOtherColor);
                myButtonfour.setVisibility(View.INVISIBLE);
                TextView mylabelone = (TextView) findViewById(R.id.lblStrip);
                mylabelone.setVisibility(View.VISIBLE);
                mylabelone.setText("Press and Release!");
                TextView mylabeltwo = (TextView) findViewById(R.id.lblAnswer);
                mylabeltwo.setVisibility(View.INVISIBLE);
            } else {
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
                mylabelone.setText("Press and Hold!");
                TextView mylabeltwo = (TextView) findViewById(R.id.lblAnswer);
                mylabeltwo.setVisibility(View.INVISIBLE);
            }
        }

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
        mylabelone.setText("Press and Hold!");
        TextView mylabeltwo = (TextView) findViewById(R.id.lblAnswer);
        mylabeltwo.setVisibility(View.INVISIBLE);
    }
    public void btnBlue(View v){
        TextView mylabelone = (TextView) findViewById(R.id.lblAnswer);
        mylabelone.setVisibility(View.VISIBLE);
        mylabelone.setText("Release with 4 in any position");
    }
    public void btnYellow(View v){
        TextView mylabelone = (TextView) findViewById(R.id.lblAnswer);
        mylabelone.setVisibility(View.VISIBLE);
        mylabelone.setText("Release with 1 in any position");
    }
    public void btnWhite(View v){
        TextView mylabelone = (TextView) findViewById(R.id.lblAnswer);
        mylabelone.setVisibility(View.VISIBLE);
        mylabelone.setText("Release with 5 in any position");
    }
    public void btnOtherColor(View v){
        TextView mylabelone = (TextView) findViewById(R.id.lblAnswer);
        mylabelone.setVisibility(View.VISIBLE);
        mylabelone.setText("Release with 1 in any position");
    }




}
