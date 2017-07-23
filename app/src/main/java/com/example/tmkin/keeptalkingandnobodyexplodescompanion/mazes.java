package com.example.tmkin.keeptalkingandnobodyexplodescompanion;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
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
        setGlobals(0, "", "trianlgeselected");

        String mazeselected = "";
        mazeselected = getGlobals("SerialNumber", mazeselected);
        String whiteselected = "";
        whiteselected = getGlobals("SerialNumber", whiteselected);
        String blueselected = "";
        whiteselected = getGlobals("SerialNumber", whiteselected);
        String triangleselected = "";
        triangleselected = getGlobals("SerialNumber", triangleselected);

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
                        buildmaze(gridview,imageView,"4",mazeval,whiteval,blueval,tag);
                        break;
                    case 1:
                        //maze 7
                        buildmaze(gridview,imageView,"7",mazeval,whiteval,blueval,tag);
                        break;
                    case 2:
                        //no maze
                        nomaze(imageView,whiteval,tag);
                        break;
                    case 3:
                        //maze 8
                        buildmaze(gridview,imageView,"3",mazeval,whiteval,blueval,tag);
                        break;
                    case 4:
                        //maze 6
                        buildmaze(gridview,imageView,"6",mazeval,whiteval,blueval,tag);
                        break;
                    case 5:
                        nomaze(imageView,whiteval,tag);
                        break;
                    case 6:
                        //maze 1
                        buildmaze(gridview,imageView,"1",mazeval,whiteval,blueval,tag);
                        break;
                    case 7:
                        nomaze(imageView,whiteval,tag);
                        break;
                    case 8:
                        //maze 9
                        buildmaze(gridview,imageView,"9",mazeval,whiteval,blueval,tag);
                        break;
                    case 9:
                        nomaze(imageView,whiteval,tag);
                        break;
                    case 10:
                        //maze 2
                        buildmaze(gridview,imageView,"2",mazeval,whiteval,blueval,tag);
                        break;
                    case 11:
                        nomaze(imageView,whiteval,tag);
                        break;
                    case 12:
                        nomaze(imageView,whiteval,tag);
                        break;
                    case 13:
                        nomaze(imageView,whiteval,tag);
                        break;
                    case 14:
                        nomaze(imageView,whiteval,tag);
                        break;
                    case 15:
                        nomaze(imageView,whiteval,tag);
                        break;
                    case 16:
                        //maze 5
                        buildmaze(gridview,imageView,"5",mazeval,whiteval,blueval,tag);
                        break;
                    case 17:
                        //maze 1
                        buildmaze(gridview,imageView,"1",mazeval,whiteval,blueval,tag);
                        break;
                    case 18:
                        //maze 4
                        buildmaze(gridview,imageView,"4",mazeval,whiteval,blueval,tag);
                        break;
                    case 19:
                        //maze 2
                        buildmaze(gridview,imageView,"5",mazeval,whiteval,blueval,tag);
                        break;
                    case 20:
                        //maze 8
                        buildmaze(gridview,imageView,"8",mazeval,whiteval,blueval,tag);
                        break;
                    case 21:
                        //maze 3
                        buildmaze(gridview,imageView,"3",mazeval,whiteval,blueval,tag);
                        break;
                    case 22:
                        nomaze(imageView,whiteval,tag);
                        break;
                    case 23:
                        //maze 3
                        buildmaze(gridview,imageView,"3",mazeval,whiteval,blueval,tag);
                        break;
                    case 24:
                        //maze 9
                        buildmaze(gridview,imageView,"9",mazeval,whiteval,blueval,tag);
                        break;
                    case 25:

                        break;
                    case 26:
                        //maze 6
                        buildmaze(gridview,imageView,"6",mazeval,whiteval,blueval,tag);
                        break;
                    case 27:
                        nomaze(imageView,whiteval,tag);
                        break;
                    case 28:
                        nomaze(imageView,whiteval,tag);
                        break;
                    case 29:
                        nomaze(imageView,whiteval,tag);
                        break;
                    case 30:
                        nomaze(imageView,whiteval,tag);
                        break;
                    case 31:
                        //maze 7
                        buildmaze(gridview,imageView,"7",mazeval,whiteval,blueval,tag);
                        break;
                    case 32:
                        nomaze(imageView,whiteval,tag);
                        break;
                    case 33:
                        //maze 5
                        buildmaze(gridview,imageView,"5",mazeval,whiteval,blueval,tag);
                        break;
                    case 34:
                        nomaze(imageView,whiteval,tag);
                        break;
                    case 35:
                        nomaze(imageView,whiteval,tag);
                        break;
                }


            }
        });


    }

    public int repeattag(ImageView image,String tag, String WhiteBlueTriangle, String Green) {

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
        }
        if (WhiteBlueTriangle == "b"){
            if (Green == "g"){
                newtag = "green_circle_b_" + position;
            }else {
                newtag = "blue_dot_" + position;
            }
        }
        if (WhiteBlueTriangle == "t"){
            if (Green == "g"){
                newtag = "triangle_" + position;
            }else {
                newtag = "triangle_" + position;
            }
        }

        int id = getApplicationContext().getResources().getIdentifier(newtag, "drawable", getApplicationContext().getPackageName());

        image.setTag(newtag);
        image.setImageResource(id);

       return id;
    }

    public int onlychecktag(ImageView image,String tag, String WhiteBlueTriangle, String Green) {

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
        }
        if (WhiteBlueTriangle == "b"){
            if (Green == "g"){
                newtag = "green_circle_b_" + position;
            }else {
                newtag = "blue_dot_" + position;
            }
        }
        if (WhiteBlueTriangle == "t"){
            if (Green == "g"){
                newtag = "triangle_" + position;
            }else {
                newtag = "triangle_" + position;
            }
        }
        int firstid = getApplicationContext().getResources().getIdentifier(tag, "drawable", getApplicationContext().getPackageName());
        int id = getApplicationContext().getResources().getIdentifier(newtag, "drawable", getApplicationContext().getPackageName());

        int match = 0;

        if (firstid == id){
            match = 1;
        }

        return match;
    }

    public void nomaze(ImageView imageView, String whiteval, String tag) {

        String mazeselected = "";
        mazeselected = getGlobals("mazeselected", mazeselected);
        String trianlgeselected = "";
        trianlgeselected = getGlobals("trianlgeselected", trianlgeselected);
        if(mazeselected ==""){
        }else {
            if (whiteval == "") {
                //if there is no maze selected - start the first maze
                setGlobals(0, "1", "whiteselected");
                //need logic to pull any bounderys and use them
                repeattag(imageView, tag, "w", "");
            } else {
                if(onlychecktag(imageView, tag, "w", "") == 1){
                    //This is the white dot
                    //Toast.makeText(getApplicationContext(), "I am white",Toast.LENGTH_SHORT).show();
                    //check if there is a triangle -if so make this dot blue
                    if(trianlgeselected == ""){
                        //This is the white dot
                        //check if there is a triangle -if so make this dot blue
                        setGlobals(0, "", "whiteselected");
                        setGlobals(0, "1", "trianlgeselected");
                        repeattag(imageView, tag, "t", "");
                    } else {
                        //there is already a white dot on the board
                        setGlobals(0, "", "whiteselected");
                        repeattag(imageView, tag, "b", "");
                    }

                } else {
                    //there is already a white dot on the board
                    if(trianlgeselected == ""){
                        //This is the white dot
                        //check if there is a triangle -if so make this dot blue
                        setGlobals(0, "1", "trianlgeselected");
                        repeattag(imageView, tag, "t", "");
                    } else {
                        //there is already a white dot on the board

                        if (onlychecktag(imageView, tag, "t", "") == 1) {
                            setGlobals(0, "", "trianlgeselected");
                            repeattag(imageView, tag, "b", "");
                        } else {
                            repeattag(imageView, tag, "b", "");
                        }

                    }
                }
                //setGlobals(0, "", "whiteselected");
                //repeattag(imageView, tag, "b", "");
            }
        }
    }

    public void buildmaze(GridView gridview, ImageView imageView, String maze, String mazeval, String whiteval, String blueval, String tag) {

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


        if (mazeval == ""){
            //if there is no maze selected - start the first maze

            switch (maze){
                case "1":
                    setGlobals(0, "1", "mazeselected");
                    gridview.setAdapter(one);
                break;
                case "2":
                    setGlobals(0, "2", "mazeselected");
                    gridview.setAdapter(two);
                    break;
                case "3":
                    setGlobals(0, "3", "mazeselected");
                    gridview.setAdapter(three);
                    break;
                case "4":
                    setGlobals(0, "4", "mazeselected");
                    gridview.setAdapter(four);
                    break;
                case "5":
                    setGlobals(0, "5", "mazeselected");
                    gridview.setAdapter(five);
                    break;
                case "6":
                    setGlobals(0, "6", "mazeselected");
                    gridview.setAdapter(six);
                    break;
                case "7":
                    setGlobals(0, "7", "mazeselected");
                    gridview.setAdapter(seven);
                    break;
                case "8":
                    setGlobals(0, "8", "mazeselected");
                    gridview.setAdapter(eight);
                    break;
                case "9":
                    setGlobals(0, "9", "mazeselected");
                    gridview.setAdapter(nine);
                    break;
            }
        } else {
            //is there a white dot on the board
            String mazeselected = "";
            mazeselected = getGlobals("mazeselected", mazeselected);
            String whiteselected = "";
            whiteselected = getGlobals("whiteselected", whiteselected);
            String trianlgeselected = "";
            trianlgeselected = getGlobals("trianlgeselected", trianlgeselected);
            //Toast.makeText(getApplicationContext(), maze + " " +mazeselected,Toast.LENGTH_SHORT).show();
            if (mazeselected.equals(maze)) {
                //Need additional logic to see if this is the white dot....

                if (whiteselected == "") {
                    //Toast.makeText(getApplicationContext(), "why was this used????",Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), trianlgeselected +"why was this used????",Toast.LENGTH_SHORT).show();
                    setGlobals(0, "1", "whiteselected");
                    repeattag(imageView, tag, "w", "g");
                } else {
                    if (trianlgeselected == "") {
                        setGlobals(0, "1", "trianlgeselected");
                        repeattag(imageView, tag, "t", "");
                    } else {
                        Toast.makeText(getApplicationContext(), trianlgeselected +"why was this used????",Toast.LENGTH_SHORT).show();
                        clearmaze();
                    }
                }

            } else {

                nomaze(imageView,whiteval,tag);
            }

        }



    }

