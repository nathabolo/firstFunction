package com.example.android.functions;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;


import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import static com.example.android.functions.R.id.play;


public class MainActivity extends AppCompatActivity {


    //Declare global variables to hold the images here

    MediaPlayer mPlayer;
    ImageButton trac1, trac2, trac3, trac4, trac5, trac6, trac7, trac8, trac9, trac10;
    Bitmap bit;
    Point popup;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the id of the button track1 to display the popup, when a button is clicked
        ImageButton btn1 = (ImageButton) findViewById(R.id.track1_button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Open popup window
                if (popup != null)
                    showPopup(MainActivity.this, popup);
            }
        });

        //Find the id of the button track2 to display the popup, when a button is clicked
        ImageButton btn2 = (ImageButton) findViewById(R.id.track2_button);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Open popup window
                if (popup != null)
                    showPopup(MainActivity.this, popup);
            }
        });

        //Find the id of the button track3 to display the popup, when a button is clicked
        ImageButton btn3 = (ImageButton) findViewById(R.id.track3_button);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Open popup window
                if (popup != null)
                    showPopup(MainActivity.this, popup);
            }
        });

        //Find the id of the button track4 to display the popup, when a button is clicked
        ImageButton btn4 = (ImageButton) findViewById(R.id.track4_button);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Open popup window
                if (popup != null)
                    showPopup(MainActivity.this, popup);
            }
        });


        //Find the id of the button track5 to display the popup, when a button is clicked
        ImageButton btn5 = (ImageButton) findViewById(R.id.track5_button);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Open popup window
                if (popup != null)
                    showPopup(MainActivity.this, popup);
            }
        });

        //Find the id of the button track6 to display the popup, when a button is clicked
        ImageButton btn6 = (ImageButton) findViewById(R.id.track6_button);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Open popup window
                if (popup != null)
                    showPopup(MainActivity.this, popup);
            }
        });


        //Find the id of the button track7 to display the popup, when a button is clicked
        ImageButton btn7 = (ImageButton) findViewById(R.id.track7_button);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Open popup window
                if (popup != null)
                    showPopup(MainActivity.this, popup);
            }
        });

        //Find the id of the button track8 to display the popup, when a button is clicked
        ImageButton btn8 = (ImageButton) findViewById(R.id.track8_button);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Open popup window
                if (popup != null)
                    showPopup(MainActivity.this, popup);
            }
        });

        //Find the id of the button track9 to display the popup, when a button is clicked
        ImageButton btn9 = (ImageButton) findViewById(R.id.track9_button);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Open popup window
                if (popup != null)
                    showPopup(MainActivity.this, popup);
            }
        });

        //Find the id of the button track10 to display the popup, when a button is clicked
        ImageButton btn10 = (ImageButton) findViewById(R.id.track10_button);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Open popup window
                if (popup != null)
                    showPopup(MainActivity.this, popup);
            }
        });


        //Find the id's of the image buttons

        trac1 = (ImageButton) findViewById(R.id.track1_button);
        trac2 = (ImageButton) findViewById(R.id.track2_button);
        trac3 = (ImageButton) findViewById(R.id.track3_button);
        trac4 = (ImageButton) findViewById(R.id.track4_button);
        trac5 = (ImageButton) findViewById(R.id.track5_button);
        trac6 = (ImageButton) findViewById(R.id.track6_button);
        trac7 = (ImageButton) findViewById(R.id.track7_button);
        trac8 = (ImageButton) findViewById(R.id.track8_button);
        trac9 = (ImageButton) findViewById(R.id.track9_button);
        trac10 = (ImageButton) findViewById(R.id.track10_button);

        new TrackImage().execute();

    }

    // Get the x and y position after the button is draw on screen
