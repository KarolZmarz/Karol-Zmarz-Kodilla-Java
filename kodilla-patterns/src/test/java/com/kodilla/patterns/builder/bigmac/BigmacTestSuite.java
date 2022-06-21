package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("White bun")
                .ingredient("Cheddar")
                .ingredient("tomato")
                .sauce("cream sauce")
                .burgers(1)
                .ingredient("red onion")
                .ingredient("salas")
                .ingredient("Bacon")
                .ingredient("arugula lettuce")
                .ingredient("breaded cheese")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        //Then
        assertEquals(7, howManyIngredients);
        assertEquals(1, howManyBurgers);
        assertEquals("White bun", bigmac.getRoll());
        assertEquals("cream sauce", bigmac.getSauce());
    }
}
