package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class ArtistListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_list);

        // Find the Layout that shows the artist category (Phil Collins for this example)
        LinearLayout artist = (LinearLayout) findViewById(R.id.PhilCollinsLayout);

        //Set a click Listener
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new Intent
                Intent playIntent = new Intent(ArtistListActivity.this, ArtistActivity.class);
                //Start the Activity
                startActivity(playIntent);

            }
        });
    }
}