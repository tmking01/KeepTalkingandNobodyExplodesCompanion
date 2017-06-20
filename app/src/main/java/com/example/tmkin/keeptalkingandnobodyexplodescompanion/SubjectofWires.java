package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class SubjectofWires extends AppCompatActivity {

    private SeekBar PRICEbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjectof_wires);
        PRICEbar = (SeekBar)findViewById(R.id.WireNumberSlider);
        TextView lastwiretext = (TextView) findViewById(R.id.LastWire);
        lastwiretext.setText("");



    }

    public void GetControls(View v){
        Switch onOffSwitch = (Switch)  findViewById(R.id.HasRedwire);
        onOffSwitch.setVisibility(View.VISIBLE);

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
        if (wireNumberSlider == 3) {

        }
    }


    public void getresults(View v){
        TextView lastwiretext = (TextView) findViewById(R.id.LastWire);
        lastwiretext.setText("Test");

        int wireNumberSlider = PRICEbar.getProgress();
        String wireNumberslider = String.valueOf(wireNumberSlider);
        if (wireNumberSlider == 3) {
            //lastwiretext.setText("Test");
        }
            Toast myToast = Toast.makeText(getApplicationContext(), wireNumberslider, Toast.LENGTH_SHORT);
            myToast.show();

    }



}
