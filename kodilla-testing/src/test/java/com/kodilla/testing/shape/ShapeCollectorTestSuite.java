package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTest() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTest() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName(("Tests for ShapeCollector methods"))
    class TestShapeCollectorMethods {

        @Test
        public void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            int collectionSizeBefore = shapeCollector.getShapeCollector().size();
            //When
            Shape shape = new Triangle(5, 5);
            shapeCollector.addFigure(shape);
            int collectionSizeAfter = shapeCollector.getShapeCollector().size();
            //Then
            Assertions.assertNotEquals(collectionSizeAfter, collectionSizeBefore);
            Assertions.assertEquals(1, shapeCollector.getShapeCollector().size());
        }

        @Test
        public void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(5, 5);
            shapeCollector.addFigure(shape);
            int collectionSizeBefore = shapeCollector.getShapeCollector().size();
            //When
            shapeCollector.removeFigure(shape);
            int collectionSizeAfter = shapeCollector.getShapeCollector().size();
            //Then
            Assertions.assertNotEquals(collectionSizeAfter, collectionSizeBefore);
            Assertions.assertEquals(0, shapeCollector.getShapeCollector().size());
        }

        @Test
        public void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(5, 5);
            shapeCollector.addFigure(shape);
            //When
            Shape expectedShape = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(shape, expectedShape);
        }

        @Test
        public void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(5, 5);
            shapeCollector.addFigure(shape);
            //When
            String expectedShapes = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals("Triangle", expectedShapes);
        }

    }
}
