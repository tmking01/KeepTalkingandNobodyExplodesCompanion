package com.example.tmkin.keeptalkingandnobodyexplodescompanion;


import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class complex_wires extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complex_wires);
        ImageButton one = (ImageButton) findViewById(R.id.comwireone);
        one.setTag("Grey");
        ImageButton two = (ImageButton) findViewById(R.id.comwiretwo);
        two.setTag("Grey");
        ImageButton three = (ImageButton) findViewById(R.id.comwirethree);
        three.setTag("Grey");
        ImageButton four = (ImageButton) findViewById(R.id.comwirefour);
        four.setTag("Grey");
        ImageButton five = (ImageButton) findViewById(R.id.comwirefive);
        five.setTag("Grey");
        ImageButton six = (ImageButton) findViewById(R.id.comwiresix);
        six.setTag("Grey");

        ImageButton cone = (ImageButton) findViewById(R.id.comledone);
        cone.setTag("off");
        ImageButton ctwo = (ImageButton) findViewById(R.id.comledtwo);
        ctwo.setTag("off");
        ImageButton cthree = (ImageButton) findViewById(R.id.comledthree);
        cthree.setTag("off");
        ImageButton cfour = (ImageButton) findViewById(R.id.comledfour);
        cfour.setTag("off");
        ImageButton cfive = (ImageButton) findViewById(R.id.comledfive);
        cfive.setTag("off");
        ImageButton csix = (ImageButton) findViewById(R.id.comledsix);
        csix.setTag("off");

        ImageButton done = (ImageButton) findViewById(R.id.comstartone);
        done.setTag("off");
        ImageButton dtwo = (ImageButton) findViewById(R.id.comstarttwo);
        dtwo.setTag("off");
        ImageButton dthree = (ImageButton) findViewById(R.id.comstartthree);
        dthree.setTag("off");
        ImageButton dfour = (ImageButton) findViewById(R.id.comstarfour);
        dfour.setTag("off");
        ImageButton dfive = (ImageButton) findViewById(R.id.comstarfive);
        dfive.setTag("off");
        ImageButton dsix = (ImageButton) findViewById(R.id.comstarsix);
        dsix.setTag("off");
    }

    public void checklabels () {
        ImageButton one = (ImageButton) findViewById(R.id.comwireone);
        String onea = (String) one.getTag();
        ImageButton two = (ImageButton) findViewById(R.id.comwiretwo);
        String twoa = (String) two.getTag();
        ImageButton three = (ImageButton) findViewById(R.id.comwirethree);
        String threea = (String) three.getTag();
        ImageButton four = (ImageButton) findViewById(R.id.comwirefour);
        String foura = (String) four.getTag();
        ImageButton five = (ImageButton) findViewById(R.id.comwirefive);
        String fivea = (String) five.getTag();
        ImageButton six = (ImageButton) findViewById(R.id.comwiresix);
        String sixa = (String) six.getTag();

        ImageButton cone = (ImageButton) findViewById(R.id.comledone);
        String oneb = (String) cone.getTag();
        ImageButton ctwo = (ImageButton) findViewById(R.id.comledtwo);
        String twob = (String) ctwo.getTag();
        ImageButton cthree = (ImageButton) findViewById(R.id.comledthree);
        String threeb = (String) cthree.getTag();
        ImageButton cfour = (ImageButton) findViewById(R.id.comledfour);
        String fourb = (String) cfour.getTag();
        ImageButton cfive = (ImageButton) findViewById(R.id.comledfive);
        String fiveb = (String) cfive.getTag();
        ImageButton csix = (ImageButton) findViewById(R.id.comledsix);
        String sixb = (String) csix.getTag();

        ImageButton done = (ImageButton) findViewById(R.id.comstartone);
        String onec = (String) done.getTag();
        ImageButton dtwo = (ImageButton) findViewById(R.id.comstarttwo);
        String twoc = (String) dtwo.getTag();
        ImageButton dthree = (ImageButton) findViewById(R.id.comstartthree);
        String threec = (String) dthree.getTag();
        ImageButton dfour = (ImageButton) findViewById(R.id.comstarfour);
        String fourc = (String) dfour.getTag();
        ImageButton dfive = (ImageButton) findViewById(R.id.comstarfive);
        String fivec = (String) dfive.getTag();
        ImageButton dsix = (ImageButton) findViewById(R.id.comstarsix);
        String sixc = (String) dsix.getTag();

        ImageView lblone = (ImageView) findViewById(R.id.lblcutone);
        ImageView lbltwo = (ImageView) findViewById(R.id.lblcuttwo);
        ImageView lblthree = (ImageView) findViewById(R.id.lblcutthree);
        ImageView lblfour = (ImageView) findViewById(R.id.lblcutfour);
        ImageView lblfive = (ImageView) findViewById(R.id.lblcutfive);
        ImageView lblsix = (ImageView) findViewById(R.id.lblcutsix);

        if(CheckCut(onea,onea,oneb,onec)== "Cut"){lblone.setVisibility(View.VISIBLE);} else {lblone.setVisibility(View.INVISIBLE);}
        if(CheckCut(twoa,twoa,twob,twoc)== "Cut"){lbltwo.setVisibility(View.VISIBLE);} else {lbltwo.setVisibility(View.INVISIBLE);}
        if(CheckCut(threea,threea,threeb,threec)== "Cut"){lblthree.setVisibility(View.VISIBLE);} else {lblthree.setVisibility(View.INVISIBLE);}
        if(CheckCut(foura,foura,fourb,fourc)== "Cut"){lblfour.setVisibility(View.VISIBLE);} else {lblfour.setVisibility(View.INVISIBLE);}
        if(CheckCut(fivea,fivea,fiveb,fivec)== "Cut"){lblfive.setVisibility(View.VISIBLE);} else {lblfive.setVisibility(View.INVISIBLE);}
        if(CheckCut(sixa,sixa,sixb,sixc)== "Cut"){lblsix.setVisibility(View.VISIBLE);} else {lblsix.setVisibility(View.INVISIBLE);}


    }


    public void ledonepress (View v) {
        ImageButton one = (ImageButton) findViewById(R.id.comledone);
        String imageName = (String) one.getTag();
        switch (imageName) {
            case "off":
                one.setTag("on");
                one.setImageResource(R.drawable.led);
                checklabels();
                break;
            case "on":
                one.setTag("off");
                one.setImageResource(R.drawable.ledoff);
                checklabels();
                break;
        }
    }
    public void ledtwopress (View v) {
        ImageButton one = (ImageButton) findViewById(R.id.comledtwo);
        String imageName = (String) one.getTag();
        switch (imageName) {
            case "off":
                one.setTag("on");
                one.setImageResource(R.drawable.led);
                checklabels();
                break;
            case "on":
                one.setTag("off");
                one.setImageResource(R.drawable.ledoff);
                checklabels();
                break;
        }
    }
    public void ledthreepress (View v) {
        ImageButton one = (ImageButton) findViewById(R.id.comledthree);
        String imageName = (String) one.getTag();
        switch (imageName) {
            case "off":
                one.setTag("on");
                one.setImageResource(R.drawable.led);
                checklabels();
                break;
            case "on":
                one.setTag("off");
                one.setImageResource(R.drawable.ledoff);
                checklabels();
                break;
        }
    }
    public void ledfourpress (View v) {
        ImageButton one = (ImageButton) findViewById(R.id.comledfour);
        String imageName = (String) one.getTag();
        switch (imageName) {
            case "off":
                one.setTag("on");
                one.setImageResource(R.drawable.led);
                checklabels();
                break;
            case "on":
                one.setTag("off");
                one.setImageResource(R.drawable.ledoff);
                checklabels();
                break;
        }
    }
    public void ledfivepress (View v) {
        ImageButton one = (ImageButton) findViewById(R.id.comledfive);
        String imageName = (String) one.getTag();
        switch (imageName) {
            case "off":
                one.setTag("on");
                one.setImageResource(R.drawable.led);
                checklabels();
                break;
            case "on":
                one.setTag("off");
                one.setImageResource(R.drawable.ledoff);
                checklabels();
                break;
        }
    }
    public void ledsixpress (View v) {
        ImageButton one = (ImageButton) findViewById(R.id.comledsix);
        String imageName = (String) one.getTag();
        switch (imageName) {
            case "off":
                one.setTag("on");
                one.setImageResource(R.drawable.led);
                checklabels();
                break;
            case "on":
                one.setTag("off");
                one.setImageResource(R.drawable.ledoff);
                checklabels();
                break;
        }
    }

    public void staronepress (View v) {
        ImageButton one = (ImageButton) findViewById(R.id.comstartone);
        String imageName = (String) one.getTag();
        switch (imageName) {
            case "off":
                one.setTag("on");
                one.setImageResource(R.drawable.star);
                checklabels();
                break;
            case "on":
                one.setTag("off");
                one.setImageResource(R.drawable.nostar);
                checklabels();
                break;
        }
    }
    public void startwopress (View v) {
        ImageButton one = (ImageButton) findViewById(R.id.comstarttwo);
        String imageName = (String) one.getTag();
        switch (imageName) {
            case "off":
                one.setTag("on");
                one.setImageResource(R.drawable.star);
                checklabels();
                break;
            case "on":
                one.setTag("off");
                one.setImageResource(R.drawable.nostar);
                checklabels();
                break;
        }
    }
    public void starthreepress (View v) {
        ImageButton one = (ImageButton) findViewById(R.id.comstartthree);
        String imageName = (String) one.getTag();
        switch (imageName) {
            case "off":
                one.setTag("on");
                one.setImageResource(R.drawable.star);
                checklabels();
                break;
            case "on":
                one.setTag("off");
                one.setImageResource(R.drawable.nostar);
                checklabels();
                break;
        }
    }
    public void starfourpress (View v) {
        ImageButton one = (ImageButton) findViewById(R.id.comstarfour);
        String imageName = (String) one.getTag();
        switch (imageName) {
            case "off":
                one.setTag("on");
                one.setImageResource(R.drawable.star);
                checklabels();
                break;
            case "on":
                one.setTag("off");
                one.setImageResource(R.drawable.nostar);
                checklabels();
                break;
        }
    }
    public void starfivepress (View v) {
        ImageButton one = (ImageButton) findViewById(R.id.comstarfive);
        String imageName = (String) one.getTag();
        switch (imageName) {
            case "off":
                one.setTag("on");
                one.setImageResource(R.drawable.star);
                checklabels();
                break;
            case "on":
                one.setTag("off");
                one.setImageResource(R.drawable.nostar);
                checklabels();
                break;
        }
    }
    public void starsixpress (View v) {
        ImageButton one = (ImageButton) findViewById(R.id.comstarsix);
        String imageName = (String) one.getTag();
        switch (imageName) {
            case "off":
                one.setTag("on");
                one.setImageResource(R.drawable.star);
                checklabels();
                break;
            case "on":
                one.setTag("off");
                one.setImageResource(R.drawable.nostar);
                checklabels();
                break;
        }
    }

    public void wireonepress (View v) {
        ImageButton one = (ImageButton) findViewById(R.id.comwireone);
        String imageName = (String) one.getTag();
        //Toast.makeText(getApplicationContext(), imageName , Toast.LENGTH_SHORT).show();
        switch (imageName) {
            case "Grey":
                one.setTag("Red");
                one.setImageResource(R.drawable.red);
                checklabels();
                break;
            case "Red":
                one.setTag("Blue");
                one.setImageResource(R.drawable.blue);
                checklabels();
                break;
            case "Blue":
                one.setTag("Strip");
                one.setImageResource(R.drawable.strip);
                checklabels();
                break;
            case "Strip":
                one.setTag("Grey");
                one.setImageResource(R.drawable.grey);
                checklabels();
                break;
        }
    }
    public void wiretwopress (View v) {
        ImageButton one = (ImageButton) findViewById(R.id.comwiretwo);
        //Drawable test = one.getBackground();
        String imageName = (String) one.getTag();
        //Toast.makeText(getApplicationContext(), imageName , Toast.LENGTH_SHORT).show();
        switch (imageName) {
            case "Grey":
                one.setTag("Red");
                one.setImageResource(R.drawable.red);
                checklabels();
                break;
            case "Red":
                one.setTag("Blue");
                one.setImageResource(R.drawable.blue);
                checklabels();
                break;
            case "Blue":
                one.setTag("Strip");
                one.setImageResource(R.drawable.strip);
                checklabels();
                break;
            case "Strip":
                one.setTag("Grey");
                one.setImageResource(R.drawable.grey);
                checklabels();
                break;
        }
    }
    public void wirethreepress(View v) {
        ImageButton one = (ImageButton) findViewById(R.id.comwirethree);
        //Drawable test = one.getBackground();
        String imageName = (String) one.getTag();
        //Toast.makeText(getApplicationContext(), imageName , Toast.LENGTH_SHORT).show();
        switch (imageName) {
            case "Grey":
                one.setTag("Red");
                one.setImageResource(R.drawable.red);
                checklabels();
                break;
            case "Red":
                one.setTag("Blue");
                one.setImageResource(R.drawable.blue);
                checklabels();
                break;
            case "Blue":
                one.setTag("Strip");
                one.setImageResource(R.drawable.strip);
                checklabels();
                break;
            case "Strip":
                one.setTag("Grey");
                one.setImageResource(R.drawable.grey);
                checklabels();
                break;
        }
    }
    public void wirefourpress(View v) {
        ImageButton one = (ImageButton) findViewById(R.id.comwirefour);
        //Drawable test = one.getBackground();
        String imageName = (String) one.getTag();
        //Toast.makeText(getApplicationContext(), imageName , Toast.LENGTH_SHORT).show();
        switch (imageName) {
            case "Grey":
                one.setTag("Red");
                one.setImageResource(R.drawable.red);
                checklabels();
                break;
            case "Red":
                one.setTag("Blue");
                one.setImageResource(R.drawable.blue);
                checklabels();
                break;
            case "Blue":
                one.setTag("Strip");
                one.setImageResource(R.drawable.strip);
                checklabels();
                break;
            case "Strip":
                one.setTag("Grey");
                one.setImageResource(R.drawable.grey);
                checklabels();
                break;
        }
    }
    public void wirefivepress(View v) {
        ImageButton one = (ImageButton) findViewById(R.id.comwirefive);
        //Drawable test = one.getBackground();
        String imageName = (String) one.getTag();
        //Toast.makeText(getApplicationContext(), imageName , Toast.LENGTH_SHORT).show();
        switch (imageName) {
            case "Grey":
                one.setTag("Red");
                one.setImageResource(R.drawable.red);
                checklabels();
                break;
            case "Red":
                one.setTag("Blue");
                one.setImageResource(R.drawable.blue);
                checklabels();
                break;
            case "Blue":
                one.setTag("Strip");
                one.setImageResource(R.drawable.strip);
                checklabels();
                break;
            case "Strip":
                one.setTag("Grey");
                one.setImageResource(R.drawable.grey);
                checklabels();
                break;
        }
    }
    public void wiresixpress(View v) {
        ImageButton one = (ImageButton) findViewById(R.id.comwiresix);
        //Drawable test = one.getBackground();
        String imageName = (String) one.getTag();
        //Toast.makeText(getApplicationContext(), imageName , Toast.LENGTH_SHORT).show();
        switch (imageName) {
            case "Grey":
                one.setTag("Red");
                one.setImageResource(R.drawable.red);
                checklabels();
                break;
            case "Red":
                one.setTag("Blue");
                one.setImageResource(R.drawable.blue);
                checklabels();
                break;
            case "Blue":
                one.setTag("Strip");
                one.setImageResource(R.drawable.strip);
                checklabels();
                break;
            case "Strip":
                one.setTag("Grey");
                one.setImageResource(R.drawable.grey);
                checklabels();
                break;
        }
    }


    public String CheckCut(String red, String blue, String led, String star) {
    String answer = "";
        if (red == "Red" | red == "Strip"){
            if (blue == "blue" | red == "Strip"){
                if (star == "on"){
                    if (led == "on"){
                        //red & blue & star & led
                        Log.d("checking:", "red & blue & star & led");
                        answer = "d";
                    } else{
                        //red & blue & star
                        Log.d("checking:", "red & blue & star");
                        answer = "p";
                    }
                } else{
                    if (led == "on"){
                        //red & blue & led
                        Log.d("checking:", "red & blue & led");
                        answer = "s";
                    } else{
                        //red & blue
                        Log.d("checking:", "red & blue");
                        answer = "s";
                    }
                }
            } else{
                if (star == "on"){
                    if (led == "on"){
                        //red & star & led
                        Log.d("checking:", "red & star & led");
                        answer = "b";
                    } else{
                        //red & star
                        Log.d("checking:", "red & star");
                        answer = "c";
                    }
                } else{
                    if (led == "on"){
                        //red & led
                        Log.d("checking:", "red & led");
                        answer = "b";
                    } else{
                        //red
                        Log.d("checking:", "red");
                        answer = "s";
                    }
                }
            }
        } else{
            if (blue == "blue" | red == "Strip"){
                if (star == "on"){
                    if (led == "on"){
                        //blue & star & led
                        Log.d("checking:", "blue & star & led");
                        answer = "d";
                    } else{
                        //blue & star
                        Log.d("checking:", "blue & star");
                        answer = "d";
                    }
                } else{
                    if (led == "on"){
                        //blue & led
                        Log.d("checking:", "blue & led");
                        answer = "p";
                    } else{
                        //blue
                        Log.d("checking:", "blue");
                        answer = "s";
                    }
                }
            } else{
                if (star == "on"){
                    if (led == "on"){
                        //star & led
                        Log.d("checking:", "star & led");
                        answer = "b";
                    } else{
                        //star
                        Log.d("checking:", "star");
                        answer = "c";
                    }
                } else{
                    if (led == "on"){
                        //led
                        Log.d("checking:", "led");
                        answer = "d";
                    } else{
                        //nothing
                        Log.d("checking:", "nothing");
                        answer = "c";
                    }
                }
            }
        }

        String port = "";
        port = getGlobals("ParalellPort", port);
        String serial = "";
        serial = getGlobals("SerialNumber", serial);
        Log.d("serial", serial);
        String bat = "";
        int battery = 0;
        battery = Integer.parseInt(getGlobals("Batteries", bat));

        Log.d("getGlobal Get", answer);

        if(answer == "c"){
            answer = "Cut";
        } else if (answer.equals("d")) {
            answer = "NoCut";
        } else if (answer.equals("s")) {
            Log.d("serial", "Checking Serial");
            if (serial.equals("Even")) {
                Log.d("serial", "cut");
                answer = "Cut";
            } else{
                Log.d("serial", "do not cut");
                answer = "NoCut";
            }
        } else if (answer.equals("p")) {
            if (port.equals("Yes")) {
                answer = "Cut";
            } else{
                answer = "NoCut";
            }
        } else if (answer.equals("b")) {
            if (battery > 1) {
                answer = "Cut";
            } else{
                answer = "NoCut";
            }
        }
        Log.d("Secondanswer", answer);



        return answer;
    }


    private String getGlobals(String ID, String Answer){
        //Log.d("getGlobal ID", ID);
        SharedPreferences AnswerStorage = getSharedPreferences(ID, 0);
        Answer = AnswerStorage.getString(ID, "");
        return Answer;
    }

}
