package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class AlbumListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_list);

        // Find the ImageView that shows the Home Icon
        ImageView home = (ImageView) findViewById(R.id.homeIcon);
        // Set a click Listener
        home.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                // Create a new Intent when clicked
                Intent goToHomeIntent = new Intent(AlbumListActivity.this, MainActivity.class);
                // start the activity
                startActivity(goToHomeIntent);
            }
        });

        // Find the ImageView that shows the Artist Icon
        ImageView artist = (ImageView) findViewById(R.id.artistIcon);
        // Set a click Listener
        artist.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                // Create a new Intent when clicked
                Intent goToArtistIntent = new Intent(AlbumListActivity.this, ArtistListActivity.class);
                // start the activity
                startActivity(goToArtistIntent);
            }
        });

        // Find the ImageView that shows the Note Icon
        ImageView note = (ImageView) findViewById(R.id.noteIcon);
        // Set a click Listener
        note.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                // Create a new Intent when clicked
                Intent goToPlayIntent = new Intent(AlbumListActivity.this, PlayActivity.class);
                // start the activity
                startActivity(goToPlayIntent);
            }
        });




        // Find the Layout that shows the album selected (But Seriously by Phil Collins for this example)
        LinearLayout album = (LinearLayout) findViewById(R.id.butSeriously);

        //Set a click Listener
        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new Intent
                Intent playIntent = new Intent(AlbumListActivity.this, PlayActivity.class);
                //Start the Activity
                startActivity(playIntent);

            }
        });
    }
}
