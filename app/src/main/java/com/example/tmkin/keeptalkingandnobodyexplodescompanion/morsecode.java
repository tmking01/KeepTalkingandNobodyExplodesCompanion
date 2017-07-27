package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class morsecode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morsecode);


        Button btnmorse = (Button) findViewById(R.id.btnlight);
        final TextView label = (TextView) findViewById(R.id.lblshortlong);
        Button button = (Button) findViewById(R.id.btnspace);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addcode(" ",label);
                //Toast.makeText(getApplicationContext(), "Short!!", Toast.LENGTH_SHORT).show();
            }
        });

        btnmorse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addcode("s",label);
                //Toast.makeText(getApplicationContext(), "Short!!", Toast.LENGTH_SHORT).show();
            }
        });

        btnmorse.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                addcode("l",label);
                //Toast.makeText(getApplicationContext(), "long!!", Toast.LENGTH_SHORT).show();
                return true;
            }
        });


    }
    public void addcode(String LS, TextView updatelbl) {
        if(updatelbl.getText().length() > 6){
            updatelbl.setText(updatelbl.getText()+LS);
            matching();
            Read();
        } else{
            updatelbl.setText(updatelbl.getText()+LS);
            Read();
        }
    }

    public void matching() {
        EditText textbox = (EditText) findViewById(R.id.editText2);
        TextView label = (TextView) findViewById(R.id.lblmorseanswer);
        String userinput = String.valueOf(textbox.getText());
        String morph;
        double CurrentPercentage = 0;
        double StoredPercentage = 0;
        double StoredPercentage2 = 0;
        double StoredPercentage3 = 0;
        Integer StoredPercentageinteger = 0;
        Integer StoredPercentageinteger2 = 0;
        Integer StoredPercentageinteger3 = 0;
        String concat = "";
        Integer maxloop = userinput.length();

        double lettermatchcount = matchcount(userinput.toUpperCase());
        double lettercount = userinput.length();
        StoredPercentage = (lettermatchcount / lettercount) * 100;

        for (int loopcount = 0; loopcount < maxloop - 1; loopcount++) {
            morph = userinput.substring(loopcount + 1, userinput.length()) + userinput.substring(0, loopcount + 1);
            morph = morph.toUpperCase();
            lettermatchcount = matchcount(morph.toUpperCase());
            lettercount = userinput.length();
            CurrentPercentage = (lettermatchcount / lettercount) * 100;
            if (CurrentPercentage > StoredPercentage) {
                StoredPercentage = CurrentPercentage;
            }

            concat = concat + String.valueOf(CurrentPercentage) + ", ";
        }

        Integer temp = 0;

        for (int loopcount = 0; loopcount < 14; loopcount++) {
            if (Integer.valueOf(Wordpercentages[loopcount]) > Integer.valueOf(temp)) {
                temp = Wordpercentages[loopcount];
                StoredPercentage3 = StoredPercentage2;
                StoredPercentage2 = StoredPercentage;
                StoredPercentage = (Wordpercentages[loopcount] / lettercount) * 100;
                StoredPercentageinteger3 = StoredPercentageinteger2;
                StoredPercentageinteger2 = StoredPercentageinteger;
                StoredPercentageinteger = loopcount;
                ;
            }
        }

        String returnanswer = String.format("%.2f", StoredPercentage);
        if(StoredPercentage > StoredPercentage2+.2){
            StoredPercentage=99.99;
        }

        String output = RadioAnswers[StoredPercentageinteger] + "@ " + StoredPercentage + "%";
        TextView one = (TextView) findViewById(R.id.lblMorseanswerone);
        TextView two = (TextView) findViewById(R.id.lblmorseanswertwo);
        TextView three = (TextView) findViewById(R.id.lblmorseanswerthree);
        one.setText(RadioAnswers[StoredPercentageinteger] + "@ " + String.format("%.2f",StoredPercentage) + "%");
        two.setText(RadioAnswers[StoredPercentageinteger2] + "@ " + String.format("%.2f",StoredPercentage2) + "%");
        three.setText(RadioAnswers[StoredPercentageinteger3] + "@ " + String.format("%.2f",StoredPercentage3) + "%");

        label.setText(output);
    }


    public String Read() {

        String decodedtext = "";
        String Decode="";

        TextView label = (TextView) findViewById(R.id.lblshortlong);
        String parser = label.getText().toString();
        String tempword = "";

        for (int loopcounter = 0; loopcounter < label.getText().length(); loopcounter++) {
            if (parser.substring(loopcounter,loopcounter+1).equals(" ")){
                // Cut the word and start a new word
                Decodemorse(tempword);
                label.setText("");
                tempword = "";
            } else {
                //keep treaking on the same word.
                tempword += parser.substring(loopcounter,loopcounter+1);
            }
        }

        return Decode;
    }
    public void Decodemorse(String input) {
        if(input == "") {

        } else {
            String answer = "";
            EditText one = (EditText) findViewById(R.id.editText2);
            switch (input) {
                case "l":
                    answer = "t";
                    break;
                case "ll":
                    answer = "m";
                    break;
                case "lll":
                    answer = "o";
                    break;
                case "lsss":
                    answer = "b";
                    break;
                case "lsls":
                    answer = "c";
                    break;
                case "lssl":
                    answer = "x";
                    break;
                case "s":
                    answer = "e";
                    break;
                case "sl":
                    answer = "a";
                    break;
                case "ss":
                    answer = "i";
                    break;
                case "sls":
                    answer = "r";
                    break;
                case "sss":
                    answer = "s";
                    break;
                case "ssls":
                    answer = "f";
                    break;
                case "ssss":
                    answer = "h";
                    break;
                case "sssl":
                    answer = "v";
                    break;
                case "slss":
                    answer = "l";
                    break;
            }
            one.setText(one.getText() + answer);
        }
    }

    public Integer matchcount(String userinput) {
        Integer maxloop = userinput.length();
        Integer matchcount = 0;
        if (maxloop > 25) {
        } else {
            for (int loopcounter = 0; loopcounter < 14; loopcounter++) {
                matchcount = 0;
                //Log.d("OutterLoop", LOOPAnswers[loopcounter]);
                for (int loopcount = 0; loopcount < maxloop; loopcount++) {
                    if (LOOPAnswers[loopcounter].substring(loopcount, loopcount + 1).equals(userinput.substring(loopcount, loopcount + 1))) {
                        matchcount++;
                        //Log.d("InnerLoop", LOOPAnswers[loopcounter].substring(loopcount, loopcount + 1) + "=" + userinput.substring(loopcount, loopcount + 1));
                        //Log.d("InnerLoop", "Match Value is currently=" + matchcount);
                        if (matchcount > Wordpercentages[loopcounter]){
                            Log.d("InnerInnerLoop", "Match Value is being updated to=" + matchcount);
                            Wordpercentages[loopcounter] = matchcount;
                        }
                    } else {
                        //Log.d("InnerLoop", LOOPAnswers[loopcounter].substring(loopcount, loopcount + 1) + "<>" + userinput.substring(loopcount, loopcount + 1));
                    }
                }
            }
        }
        return matchcount;
    }

    final Integer Wordpercentages[] = {
            0
            , 0
            , 0
            , 0
            , 0
            , 0
            , 0
            , 0
            , 0
            , 0
            , 0
            , 0
            , 0
            , 0
            , 0
            , 0
    };

    final String WordAnswers[] = {
            "SHELL"
            , "HALLS"
            , "SLICK"
            , "TRICK"
            , "BOXES"
            , "LEAKS"
            , "STROBE"
            , "BISTRO"
            , "FLICK"
            , "BOMBS"
            , "BREAK"
            , "BRICK"
            , "STEAK"
            , "STING"
            , "VECTOR"
            , "BEATS"
    };
    final String RadioAnswers[] = {
            "3.505MHz"
            , "3.515MHz"
            , "3.522MHz"
            , "3.532MHz"
            , "3.535MHz"
            , "3.542MHz"
            , "3.545MHz"
            , "3.552MHz"
            , "3.555MHz"
            , "3.565MHz"
            , "3.572MHz"
            , "3.575MHz"
            , "3.582MHz"
            , "3.592MHz"
            , "3.595MHz"
            , "3.600MHz"
    };
    final String LOOPAnswers[] = {
            "SHELLSHELLSHELLSHELLSHELLSHELLSHELLSHELLSHELLSHELLSHELLSHELLSHELL"
            , "HALLSHALLSHALLSHALLSHALLSHALLSHALLSHALLSHALLSHALLSHALLSHALLSHALLS"
            , "SLICKSLICKSLICKSLICKSLICKSLICKSLICKSLICKSLICKSLICKSLICKSLICKSLICK"
            , "TRICKTRICKTRICKTRICKTRICKTRICKTRICKTRICKTRICKTRICKTRICKTRICKTRICKTRICK"
            , "BOXESBOXESBOXESBOXESBOXESBOXESBOXESBOXESBOXESBOXESBOXESBOXESBOXESBOXESBOXES"
            , "LEAKSLEAKSLEAKSLEAKSLEAKSLEAKSLEAKSLEAKSLEAKSLEAKSLEAKSLEAKSLEAKSLEAKS"
            , "STROBESTROBESTROBESTROBESTROBESTROBESTROBESTROBESTROBESTROBESTROBESTROBE"
            , "BISTROBISTROBISTROBISTROBISTROBISTROBISTROBISTROBISTROBISTROBISTROBISTRO"
            , "FLICKFLICKFLICKFLICKFLICKFLICKFLICKFLICKFLICKFLICKFLICKFLICKFLICKFLICK"
            , "BOMBSBOMBSBOMBSBOMBSBOMBSBOMBSBOMBSBOMBSBOMBSBOMBSBOMBSBOMBSBOMBSBOMBS"
            , "BREAKBREAKBREAKBREAKBREAKBREAKBREAKBREAKBREAKBREAKBREAKBREAKBREAKBREAK"
            , "BRICKBRICKBRICKBRICKBRICKBRICKBRICKBRICKBRICKBRICKBRICKBRICKBRICKBRICK"
            , "STEAKSTEAKSTEAKSTEAKSTEAKSTEAKSTEAKSTEAKSTEAKSTEAKSTEAKSTEAKSTEAKSTEAK"
            , "STINGSTINGSTINGSTINGSTINGSTINGSTINGSTINGSTINGSTINGSTINGSTINGSTINGSTING"
            , "VECTORVECTORVECTORVECTORVECTORVECTORVECTORVECTORVECTORVECTORVECTORVECTOR"
            , "BEATSBEATSBEATSBEATSBEATSBEATSBEATSBEATSBEATSBEATSBEATSBEATSBEATSBEATSBEATS"
    };
}