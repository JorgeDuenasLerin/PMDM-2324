package com.example.pmdm_2324.ut09.data;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceRickAndMorty {

    private static ServiceRickAndMorty instancia;
    private static RickAndMortyRepo repo;

    private ServiceRickAndMorty(){
        // Hago cosas
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://rickandmortyapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        repo = retrofit.create(RickAndMortyRepo.class);
    }

    public static RickAndMortyRepo getRepo(){
        return repo;
    }

    public static ServiceRickAndMorty getInstancia(){
        if(instancia == null){
            instancia =  new ServiceRickAndMorty();
        }
        return instancia;
    }
}
