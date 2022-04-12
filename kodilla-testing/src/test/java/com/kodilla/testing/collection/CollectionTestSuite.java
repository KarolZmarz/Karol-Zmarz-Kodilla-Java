package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("OddNumberExterminator test start");
    }
    @AfterEach
    public void after() {
        System.out.println("OddNumberExterminator test stop");
    }

    @DisplayName("OddNumberExterminator test case with empty list")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> testingList = List.of();

        //When
        List<Integer> result = OddNumbersExterminator.exterminate(testingList);

        List<Integer> expectedResult = List.of();

        //Then
        Assertions.assertEquals(expectedResult, result);
    }
    @DisplayName("OddNumberExterminator test case with normal list")
    @Test
    void testNumbersExterminatorNormalList(){

        //Given
        List<Integer> testingList  = List.of(73,82,1,45,90,567,211,900);

        //When
        List<Integer> result = OddNumbersExterminator.exterminate(testingList);

        List<Integer> expectedResult = List.of(82,90,900);

        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
