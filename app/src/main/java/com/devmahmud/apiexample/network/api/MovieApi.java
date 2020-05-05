package com.devmahmud.apiexample.network.api;

import com.devmahmud.apiexample.model.MovieModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApi {
    @GET("movies.php")
    Call<List<MovieModel>> getAllMovies(@Query("id") int id);
}
