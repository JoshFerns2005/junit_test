package com.example.app;

public class WeatherService {
    private TemperatureService temperatureService;

    public WeatherService(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    public String  getWeatherDescription(int temperature) {
        if (temperatureService.isHot(temperature)) {
            return "It's hot outside!";
        } else {
            return "It's not too hot.";
        }
    }
}

