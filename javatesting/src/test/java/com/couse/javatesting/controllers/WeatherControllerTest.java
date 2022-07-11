package com.couse.javatesting.controllers;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.couse.javatesting.models.Weather;
import com.couse.javatesting.services.WeatherService;

@ExtendWith(MockitoExtension.class)
public class WeatherControllerTest {

    @InjectMocks
    private WeatherController controller;

    // Mock significa que es de prueba solo para verficar como funciona
    @Mock
    private WeatherService weatherService;
    
    @Test
    public void getWeather(){
        Weather weatherMock = new Weather();
        weatherMock.setMaxTemp(0);
        weatherMock.setMinTemp(0);
        weatherMock.setStatus("Cloudy");
        when(weatherService.getWeather()).thenReturn(weatherMock);
        Weather result = controller.getWeather();
        verify(weatherService,times(1)).getWeather();
    }
}
