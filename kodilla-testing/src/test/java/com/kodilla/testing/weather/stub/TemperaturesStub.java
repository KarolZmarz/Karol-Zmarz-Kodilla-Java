package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class TemperaturesStub implements Temperatures {
    @Override
    public Map<String, Double> getTemperatures() {
        Map<String, Double> stubResult = new HashMap<>();

        stubResult.put("Rzeszow",25.5);
        stubResult.put("Kraków", 26.4);
        stubResult.put("Wroclaw", 23.6);
        stubResult.put("Warszawa", 30.1);
        stubResult.put("Gdansk", 21.4);

        return stubResult;
    }

}
