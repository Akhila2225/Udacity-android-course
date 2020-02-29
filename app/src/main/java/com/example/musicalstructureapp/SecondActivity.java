package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    ImageView imageView;
    TextView songname;
    TextView albumname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        songname = findViewById(R.id.song_name);
        albumname = findViewById(R.id.album_name);
        imageView = findViewById(R.id.album_icon);

        Bundle bundle = getIntent().getExtras();
         if (bundle != null) {
             int picture = bundle.getInt("imageicon");
             imageView.setImageResource(picture);

      songname.setText(getIntent().getStringExtra("songname"));
      albumname.setText(getIntent().getStringExtra("albumname"));
        }
    }
}
