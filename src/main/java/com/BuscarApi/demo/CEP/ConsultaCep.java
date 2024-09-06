package com.BuscarApi.demo.CEP;


import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {

    private static final String BASE_URL = "https://viacep.com.br/ws/";


    public Endereco buscarEndereco(String cep) {

        String url = BASE_URL + cep + "/json/";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (IOException | InterruptedException e ) {
            throw new RuntimeException("Ero ao adicionar cep" + e);
        }



    }
}