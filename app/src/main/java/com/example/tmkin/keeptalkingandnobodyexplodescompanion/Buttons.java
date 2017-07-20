package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Buttons extends AppCompatActivity {
    public String abort = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);




    }

    private String getGlobals(String ID, String Answer){
        Log.d("getGlobal ID", ID);
        Log.d("getGlobal Answer", Answer);
        SharedPreferences AnswerStorage = getSharedPreferences(ID, 0);
        Answer = AnswerStorage.getString(ID, "");
        Log.d("getGlobal Get", Answer);
        return Answer;
    }

    public void btnAbort(View v){

        //Need to add a stipulation that the color must be blue
        RadioGroup Radioone = (RadioGroup) findViewById(R.id.WireOne);
        RadioButton WireOneColor = ((RadioButton) findViewById(Radioone.getCheckedRadioButtonId()));
        String frk = "";
        frk = getGlobals("FRKLit", frk);
        String bat = "";
        int battery = 0;
        battery = Integer.parseInt(getGlobals("Batteries", bat));



        if (WireOneColor.getText().equals("Blue")) {
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
        } else{
            if (battery > 2 && frk.equals("Yes")){
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
    public void btnDetonate(View v){
        abort = "D";
        //Check if more than one battery
        String frk = "";
        frk = getGlobals("FRKLit", frk);
        String car = "";
        car = getGlobals("CARLit", car);
        String bat = "";
        int battery = 0;
        battery = Integer.parseInt(getGlobals("Batteries", bat));
        RadioGroup Radioone = (RadioGroup) findViewById(R.id.WireOne);
        RadioButton WireOneColor = ((RadioButton) findViewById(Radioone.getCheckedRadioButtonId()));


        if (battery > 1) {
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

            if (WireOneColor.getText().equals("White") && car.equals("Yes")){
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
            } else if (frk.equals("Yes") && battery > 2) {
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

        //Check if more than one battery
        String frk = "";
        frk = getGlobals("FRKLit", frk);
        String bat = "";
        int battery = 0;
        battery = Integer.parseInt(getGlobals("Batteries", bat));
        RadioGroup Radioone = (RadioGroup) findViewById(R.id.WireOne);
        RadioButton WireOneColor = ((RadioButton) findViewById(Radioone.getCheckedRadioButtonId()));


        if ((battery > 2 && frk.equals("Yes")) || WireOneColor.getText().equals("Red")) {
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
        }  else {
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
        mylabelone.setText("Release with 5 in any position");
    }
    public void btnWhite(View v){
        TextView mylabelone = (TextView) findViewById(R.id.lblAnswer);
        mylabelone.setVisibility(View.VISIBLE);
        mylabelone.setText("Release with 1 in any position");
    }
    public void btnOtherColor(View v){
        TextView mylabelone = (TextView) findViewById(R.id.lblAnswer);
        mylabelone.setVisibility(View.VISIBLE);
        mylabelone.setText("Release with 1 in any position");
    }




}
