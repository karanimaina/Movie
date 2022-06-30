package com.mainafelix.myapplication.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mainafelix.myapplication.models.MovieModels;

import java.util.List;

public class MovieSearchResult {
    @SerializedName("total_result")
    @Expose()
    private int  total_count;

    @SerializedName("results")
    @Expose()
    private List<MovieModels> movie;
    public int getTotal_count(){
        return total_count;
    }
    public  List<MovieModels>getMovie;
}
