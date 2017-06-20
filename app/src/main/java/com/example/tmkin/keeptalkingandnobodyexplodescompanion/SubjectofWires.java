package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
        int wireNumberSlider = PRICEbar.getProgress();
        wireNumberSlider = wireNumberSlider + 3;


        //Radio6 - Blue
        //Radio7 - Yellow
        //Radio8 - Green
        //Radio9 - White
        //Radio10 - Red

        RadioGroup Radioone = (RadioGroup) findViewById(R.id.WireOne);
        RadioGroup Radiotwo = (RadioGroup) findViewById(R.id.WireTwo);
        RadioGroup Radiothree = (RadioGroup) findViewById(R.id.WireThree);
        RadioGroup Radiofour = (RadioGroup) findViewById(R.id.WireFour);
        RadioGroup Radiofive = (RadioGroup) findViewById(R.id.WireFive);
        RadioGroup Radiosix = (RadioGroup) findViewById(R.id.WireSix);
        TextView lastwiretext = (TextView) findViewById(R.id.LastWire);
        //RadioButton Radioone_one = (RadioButton) findViewById(R.id.radioButton6);

        RadioButton WireOneColor = ((RadioButton) findViewById(Radioone.getCheckedRadioButtonId()));
        RadioButton WireTwoColor = ((RadioButton) findViewById(Radiotwo.getCheckedRadioButtonId()));
        RadioButton WireThreeColor = ((RadioButton) findViewById(Radiothree.getCheckedRadioButtonId()));
        RadioButton WireFourColor = ((RadioButton) findViewById(Radiofour.getCheckedRadioButtonId()));
        RadioButton WireFiveColor = ((RadioButton) findViewById(Radiofive.getCheckedRadioButtonId()));
        RadioButton WireSixColor = ((RadioButton) findViewById(Radiosix.getCheckedRadioButtonId()));

        //int selectedId = Radioone.getCheckedRadioButtonId();
        //Colorcounter(WireOneColor.getText());
        //String selectedid = String.valueOf(selectedId);
        //RadioButton radioButton = (RadioButton) findViewById(selectedId);
        //Toast.makeText(getApplicationContext(),radioButton.getText(), Toast.LENGTH_SHORT).show()


        Toast.makeText(getApplicationContext(),WireOneColor.getText(), Toast.LENGTH_SHORT).show();
  ;


    }


}
