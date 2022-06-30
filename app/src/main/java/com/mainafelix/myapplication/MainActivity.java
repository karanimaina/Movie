package com.mainafelix.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mainafelix.myapplication.databinding.ActivityMainBinding;
import com.mainafelix.myapplication.request.Service;
import com.mainafelix.myapplication.response.MovieSearchResult;

import retrofit2.Call;

public class MainActivity extends AppCompatActivity {
Button btn;
ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getRetrofitResponse();
            }
        });
    }

    private void getRetrofitResponse() {
   MovieApi movieApi= Service.getMovieApi();
        Call<MovieSearchResult> responseCall = movieApi
                .sesrchMovie
    }
}