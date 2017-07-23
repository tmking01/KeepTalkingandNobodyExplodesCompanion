package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class mazes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mazes);

        setGlobals(0, "", "mazeselected");
        setGlobals(0, "", "whiteselected");
        setGlobals(0, "", "blueselected");

        String mazeselected = "";
        mazeselected = getGlobals("SerialNumber", mazeselected);
        String whiteselected = "";
        whiteselected = getGlobals("SerialNumber", whiteselected);
        String blueselected = "";
        whiteselected = getGlobals("SerialNumber", whiteselected);

        final ImageAdapter org = new ImageAdapter(this);
        final ImageAdaptermazeone one = new ImageAdaptermazeone(this);

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



                //imageView.setTag("Grey");
                //imageView.setImageResource(R.drawable.white_dot);
                //imageView.setImageResource(ImageAdapter.mThumbIds[position]);

                //Pull all of the variables for this image
                String mazeval = "";
                mazeval = getGlobals("mazeselected", mazeval);
                String blueval = "";
                blueval = getGlobals("mazeselected", blueval);
                String whiteval = "";
                whiteval = getGlobals("mazeselected", whiteval);
                String tag = (String) imageView.getTag();
                Toast.makeText(getApplicationContext(), "" + mazeval,Toast.LENGTH_SHORT).show();

                switch(position){
                    case 0:
                        //maze 4

                        break;
                    case 1:
                        //maze 7
                        //gridview.setAdapter(org);
                        break;
                    case 2:

                        break;
                    case 3:
                        //maze 8
                        break;
                    case 4:
                        //maze 6
                        break;
                    case 5:

                        break;
                    case 6:

                        if (mazeval == ""){
                            //if there is no maze selected - start the first maze
                            setGlobals(0, "1", "mazeselected");
                            gridview.setAdapter(one);
                        } else {
                            //is there a white dot on the board
                            if (whiteval == ""){
                                //if there is no maze selected - start the first maze
                                setGlobals(0, "1", "whiteselected");
                                //need logic to pull any bounderys and use them
                                imageView.setImageResource(R.drawable.green_circle_w_0000);
                            } else {
                                //is there a white dot on the board
                                gridview.setAdapter(org);
                            }
                        }
                        gridview.setAdapter(one);



                        break;
                    case 7:

                        break;
                    case 8:
                        //maze 9
                        break;
                    case 9:

                        break;
                    case 10:
                        //maze 2
                        break;
                    case 11:

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
                        //maze 5
                        break;
                    case 17:
                        //maze 1
                        break;
                    case 18:
                        //maze 4
                        break;
                    case 19:
                        //maze 2
                        break;
                    case 20:
                        //maze 8
                        break;
                    case 21:
                        //maze 3
                        break;
                    case 22:

                        break;
                    case 23:
                        //maze 3
                        break;
                    case 24:
                        //maze 9
                        break;
                    case 25:

                        break;
                    case 26:
                        //maze 6
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
                        //maze 7
                        break;
                    case 32:

                        break;
                    case 33:
                        //maze 5
                        break;
                    case 34:

                        break;
                    case 35:

                        break;
                }


            }
        });


    }


    public void checkmaze (ImageView image) {

        String imageName = (String) image.getTag();
        switch (imageName) {
            case "off":
                image.setTag("on");
                image.setImageResource(R.drawable.led);
                break;
            case "on":
                image.setTag("off");
                image.setImageResource(R.drawable.ledoff);
                break;
        }
    }


    public void mazeselector (int number) {








    }














    private void setGlobals(int Batteries, String Answer, String ID){
        SharedPreferences AnswerStorage = getSharedPreferences(ID, 0);
        SharedPreferences.Editor editor = AnswerStorage.edit();
        if(ID == "Batteries"){
            Answer = String.valueOf(Batteries);
        }
        editor.putString(ID, Answer);
        editor.commit();
        Log.d("SetGloabal ID", ID);
        Log.d("SetGlobal Answer", Answer);
    }

    private String getGlobals(String ID, String Answer){
        Log.d("getGlobal ID", ID);
        Log.d("getGlobal Answer", Answer);
        SharedPreferences AnswerStorage = getSharedPreferences(ID, 0);
        Answer = AnswerStorage.getString(ID, "");
        Log.d("getGlobal Get", Answer);
        return Answer;
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
            R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
    };



}

//Second Adapter
class ImageAdaptermazeone extends BaseAdapter {
    private Context mContext;

    public ImageAdaptermazeone(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mazeone.length;
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
        String name = getResources().getResourceEntryName(mazeone[position]);
        imageView.setTag(name);
        imageView.setImageResource(mazeone[position]);

        return imageView;
    }

    // references to our images

    private Integer[] mazeone = {
            R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0001
            ,R.drawable.green_circle_b_0010
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0011
            ,R.drawable.blue_dot_1001
            ,R.drawable.blue_dot_0101
            ,R.drawable.blue_dot_0100
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1001
            ,R.drawable.blue_dot_0110
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0101
            ,R.drawable.green_circle_b_0000
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1101
            ,R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0011
            ,R.drawable.blue_dot_1101
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0101
            ,R.drawable.blue_dot_0110
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0111
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0110
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0000



    };






}


}


