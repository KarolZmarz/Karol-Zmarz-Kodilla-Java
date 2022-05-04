package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;



@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {
    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
    void before(){
        when(temperaturesMock.getTemperatures())
                .thenReturn(Map.of("Rzeszow", 25.5, "Krakow", 24.5, "Wroclaw",
                        23.5, "Warszawa", 22.5, "Gdansk", 21.5));
    }
    @Test
    void testCalculateForecastWithMock(){
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int sensorsQuantity = weatherForecast.calculateForecast().size();

        //Then
        assertEquals(5,sensorsQuantity);
    }

    @Test
    void testCalculateMean(){
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double result = weatherForecast.calculateMean();

        //Then
        assertEquals(23.5, result);

    }

    @Test
    void testCalculateMedianOddCase(){
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double result = weatherForecast.calculateMedian();

        //Then
        assertEquals(23.5, result);

    }
    @Test
    void testCalculateMedianEvenCase(){
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures())
                .thenReturn(Map.of("Krakow", 22.2, "Wroclaw", 23.2,
                                "Warszawa", 24.2, "Gdansk", 25.2));

        //When
        double result = weatherForecast.calculateMedian();

        //Then
        assertEquals(23.7, result);

    }

}
