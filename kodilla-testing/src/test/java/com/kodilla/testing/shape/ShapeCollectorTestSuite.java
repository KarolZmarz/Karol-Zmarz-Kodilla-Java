package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;

@DisplayName("Shape Collector Test Suite ")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeEach
    public void beforeEach() {
        testCounter++;
        System.out.println("Preparing to execute test number" + testCounter);
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Starting of ShapeCollector test");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Ending of ShapeCollector test");
    }

    @Nested
    @DisplayName("List of manipulation tests")
    class TestListManipulation {

        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(6);

            //When
            shapeCollector.addFigure(square);
            int result = shapeCollector.getShapesQuantity();

            //Then
            Assertions.assertEquals(1,result);
        }
        @Test
        void testRemoveFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(7);

            //When
            boolean result = shapeCollector.removeFigure(circle);

            //Then
            Assertions.assertFalse(result);
        }
        @Test
        void testGettingFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(6);
            shapeCollector.addFigure(square);

            //When
            boolean result = shapeCollector.removeFigure(square);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0,shapeCollector.getShapesQuantity());
        }
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(6);
            shapeCollector.addFigure(square);
            Circle circle = new Circle(7);
            shapeCollector.addFigure(circle);
            Triangle triangle = new Triangle(4, 12);
            shapeCollector.addFigure(triangle);

            //When
            String result = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("SquareCircleTriangle", result);


        }

    }

}
