package com.Tuts1107;

public class Song {

    private final String title;
    private final String artist;
    private final int year;
    private final String country;
    private final String genre;

    private Song(Builder builder) {
        title = builder.title;
        artist = builder.artist;
        year = builder.year;
        country = builder.country;
        genre = builder.genre;
    }

    public void showSong() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Year: " + year);
        System.out.println("Country: " + country);
        System.out.println("Genre: " + genre);
    }

    public static class Builder {
        private final String title;
        private final String artist;
        private final int year;
        private final String country;
        private String genre;

        public Builder(String title, String artist, int year, String country) {
            this.title = title;
            this.artist = artist;
            this.year = year;
            this.country = country;
        }

        public Builder genre(String val) {
            genre = val;
            return this;
        }

        public Song build() {
            return new Song(this);
        }

    }

}
