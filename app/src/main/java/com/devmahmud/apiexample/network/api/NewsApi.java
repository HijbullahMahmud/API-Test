package com.devmahmud.apiexample.network.api;

import com.devmahmud.apiexample.model.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface NewsApi {
    @GET("all_news.php")
    Call<List<News>> getAllNewsData();
}
