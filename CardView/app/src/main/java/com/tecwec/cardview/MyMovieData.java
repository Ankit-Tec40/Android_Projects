package com.tecwec.cardview;

public class MyMovieData {
    private String movieName;
    private Integer movieImage;

    public MyMovieData(String movieName, Integer movieImage) {
        this.movieName = movieName;
        this.movieImage = movieImage;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(Integer movieImage) {
        this.movieImage = movieImage;
    }
}
