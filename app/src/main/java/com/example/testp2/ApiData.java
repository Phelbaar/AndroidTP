package com.example.testp2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiData {

    public static final String ENDPOINT = "https://swapi.co/api/";

    @GET("/planets/{id}")
    Call<List<Planet>> listPlanetId(@Path("id") int id);
}
