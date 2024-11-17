package com.Tuts1107;

public class SongController {
    public static void main(String[] args) {
        Song song = new Song.Builder("a", "aa", 1990, "aaa")
                .genre("aaaa").build();

        song.showSong();

    }
}