// (It's important to note that we can't get the position in the onCreate(),
// because at that stage most probably the view isn't drawn yet, so it will return (0, 0))
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {

        int[] location = new int[2];
        ImageButton button = (ImageButton) findViewById(R.id.track1_button);

        // Get the x, y location and store it in the location[] array
        // location[0] = x, location[1] = y.
        button.getLocationOnScreen(location);

        //Initialize the Point with x, and y positions
        popup = new Point();
        popup.x = location[0];
        popup.y = location[1];
    }


    // The method that displays the popup.
    private void showPopup(final Activity context, Point p) {
        int popupWidth = 800;
        int popupHeight = 400;
        // Inflate the popup_layout.xml
        LinearLayout viewGroup = (LinearLayout) context.findViewById(R.id.popup);
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = layoutInflater.inflate(R.layout.popup, viewGroup);

        // Creating the PopupWindow
        final PopupWindow popup = new PopupWindow(context);
        popup.setContentView(layout);
        popup.setWidth(popupWidth);
        popup.setHeight(popupHeight);
        popup.setFocusable(true);

        // Some offset to align the popup a bit to the right, and a bit down, relative to button's position.
        int OFFSET_X = 30;
        int OFFSET_Y = 30;

        // Clear the default translucent background
        popup.setBackgroundDrawable(new BitmapDrawable());

        // Displaying the popup at the specified location, + offsets.
        popup.showAtLocation(layout, Gravity.NO_GRAVITY, p.x + OFFSET_X, p.y + OFFSET_Y);

        // Getting a reference to Close button, and close the popup when clicked.
        Button close = (Button) layout.findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                popup.dismiss();
            }
        });

        // Getting a reference to play button, and play the audio when clicked.
        final Button trac1 = (Button) layout.findViewById(play);
        trac1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // popup.dismiss();
                // TODO Auto-generated method stub
                mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.remember);//Create MediaPlayer object with MP3 file under res/raw folder
                mPlayer.start();//Start playing the music
            }
        });

        // Getting a reference to stop button, and stop the audio when clicked.
        Button stop = (Button) layout.findViewById(R.id.stop);
        stop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // popup.dismiss();

                // TODO Auto-generated method stub
                mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.love);//Create MediaPlayer object with MP3 file under res/raw folder
                mPlayer.stop();//Start playing the music
            }
        });

    }

    public class TrackImage extends AsyncTask<Void, Void, Void> {


        @Override
        protected Void doInBackground(Void... voids) {

            //Catching exceptions that might occur

            try {


                bit = BitmapFactory.decodeStream((InputStream) new URL("https://placeholdit.imgix.net/~text?txtsize=512&txt=Track1&w=4096&h=4096").getContent());
                bit = BitmapFactory.decodeStream((InputStream) new URL("https://placeholdit.imgix.net/~text?txtsize=512&txt=Track2&w=4096&h=4096").getContent());
                bit = BitmapFactory.decodeStream((InputStream) new URL("https://placeholdit.imgix.net/~text?txtsize=512&txt=Track3&w=4096&h=4096").getContent());
                bit = BitmapFactory.decodeStream((InputStream) new URL("https://placeholdit.imgix.net/~text?txtsize=512&txt=Track4&w=4096&h=4096").getContent());
                bit = BitmapFactory.decodeStream((InputStream) new URL("https://placeholdit.imgix.net/~text?txtsize=512&txt=Track5&w=4096&h=4096").getContent());
                bit = BitmapFactory.decodeStream((InputStream) new URL("https://placeholdit.imgix.net/~text?txtsize=512&txt=Track6&w=4096&h=4096").getContent());
                bit = BitmapFactory.decodeStream((InputStream) new URL("https://placeholdit.imgix.net/~text?txtsize=512&txt=Track7&w=4096&h=4096").getContent());
                bit = BitmapFactory.decodeStream((InputStream) new URL("https://placeholdit.imgix.net/~text?txtsize=512&txt=Track8&w=4096&h=4096").getContent());
                bit = BitmapFactory.decodeStream((InputStream) new URL("https://placeholdit.imgix.net/~text?txtsize=512&txt=Track9&w=4096&h=4096").getContent());
                bit = BitmapFactory.decodeStream((InputStream) new URL("https://placeholdit.imgix.net/~text?txtsize=439&txt=Track10&w=4096&h=4096").getContent());


            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {

            super.onPostExecute(aVoid);

            //Execute the images using the onpost execute

            trac1.setImageBitmap(bit);
            trac2.setImageBitmap(bit);
            trac3.setImageBitmap(bit);
            trac4.setImageBitmap(bit);
            trac5.setImageBitmap(bit);
            trac6.setImageBitmap(bit);
            trac7.setImageBitmap(bit);
            trac8.setImageBitmap(bit);
            trac9.setImageBitmap(bit);
            trac10.setImageBitmap(bit);
        }
    }

}
