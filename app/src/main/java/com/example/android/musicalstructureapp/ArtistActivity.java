package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        // Find the Layout that shows the album selected (But Seriously)
        LinearLayout album = (LinearLayout) findViewById(R.id.butSeriously);

        //Set a click Listener
        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new Intent
                Intent playIntent = new Intent(ArtistActivity.this, PlayActivity.class);
                //Start the Activity
                startActivity(playIntent);

            }
        });
    }
}
