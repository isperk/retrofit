package com.dev.retrofit.IRetrofit;

import com.dev.retrofit.PokemonFeed;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestClient {
    @GET("pokemon")
    Call<PokemonFeed> getData();

}
