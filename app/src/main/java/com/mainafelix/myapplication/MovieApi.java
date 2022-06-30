package com.mainafelix.myapplication;

import com.mainafelix.myapplication.response.MovieSearchResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApi {
    @GET
    Call<MovieSearchResult>searchMovie(
    @Query("api_key")String key,
    @Query("query")String query,
    @Query("page")String page
    )
}
