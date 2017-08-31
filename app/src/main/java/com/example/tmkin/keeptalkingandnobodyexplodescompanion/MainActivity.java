package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.data;
import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Get the Intent that started this activity and extract the string


        final ImageAdapter org = new ImageAdapter(this);
        final GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(org);


    }

    public void Setupquestions(View view) {
        Intent setupIntent = new Intent(this, Setup.class);
        startActivity(setupIntent);
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
        public View getView(final int position, View convertView, ViewGroup parent) {
            ImageView imageView;

            if (convertView == null) {
                // if it's not recycled, initialize some attributes
                imageView = new ImageView(mContext);
                imageView.setLayoutParams(new GridView.LayoutParams(375, 375));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(0, 0, 0, 0);

            String name = getResources().getResourceEntryName(mThumbIds[position]);
                imageView.setTag(name);
                imageView.setImageResource(mThumbIds[position]);

                imageView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    final Intent keypadsintent = new Intent(getApplication(), Keypads.class);
                    final Intent simplewiresintent = new Intent(getApplication(), SubjectofWires.class);
                    final Intent mazesintent = new Intent(getApplication(), mazes.class);
                    final Intent buttonsintent = new Intent(getApplication(), Buttons.class);
                    final Intent passwordsintent = new Intent(getApplication(), Password.class);
                    final Intent complexwiresintent = new Intent(getApplication(), complex_wires.class);
                    final Intent simonsaysintent = new Intent(getApplication(), SimonSays.class);
                    final Intent morsecode = new Intent(getApplication(), morsecode.class);
                    final Intent memory = new Intent(getApplication(), Memory.class);
                    Uri defuseLink = Uri.parse("http://www.bombmanual.com/manual/1/html/index.html");
                    final Intent bombintent = new Intent(Intent.ACTION_VIEW, defuseLink);
                    switch (position) {
                        case 0:
                            startActivity(complexwiresintent);
                            break;
                        case 1:
                            startActivity(simplewiresintent);
                            break;
                        case 2:
                            startActivity(mazesintent);
                            break;
                        case 3:
                            startActivity(buttonsintent);
                            break;
                        case 4:
                            //Memory
                            startActivity(memory);
                            break;
                        case 5:
                            //whos on first
                            break;
                        case 6:
                            //Morsecode
                            startActivity(morsecode);
                            break;
                        case 7:
                            //simon says
                            startActivity(simonsaysintent);
                            break;
                        case 8:
                            //passwords
                            startActivity(passwordsintent);
                            break;
                        case 9:
                            //keypads
                            startActivity(keypadsintent);
                            break;
                        case 10:
                            //manual
                            startActivity(bombintent);
                            break;
                        case 11:
                            //wire sequences
                            break;
                    }
                }
            });
            } else {
                //Toast.makeText(getApplicationContext(), "Hello toast!", Toast.LENGTH_SHORT).show();
                imageView = (ImageView) convertView;
            }
                return imageView;
        }
        // references to our images
        private Integer[] mThumbIds = {
                R.drawable.complexwires
                ,R.drawable.simplewires
                ,R.drawable.mazes
                ,R.drawable.pushbutton
                ,R.drawable.memory
                ,R.drawable.whoisonfirst
                ,R.drawable.morsecode
                ,R.drawable.simonsays
                ,R.drawable.password
                ,R.drawable.symbols
                ,R.drawable.bombdefusalmanual
                ,R.drawable.wiresequence
        };

        private class ViewHolder {
            ImageView imageView;
        }
    }

}

