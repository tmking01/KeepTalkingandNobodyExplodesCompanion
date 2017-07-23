package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        final ImageAdapter org = new ImageAdapter(this);

        final GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(org);


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

                //Toast.makeText(getApplicationContext(), "" + position,Toast.LENGTH_SHORT).show();

                ImageView imageView = (ImageView) v;
            }
        });
    }

    public void onbuttontap(View v) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Ouch!", Toast.LENGTH_SHORT);
        myToast.show();
    }
    public void Keypads(View view) {
        Intent intent = new Intent(this, Keypads.class);
        startActivity(intent);
    }
    public void simpleWiresClick(View view) {
        Intent intent = new Intent(this, SubjectofWires.class);
        startActivity(intent);
    }
    public void mazes(View view) {
        Intent intent = new Intent(this, mazes.class);
        startActivity(intent);
    }
    public void buttonsClick(View view) {
        Intent intent = new Intent(this, Buttons.class);
        startActivity(intent);
    }
    public void password(View view) {
        Intent intent = new Intent(this, Password.class);
        startActivity(intent);
    }
    public void complexwires(View view) {
        Intent intent = new Intent(this, complex_wires.class);
        startActivity(intent);
    }
    public void Setupquestions(View view) {
        Intent setupIntent = new Intent(this, Setup.class);
        startActivity(setupIntent);
    }
    public void Simonsays(View view) {
        Intent intent = new Intent(this, SimonSays.class);
        startActivity(intent);
    }
    public void openBombDefuse(View view){
        Uri defuseLink = Uri.parse("http://www.bombmanual.com/manual/1/html/index.html");
        Intent intent = new Intent(Intent.ACTION_VIEW, defuseLink);
        startActivity(intent);
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
                imageView.setPadding(0, 0, 0, 0);
            } else {
                imageView = (ImageView) convertView;
            }

            String name = getResources().getResourceEntryName(mThumbIds[position]);
            imageView.setTag(name);
            imageView.setImageResource(mThumbIds[position]);



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



    }




}

