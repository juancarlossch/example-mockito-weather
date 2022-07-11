package com.couse.javatesting.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.couse.javatesting.models.Weather;
import com.couse.javatesting.services.WeatherService;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;
    
    @GetMapping("/api/weather")
    public Weather getWeather(){
        return this.weatherService.getWeather();
    }
}
