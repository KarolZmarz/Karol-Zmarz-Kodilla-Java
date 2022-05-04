package com.kodilla.testing.weather.stub;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }
    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for(Map.Entry<String, Double> temperature :
        temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double calculateMean() {
        return temperatures.getTemperatures().values().stream().mapToDouble(value -> value).average().getAsDouble();
    }
    public double calculateMedian() {
        List<Double> sortedValues = temperatures.getTemperatures().values().stream().sorted().collect(Collectors.toList());

        if(sortedValues.size() % 2 == 0) {
            return(sortedValues.get(sortedValues.size()/2) + sortedValues.get(sortedValues.size()/2-1))/2;
        }
        else {
            return sortedValues.get(sortedValues.size()/2);
        }
    }
}

