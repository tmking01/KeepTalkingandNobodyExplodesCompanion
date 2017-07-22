package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class mazes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mazes);


        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new mazes.ImageAdapter(this));

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

                if(position > 12 ) {
                    //loadSelector(position);
                } else {
                    //loadPhoto(position);

                }

            }
        });





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


