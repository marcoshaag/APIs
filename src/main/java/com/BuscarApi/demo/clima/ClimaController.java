package com.BuscarApi.demo.clima;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@RestController
public class ClimaController {

    private static final String API_KEY = "1b57293884171a7bfc1b1bfeea75dd99";
    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather?q=";

    @GetMapping("/clima/{cidade}")
    public Clima buscarClima(@PathVariable String cidade) {
        String url = BASE_URL + cidade + "&appid=" + API_KEY + "&units=metric&lang=pt_br";


        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Clima.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao achar clime ", e);
        }

    }
}
