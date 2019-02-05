package com.example.testp2;

import android.content.Context;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final RecyclerView rv = (RecyclerView) findViewById(R.id.list);
        rv.setLayoutManager(new LinearLayoutManager(this));
        //rv.setAdapter(new MyAdapter());

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        ApiData apiData = new Retrofit.Builder()
                .baseUrl(ApiData.ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
                .create(ApiData.class);

        apiData.listPlanetId(2).enqueue(new Callback<List<Planet>>() {
            @Override
            public void onResponse(Call<List<Planet>> call, Response<List<Planet>> response) {
                response.body();
            }

            @Override
            public void onFailure(Call<List<Planet>> call, Throwable t) {

            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
    }

    public void afficherPlanet(List<Planet> planet) {
        Toast.makeText(this, "nombre de dépots : " + planet.size(), Toast.LENGTH_SHORT).show();
    }

    public void back(View view){
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }

    public void toastMe(View view){
        Toast.makeText(this, "Ça a cliqué", Toast.LENGTH_SHORT).show();
    }
}
