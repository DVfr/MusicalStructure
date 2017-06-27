package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ArtistListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_list);

        // Find the ImageView that shows the Home Icon
        ImageView home = (ImageView) findViewById(R.id.homeIcon);
        // Set a click Listener
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Create a new Intent when clicked
                Intent goToHomeIntent = new Intent(ArtistListActivity.this, MainActivity.class);
                // start the activity
                startActivity(goToHomeIntent);
            }
        });

        // Find the ImageView that shows the Album Icon
        ImageView album = (ImageView) findViewById(R.id.albumIcon);
        // Set a click Listener
        album.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Create a new Intent when clicked
                Intent goToAlbumIntent = new Intent(ArtistListActivity.this, AlbumListActivity.class);
                // start the activity
                startActivity(goToAlbumIntent);
            }
        });

        // Find the ImageView that shows the Note Icon
        ImageView note = (ImageView) findViewById(R.id.noteIcon);
        // Set a click Listener
        note.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Create a new Intent when clicked
                Intent goToPlayIntent = new Intent(ArtistListActivity.this, PlayActivity.class);
                // start the activity
                startActivity(goToPlayIntent);
            }
        });


        // Find the Layout that shows the artist category (Phil Collins for this example)
        LinearLayout selectedArtist = (LinearLayout) findViewById(R.id.PhilCollinsLayout);

        //Set a click Listener
        selectedArtist.setOnClickListener(new View.OnClickListener() {
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