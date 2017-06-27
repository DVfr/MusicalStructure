package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        // Find the ImageView that shows the Home Icon
        ImageView home = (ImageView) findViewById(R.id.homeIcon);
        // Set a click Listener
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Create a new Intent when clicked
                Intent goToHomeIntent = new Intent(ArtistActivity.this, MainActivity.class);
                // start the activity
                startActivity(goToHomeIntent);
            }
        });

        // Find the ImageView that shows the Artist Icon
        ImageView artist = (ImageView) findViewById(R.id.artistIcon);
        // Set a click Listener
        artist.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Create a new Intent when clicked
                Intent goToArtistIntent = new Intent(ArtistActivity.this, ArtistListActivity.class);
                // start the activity
                startActivity(goToArtistIntent);
            }
        });

        // Find the ImageView that shows the Album Icon
        ImageView album = (ImageView) findViewById(R.id.albumIcon);
        // Set a click Listener
        album.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Create a new Intent when clicked
                Intent goToAlbumIntent = new Intent(ArtistActivity.this, AlbumListActivity.class);
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
                Intent goToPlayIntent = new Intent(ArtistActivity.this, PlayActivity.class);
                // start the activity
                startActivity(goToPlayIntent);
            }
        });

        // Find the Layout that shows the album selected (But Seriously)
        LinearLayout selectedAlbum = (LinearLayout) findViewById(R.id.butSeriously);

        //Set a click Listener
        selectedAlbum.setOnClickListener(new View.OnClickListener() {
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
