package com.progtechuc.moviedb.retrofit;

import com.progtechuc.moviedb.model.Movies;
import com.progtechuc.moviedb.model.NowPlaying;
import com.progtechuc.moviedb.model.Popular;
import com.progtechuc.moviedb.model.UpComing;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiEndPoint {

    @GET("movie/{movie_id}")
    Call<Movies> getMovieById(
            @Path("movie_id") String movie_id,
            @Query("api_key") String apiKey
    );

    @GET("movie/now_playing")
    Call<NowPlaying> getNowPlaying(
            @Query("api_key") String apiKey
    );

    @GET("movie/upcoming")
    Call<UpComing> getUpComing(
            @Query("api_key") String apiKey
    );

    @GET("movie/popular")
    Call<Popular> getPopular(
            @Query("api_key") String apiKey
    );



}
