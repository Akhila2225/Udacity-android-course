package com.example.musicalstructureapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;

public class songsAdapter extends ArrayAdapter<Songs> {

  private static final String LOG_TAG = songsAdapter.class.getSimpleName();

  public songsAdapter(@NonNull Context context, ArrayList<Songs> songs) {
    super(context, 0, songs);
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {

    View listItemView = convertView;
    if (listItemView == null) {
      listItemView =
          LayoutInflater.from(getContext()).inflate(R.layout.customlayout, parent, false);
    }

    Songs currentSong = getItem(position);

    TextView nTextView = (TextView) listItemView.findViewById(R.id.song_name);
    nTextView.setText(currentSong.getSongName());

    TextView vTextView = (TextView) listItemView.findViewById(R.id.album_name);
    vTextView.setText(currentSong.getAlbumName());

    ImageView imageIcon = (ImageView) listItemView.findViewById(R.id.image_icon);
    imageIcon.setImageResource(currentSong.getAlbumImages());

    return listItemView;


  }
}
