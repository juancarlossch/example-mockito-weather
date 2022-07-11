package com.couse.javatesting.services;

import org.springframework.stereotype.Service;

import com.couse.javatesting.models.Weather;

@Service
public class WeatherService {

    public Weather getWeather(){
        Weather weather = new Weather();
        weather.setMaxTemp(0);
        weather.setMinTemp(0);
        weather.setStatus("DEmo");
        return weather;
    }
    
}
