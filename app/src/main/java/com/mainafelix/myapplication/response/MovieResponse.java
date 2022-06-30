package com.mainafelix.myapplication.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mainafelix.myapplication.models.MovieModels;

public class MovieResponse {
    // finding the movie object
    @SerializedName("results")
    @Expose
    private MovieModels movie;
    public MovieModels getMovie(){
        return  movie;
    }

    @Override
    public String toString() {
        return "MovieResponse{" +
                "movie=" + movie +
                '}';
    }
}
