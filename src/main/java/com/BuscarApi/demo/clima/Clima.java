package com.BuscarApi.demo.clima;

import java.util.List;

// Lembrando que isso é analisando de como vem o Json de https://openweathermap.org/current, com base nisso faco meu DTO

public record Clima(
        Main main,
        List<Weather> weather,
        Coord coord
) {
    public record Main(double temp) {}

    public record Weather(String description) {}

    public record Coord(double lat, double lon) {}

    public double getTemperatura() {
        return main.temp();
    }

    public String getDescricao() {
        return weather.get(0).description();
    }

    public double getLatitude() {
        return coord.lat();
    }

    public double getLongitude() {
        return coord.lon();
    }
}
