package com.example.musicalstructureapp;

public class Songs  {

    // Each object of Songs has three properties: song name, album name and images.
    private  String songName;
    private String albumName;
    private  int albumImages;

    // New object for Songs

    public Songs(String mname, String malbumname, int mimages) {
        songName = mname;
        albumName = malbumname;
        albumImages = mimages;
    }

    /*
    *  Get the song name, album name and image of the album.
    */
    public String getSongName() {
        return songName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public int getAlbumImages() {
        return albumImages;
    }

}

