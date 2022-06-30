package com.mainafelix.myapplication.models;

import android.os.Parcel;
import android.os.Parcelable;

public class MovieModels implements Parcelable {
    private String title;
    private String poster_path;
    private String release_date;
    private int movie_id;
    private Float vote_average;
    private String movie_overview;

    public MovieModels(String title, String poster_path, String release_date, int movie_id, Float vote_average, String movie_overview) {
        this.title = title;
        this.poster_path = poster_path;
        this.release_date = release_date;
        this.movie_id = movie_id;
        this.vote_average = vote_average;
        this.movie_overview = movie_overview;
    }

    protected MovieModels(Parcel in) {
        title = in.readString();
        poster_path = in.readString();
        release_date = in.readString();
        movie_id = in.readInt();
        if (in.readByte() == 0) {
            vote_average = null;
        } else {
            vote_average = in.readFloat();
        }
        movie_overview = in.readString();
    }

    public static final Creator<MovieModels> CREATOR = new Creator<MovieModels>() {
        @Override
        public MovieModels createFromParcel(Parcel in) {
            return new MovieModels(in);
        }

        @Override
        public MovieModels[] newArray(int size) {
            return new MovieModels[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(Parcel parcel, int i) {
   parcel.writeString(title);
   parcel.writeString(poster_path);
   parcel.writeString(release_date);
   parcel.writeInt(movie_id);
   parcel.writeFloat(vote_average);
   parcel.writeString(movie_overview);
    }
}
