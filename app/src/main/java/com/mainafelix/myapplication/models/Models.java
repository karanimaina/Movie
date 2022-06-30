package com.mainafelix.myapplication.models;

public class Models {
    private String title;
    private String poster_path;
    private String release_date;
    private int movie_id;
    private Float vote_average;
    private String movie_overview;

    public Models(String title, String poster_path, String release_date, int movie_id, Float vote_average, String movie_overview) {
        this.title = title;
        this.poster_path = poster_path;
        this.release_date = release_date;
        this.movie_id = movie_id;
        this.vote_average = vote_average;
        this.movie_overview = movie_overview;
    }

    public String getTitle() {
        return title;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public String getRelease_date() {
        return release_date;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public Float getVote_average() {
        return vote_average;
    }

    public String getMovie_overview() {
        return movie_overview;
    }
}
