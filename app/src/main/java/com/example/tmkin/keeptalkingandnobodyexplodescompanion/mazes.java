package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
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
        final ImageAdaptermaze1 one = new ImageAdaptermaze1(this);
        final ImageAdaptermaze2 two = new ImageAdaptermaze2(this);
        final ImageAdaptermaze3 three = new ImageAdaptermaze3(this);
        final ImageAdaptermaze4 four = new ImageAdaptermaze4(this);
        final ImageAdaptermaze5 five = new ImageAdaptermaze5(this);
        final ImageAdaptermaze6 six = new ImageAdaptermaze6(this);
        final ImageAdaptermaze7 seven = new ImageAdaptermaze7(this);
        final ImageAdaptermaze8 eight = new ImageAdaptermaze8(this);
        final ImageAdaptermaze9 nine = new ImageAdaptermaze9(this);

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
                //Toast.makeText(getApplicationContext(), "" + whiteval,Toast.LENGTH_SHORT).show();
                //Pull all of the variables for this image
                String mazeval = "";
                mazeval = getGlobals("mazeselected", mazeval);
                String blueval = "";
                blueval = getGlobals("blueselected", blueval);
                String whiteval = "";
                whiteval = getGlobals("whiteselected", whiteval);
                String tag = (String) imageView.getTag();


                switch(position){
                    case 0:
                        //maze 4
                        imageView.setImageResource(repeattag(tag,"w",""));
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
                        if (mazeval == ""){
                            //if there is no maze selected - start the first maze
                            setGlobals(0, "4", "mazeselected");
                            gridview.setAdapter(six);
                        } else {
                            //is there a white dot on the board

                            //Need additional logic to see if this is the white dot....
                            if (tag.equals("green_circle_w_0000") || tag.equals("white_dot_0000")){
                                setGlobals(0, "", "whiteselected");
                                if (blueval == ""){
                                    //if there is no maze selected - start the first maze
                                    setGlobals(0, "1", "blueselected");
                                    //need logic to pull any bounderys and use them
                                    imageView.setTag("triangle_0000");
                                    imageView.setImageResource(R.drawable.triangle_0000);
                                } else {
                                    //clear the maze - the dot is already white
                                    clearmaze();
                                }

                            }else {
                                if (whiteval == ""){
                                    //if there is no maze selected - start the first maze
                                    setGlobals(0, "1", "whiteselected");
                                    //need logic to pull any bounderys and use them
                                    imageView.setTag("green_circle_w_0000");
                                    imageView.setImageResource(R.drawable.green_circle_w_0000);
                                } else {
                                    if (blueval == ""){
                                        //if there is no maze selected - start the first maze
                                        setGlobals(0, "1", "blueselected");
                                        //need logic to pull any bounderys and use them
                                        imageView.setTag("triangle_0000");
                                        imageView.setImageResource(R.drawable.triangle_0000);
                                    } else {
                                        //clear the maze - the dot is already white
                                        clearmaze();
                                    }
                                }
                            }
                        }

                        break;
                    case 5:

                        break;
                    case 6:
                        //maze 1
                        if (mazeval == ""){
                            //if there is no maze selected - start the first maze
                            setGlobals(0, "1", "mazeselected");
                            gridview.setAdapter(one);
                        } else {
                            //is there a white dot on the board

                            //Need additional logic to see if this is the white dot....
                            if (tag.equals("green_circle_w_0000") || tag.equals("white_dot_0000")){
                                setGlobals(0, "", "whiteselected");
                                if (blueval == ""){
                                    //if there is no maze selected - start the first maze
                                    setGlobals(0, "1", "blueselected");
                                    //need logic to pull any bounderys and use them
                                    imageView.setTag("triangle_0000");
                                    imageView.setImageResource(R.drawable.triangle_0000);
                                } else {
                                    //clear the maze - the dot is already white
                                    clearmaze();
                                }

                            }else {
                                if (whiteval == ""){
                                    //if there is no maze selected - start the first maze
                                    setGlobals(0, "1", "whiteselected");
                                    //need logic to pull any bounderys and use them
                                    imageView.setTag("green_circle_w_0000");
                                    imageView.setImageResource(R.drawable.green_circle_w_0000);
                                } else {
                                    if (blueval == ""){
                                        //if there is no maze selected - start the first maze
                                        setGlobals(0, "1", "blueselected");
                                        //need logic to pull any bounderys and use them
                                        imageView.setTag("triangle_0000");
                                        imageView.setImageResource(R.drawable.triangle_0000);
                                    } else {
                                        //clear the maze - the dot is already white
                                        clearmaze();
                                    }
                                }
                            }
                        }
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
                        if (mazeval == ""){
                            //if there is no maze selected - start the first maze
                            setGlobals(0, "2", "mazeselected");
                            gridview.setAdapter(two);
                        } else {
                            //is there a white dot on the board
                            //Need additional logic to see if this is the white dot....
                            Toast.makeText(getApplicationContext(), "" + tag,Toast.LENGTH_SHORT).show();
                            if (tag.equals("green_circle_w_0000") || tag.equals("green_circle_b_0000")){
                                if (whiteval == ""){
                                    //if there is no maze selected - start the first maze
                                    setGlobals(0, "1", "whiteselected");
                                    //need logic to pull any bounderys and use them
                                    imageView.setTag("green_circle_w_0000");
                                    imageView.setImageResource(R.drawable.green_circle_w_0000);
                                } else {
                                    if (blueval == ""){
                                        //if there is no maze selected - start the first maze
                                        setGlobals(0, "1", "blueselected");
                                        //need logic to pull any bounderys and use them
                                        imageView.setTag("triangle_0000");
                                        imageView.setImageResource(R.drawable.triangle_0000);
                                    } else {
                                        //clear the maze - the dot is already white
                                        clearmaze();
                                    }
                                }
                            }else {
                                if (whiteval == ""){
                                    //if there is no maze selected - start the first maze
                                    setGlobals(0, "1", "whiteselected");
                                    //need logic to pull any bounderys and use them
                                    imageView.setTag("white_dot_0000");
                                    imageView.setImageResource(R.drawable.white_dot_0000);
                                } else {
                                    if (blueval == ""){
                                        //if there is no maze selected - start the first maze
                                        setGlobals(0, "1", "blueselected");
                                        //need logic to pull any bounderys and use them
                                        imageView.setTag("triangle_0000");
                                        imageView.setImageResource(R.drawable.triangle_0000);
                                    } else {
                                        //clear the maze - the dot is already white
                                        clearmaze();
                                    }
                                }
                            }
                        }


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

    public int repeattag  (String tag, String WhiteBlueTriangle, String Green) {


        String newtag = "";
        String pos1 = "";
        String pos2 = "";
        String pos3 = "";
        String pos4 = "";
        int length = tag.length();

        pos1 = tag.substring(length-4,length-3);
        pos2 = tag.substring(length-3,length-2);
        pos3 = tag.substring(length-2,length-1);
        pos4 = tag.substring(length-1,length-0);
        String position = pos1 + pos2 + pos3 + pos4;

        if (WhiteBlueTriangle == "w"){
            if (Green == "g"){
                newtag = "green_circle_w_" + position;
            }else {
                newtag = "white_dot_" + position;
            }
        } else {

        }
        if (WhiteBlueTriangle == "b"){
            if (Green == "g"){
                newtag = "green_circle_b_" + position;
            }else {
                newtag = "blue_dot_" + position;
            }
        } else {

        }
        if (WhiteBlueTriangle == "t"){
            if (Green == "g"){
                newtag = "triangle_" + position;
            }else {
                newtag = "triangle_" + position;
            }
        } else {

        }

        int id = getApplicationContext().getResources().getIdentifier(newtag, "drawable", getApplicationContext().getPackageName());


        Toast.makeText(getApplicationContext(), "" + id,Toast.LENGTH_SHORT).show();


       return id;
    }



    public void clearmaze () {

        setGlobals(0, "", "mazeselected");
        setGlobals(0, "", "whiteselected");
        setGlobals(0, "", "blueselected");
        final ImageAdapter org = new ImageAdapter(this);
        final GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(org);
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

//Maze 1 Adapter
class ImageAdaptermaze1 extends BaseAdapter {
    private Context mContext;

    public ImageAdaptermaze1(Context c) {
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

    //Maze 2 Adapter
    class ImageAdaptermaze2 extends BaseAdapter {
        private Context mContext;

        public ImageAdaptermaze2(Context c) {
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
                R.drawable.blue_dot_0001
                ,R.drawable.blue_dot_0000
                ,R.drawable.blue_dot_0011
                ,R.drawable.blue_dot_1000
                ,R.drawable.blue_dot_0000
                ,R.drawable.blue_dot_0001
                ,R.drawable.blue_dot_0100
                ,R.drawable.blue_dot_0011
                ,R.drawable.blue_dot_1100
                ,R.drawable.blue_dot_0011
                ,R.drawable.green_circle_b_1001
                ,R.drawable.blue_dot_0100
                ,R.drawable.blue_dot_0010
                ,R.drawable.blue_dot_1100
                ,R.drawable.blue_dot_0011
                ,R.drawable.blue_dot_1100
                ,R.drawable.blue_dot_0101
                ,R.drawable.blue_dot_0000
                ,R.drawable.blue_dot_0000
                ,R.drawable.green_circle_b_0011
                ,R.drawable.blue_dot_1100
                ,R.drawable.blue_dot_0011
                ,R.drawable.blue_dot_1110
                ,R.drawable.blue_dot_1000
                ,R.drawable.blue_dot_0010
                ,R.drawable.blue_dot_1110
                ,R.drawable.blue_dot_1010
                ,R.drawable.blue_dot_1100
                ,R.drawable.blue_dot_0011
                ,R.drawable.blue_dot_1000
                ,R.drawable.blue_dot_0010
                ,R.drawable.blue_dot_1000
                ,R.drawable.blue_dot_0010
                ,R.drawable.blue_dot_1000
                ,R.drawable.blue_dot_0100
                ,R.drawable.blue_dot_0000

        };
    }
    //Maze 3 Adapter
    class ImageAdaptermaze3 extends BaseAdapter {
        private Context mContext;

        public ImageAdaptermaze3(Context c) {
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

    //Maze 4 Adapter
    class ImageAdaptermaze4 extends BaseAdapter {
        private Context mContext;

        public ImageAdaptermaze4(Context c) {
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

    //Maze 5 Adapter
    class ImageAdaptermaze5 extends BaseAdapter {
        private Context mContext;

        public ImageAdaptermaze5(Context c) {
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

    //Maze 6 Adapter
    class ImageAdaptermaze6 extends BaseAdapter {
        private Context mContext;

        public ImageAdaptermaze6(Context c) {
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

    //Maze 7 Adapter
    class ImageAdaptermaze7 extends BaseAdapter {
        private Context mContext;

        public ImageAdaptermaze7(Context c) {
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

    //Maze 8 Adapter
    class ImageAdaptermaze8 extends BaseAdapter {
        private Context mContext;

        public ImageAdaptermaze8(Context c) {
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

    //Maze 9 Adapter
    class ImageAdaptermaze9 extends BaseAdapter {
        private Context mContext;

        public ImageAdaptermaze9(Context c) {
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


