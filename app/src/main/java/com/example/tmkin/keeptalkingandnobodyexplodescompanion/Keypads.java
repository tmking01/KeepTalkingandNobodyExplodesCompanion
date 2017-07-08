package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.app.Activity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Keypads extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_item);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                //Toast.makeText(gridview.this, "" + position,Toast.LENGTH_SHORT).show();
            }
        });



        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
        @Override
        public void onItemClick (AdapterView < ? > parent, View v,
        int position, long id){
            loadPhoto(position);



    }
    });

}
    public void loadPhoto(int id) {

        ImageView tempImageView = (ImageView) findViewById(R.id.fullimage);


        AlertDialog.Builder imageDialog = new AlertDialog.Builder(this);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);

        View layout = inflater.inflate(R.layout.custom_fullimage_dialog,
                (ViewGroup) findViewById(R.id.layout_root));
        ImageView image = (ImageView) layout.findViewById(R.id.fullimage);
        //image.setImageDrawable(tempImageView.getDrawable());

        if (id == 1) {
            image.setBackgroundResource(R.drawable.keypad_r1);
        } else if (id == 2) {
            image.setBackgroundResource(R.drawable.keypad_r2);
        }

        //start

        switch (id) {
            case 0:
                image.setBackgroundResource(R.drawable.keypad_r1);
                break;
            case 1:
                image.setBackgroundResource(R.drawable.keypad_r1);
                break;
            case 2:
                image.setBackgroundResource(R.drawable.keypad_r3);
                break;
            case 3:
                image.setBackgroundResource(R.drawable.keypad_r6);
                break;
            case 4:
                image.setBackgroundResource(R.drawable.keypad_r6);
                break;
            case 5:
                image.setBackgroundResource(R.drawable.keypad_r5);
                break;
            case 6:
                image.setBackgroundResource(R.drawable.keypad_r5);
                break;
            case 7:
                image.setBackgroundResource(R.drawable.keypad_r5);
                break;
            case 8:
                image.setBackgroundResource(R.drawable.keypad_r3);
                break;
            case 9:
                image.setBackgroundResource(R.drawable.keypad_r6);
                break;
            case 10:
                image.setBackgroundResource(R.drawable.keypad_r3);
                break;
            case 11:
                image.setBackgroundResource(R.drawable.keypad_r6);
                break;
            case 12:

                break;
            case 13:

                break;
            case 14:

                break;
            case 15:

                break;
            case 16:

                break;
            case 17:

                break;
            case 18:

                break;
            case 19:

                break;
            case 20:

                break;
            case 21:

                break;
            case 22:

                break;
            case 23:

                break;
            case 24:

                break;
            case 25:

                break;
            case 26:

                break;
            case 27:

                break;
            case 28:

                break;
            case 29:

                break;
            case 30:

                break;
            case 31:

                break;
            case 32:

                break;
            case 33:

                break;
            case 34:

                break;
            case 35:

                break;


        }

        //end

        imageDialog.setView(layout);
        imageDialog.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }

        });


        imageDialog.create();
        imageDialog.show();
    }







    class ImageAdapter extends BaseAdapter {
        private Context mContext;

        public ImageAdapter(Context c) {
            mContext = c;
        }

        public int getCount() {
            return mThumbIds.length;
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return 0;
        }

        // create a new ImageView for each item referenced by the Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;
            if (convertView == null) {
                // if it's not recycled, initialize some attributes
                imageView = new ImageView(mContext);
                imageView.setLayoutParams(new GridView.LayoutParams(215, 215));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(8, 8, 8, 8);
            } else {
                imageView = (ImageView) convertView;
            }

            imageView.setImageResource(mThumbIds[position]);
            return imageView;
        }

        // references to our images
        private Integer[] mThumbIds = {
                R.drawable.keypad_a1     , R.drawable.keypad_a3
                , R.drawable.keypad_a7    , R.drawable.keypad_a9
                , R.drawable.keypad_a10   , R.drawable.keypad_a11
                , R.drawable.keypad_a12   , R.drawable.keypad_a13
                , R.drawable.keypad_a14   , R.drawable.keypad_a15
                , R.drawable.keypad_a17   , R.drawable.keypad_a18
                , R.drawable.keypad_b1    , R.drawable.keypad_b2
                , R.drawable.keypad_b3    , R.drawable.keypad_b4
                , R.drawable.keypad_b5    , R.drawable.keypad_b6
                , R.drawable.keypad_b7    , R.drawable.keypad_b8
                , R.drawable.keypad_b9    , R.drawable.keypad_b10
                , R.drawable.keypad_b11   , R.drawable.keypad_b12
                , R.drawable.keypad_b13   , R.drawable.keypad_b14
                , R.drawable.keypad_b15
        };
    }




}