public void clearmaze () {

    setGlobals(0, "", "mazeselected");
    setGlobals(0, "", "whiteselected");
    setGlobals(0, "", "blueselected");
    setGlobals(0, "", "trianlgeselected");
    final ImageAdapter org = new ImageAdapter(this);
    final GridView gridview = (GridView) findViewById(R.id.gridview);
    gridview.setAdapter(org);
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
            ,R.drawable.blue_dot_1010
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0011
            ,R.drawable.blue_dot_1110
            ,R.drawable.blue_dot_1010
            ,R.drawable.blue_dot_1001
            ,R.drawable.blue_dot_0011
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0100
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1010
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0110
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1010
            ,R.drawable.blue_dot_1010
            ,R.drawable.green_circle_b_1010
            ,R.drawable.blue_dot_1010
            ,R.drawable.green_circle_b_1000
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1001
            ,R.drawable.blue_dot_0011
            ,R.drawable.blue_dot_1010
            ,R.drawable.blue_dot_1010
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0100
            ,R.drawable.blue_dot_0100
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1000
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
            R.drawable.green_circle_b_0000
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1001
            ,R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1010
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0101
            ,R.drawable.blue_dot_0101
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1001
            ,R.drawable.blue_dot_0011
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0111
            ,R.drawable.blue_dot_1000
            ,R.drawable.green_circle_b_0010
            ,R.drawable.blue_dot_1101
            ,R.drawable.blue_dot_0101
            ,R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0101
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0101
            ,R.drawable.blue_dot_0101
            ,R.drawable.blue_dot_0101
            ,R.drawable.blue_dot_0110
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0100
            ,R.drawable.blue_dot_0110
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1000
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
            R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0100
            ,R.drawable.blue_dot_0101
            ,R.drawable.blue_dot_0101
            ,R.drawable.blue_dot_0100
            ,R.drawable.blue_dot_0011
            ,R.drawable.green_circle_b_1001
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0110
            ,R.drawable.blue_dot_1101
            ,R.drawable.blue_dot_0011
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0100
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1001
            ,R.drawable.blue_dot_0101
            ,R.drawable.blue_dot_0110
            ,R.drawable.blue_dot_1011
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0101
            ,R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0111
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0100
            ,R.drawable.green_circle_b_0100
            ,R.drawable.blue_dot_0100
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
            R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1001
            ,R.drawable.blue_dot_0000
            ,R.drawable.green_circle_b_0000
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1010
            ,R.drawable.blue_dot_1010
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0011
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0011
            ,R.drawable.blue_dot_1011
            ,R.drawable.blue_dot_1010
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0100
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1010
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0100
            ,R.drawable.blue_dot_0011
            ,R.drawable.green_circle_b_1011
            ,R.drawable.blue_dot_1010
            ,R.drawable.blue_dot_1001
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0100
            ,R.drawable.blue_dot_0100
            ,R.drawable.blue_dot_0010
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
            ,R.drawable.green_circle_b_0001
            ,R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0111
            ,R.drawable.blue_dot_1001
            ,R.drawable.blue_dot_0011
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0011
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0111
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0100
            ,R.drawable.blue_dot_0110
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0101
            ,R.drawable.blue_dot_0011
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1011
            ,R.drawable.blue_dot_1001
            ,R.drawable.blue_dot_0101
            ,R.drawable.blue_dot_0110
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0000
            ,R.drawable.green_circle_b_0100
            ,R.drawable.blue_dot_0100
            ,R.drawable.blue_dot_0100
            ,R.drawable.blue_dot_0000
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
            R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0001
            ,R.drawable.green_circle_b_0010
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0111
            ,R.drawable.blue_dot_1001
            ,R.drawable.blue_dot_0011
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0101
            ,R.drawable.blue_dot_0101
            ,R.drawable.blue_dot_0110
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1001
            ,R.drawable.green_circle_b_0110
            ,R.drawable.blue_dot_1101
            ,R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1110
            ,R.drawable.blue_dot_1001
            ,R.drawable.blue_dot_0101
            ,R.drawable.blue_dot_0101
            ,R.drawable.blue_dot_0101
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0100
            ,R.drawable.blue_dot_0100
            ,R.drawable.blue_dot_0100
            ,R.drawable.blue_dot_0100
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
            R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1010
            ,R.drawable.blue_dot_1100
            ,R.drawable.green_circle_b_0111
            ,R.drawable.blue_dot_1010
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0001
            ,R.drawable.blue_dot_0011
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0011
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1110
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0011
            ,R.drawable.blue_dot_1101
            ,R.drawable.blue_dot_0000
            ,R.drawable.green_circle_b_0010
            ,R.drawable.blue_dot_1010
            ,R.drawable.blue_dot_1010
            ,R.drawable.blue_dot_1100
            ,R.drawable.blue_dot_0110
            ,R.drawable.blue_dot_1001
            ,R.drawable.blue_dot_0000
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0010
            ,R.drawable.blue_dot_1000
            ,R.drawable.blue_dot_0100
    };
}



}


