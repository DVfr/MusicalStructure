package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


// Find the View that shows the ArtistList category
        TextView artistList = (TextView) findViewById(R.id.artistListTextview);

        artistList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MainActivity.this, ArtistListActivity.class);
                startActivity(playIntent);

            }

        });


        // Find the View that shows the AlbumList category
        TextView albumList = (TextView) findViewById(R.id.albumListTextview);

        albumList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MainActivity.this, AlbumListActivity.class);
                startActivity(playIntent);

            }

        });

        // Find the View that shows the TitleList category
        TextView titleList = (TextView) findViewById(R.id.titleListTextView);

        titleList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MainActivity.this, TitleListActivity.class);
                startActivity(playIntent);

            }

        });
    }
}
