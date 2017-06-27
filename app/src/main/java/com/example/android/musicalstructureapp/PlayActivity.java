package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        // Find the ImageView that shows the Home Icon
        ImageView home = (ImageView) findViewById(R.id.homeIcon);
        // Set a click Listener
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Create a new Intent when clicked
                Intent goToHomeIntent = new Intent(PlayActivity.this, MainActivity.class);
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
                Intent goToArtistIntent = new Intent(PlayActivity.this, ArtistListActivity.class);
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
                Intent goToAlbumIntent = new Intent(PlayActivity.this, AlbumListActivity.class);
                // start the activity
                startActivity(goToAlbumIntent);
            }
        });
    }
}