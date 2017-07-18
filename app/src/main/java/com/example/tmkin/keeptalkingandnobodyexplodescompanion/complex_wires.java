package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class complex_wires extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complex_wires);
    }












    public void loadSelector(int id) {
        Switch switchone = (Switch) findViewById(R.id.swtRedone);
        Switch switchtwo = (Switch) findViewById(R.id.swtblueone);
        Switch switchthree = (Switch) findViewById(R.id.SWTstarone);
        Switch switchfour = (Switch) findViewById(R.id.swtledone);
        final TextView label = (TextView) findViewById(R.id.lblcomplexone);


        switchone.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // TODO Auto-generated method stub
                if (buttonView.isChecked()) {
                    Toast.makeText(getApplicationContext(), "top!!", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "bottom!!", Toast.LENGTH_LONG).show();
                    }
                }
            });


        switchone.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getApplicationContext(), "Hello toast!!", Toast.LENGTH_LONG).show();
                label.setText("test");
            }
        });

        switchtwo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getApplicationContext(), "Hello toast!!", Toast.LENGTH_LONG).show();
                label.setText("test");
            }
        });

        switchthree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                label.setText("test");
            }
        });

        switchfour.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                label.setText("test");
            }
        });

    }




}
