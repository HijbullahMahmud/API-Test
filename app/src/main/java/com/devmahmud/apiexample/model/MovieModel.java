package com.devmahmud.apiexample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MovieModel {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("movie_name")
    @Expose
    private String movieName;
    @SerializedName("movie_image")
    @Expose
    private String movieImage;
    @SerializedName("movie_genre")
    @Expose
    private String movieGenre;

    public MovieModel(String id, String movieName, String movieImage, String movieGenre) {
        this.id = id;
        this.movieName = movieName;
        this.movieImage = movieImage;
        this.movieGenre = movieGenre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(String movieImage) {
        this.movieImage = movieImage;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }
}
