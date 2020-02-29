package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static android.widget.ListView.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);


        /*
         * Array for the Songs objects
         */

        final ArrayList<Songs> songs = new ArrayList<Songs>();

        songs.add(new Songs("Look What You Made Me Do ","Reputation", R.drawable.reputation));
        songs.add(new Songs("Gorgeous ","Reputation", R.drawable.reputation1 ));
        songs.add(new Songs("Everything has changed","Red", R.drawable. red));
        songs.add(new Songs("London boy ","Lover", R.drawable. lover));
        songs.add(new Songs("I forgot that you existed ","Lover", R.drawable.lover1 ));
        songs.add(new Songs("Mean ","Speak now", R.drawable.speaknow));
        songs.add(new Songs("Cruel summer ","Lover", R.drawable.taylor));
        songs.add(new Songs("Back to december","Speak now", R.drawable.speaknow2 ));
        songs.add(new Songs("Blank space","1989", R.drawable.image1989));
        songs.add(new Songs("Gorgeous ","Reputation", R.drawable.taylorswift));

        songsAdapter songsAdapter = new songsAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(songsAdapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                    Bundle bundle = new Bundle();
                    intent.putExtra("songname",songs.get(position).getSongName());
                    intent.putExtra("albumname", songs.get(position).getAlbumName());
                    intent.putExtra("imageicon", songs.get(position).getAlbumImages());
                    startActivity(intent);




            }
        });
    }
}