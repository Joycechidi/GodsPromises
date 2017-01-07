package com.threedeez.godspromises;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class PromiseActivity extends AppCompatActivity {
    private PromiseBook PromiseBook = new PromiseBook();
    private ColorWheel ColorWheel = new ColorWheel();
// Declare our View Variables
    private TextView PromiseTextView;
    private Button showAnotherPromiseButton;
    private RelativeLayout RelativeLayout;


       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promise);

        // Assign the Views from the layout file to the corresponding variables
        PromiseTextView = (TextView) findViewById(R.id.PromiseTextView);
        showAnotherPromiseButton = (Button) findViewById(R.id.AnotherPromiseButton);
        RelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Promise = PromiseBook.getPromise();
                int color = ColorWheel.getColor();

                //Update the screen with our dynamic fact
                PromiseTextView.setText(Promise);
                RelativeLayout.setBackgroundColor(color);
                showAnotherPromiseButton.setTextColor(color);

            }
        };
        showAnotherPromiseButton.setOnClickListener(Listener);
        //Toast.makeText(PromiseActivity.this, "Yay! Our Promises are Being Delivered!", Toast.LENGTH_SHORT).show();
           Log.d("PromiseActivity", "We are Logging from the onCreate Method!");
    }
}
