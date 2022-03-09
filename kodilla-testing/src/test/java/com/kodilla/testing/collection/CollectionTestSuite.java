package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when list is empty, " +
            "then collection should contain no odd numbers"
    )

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        //Given
        ArrayList<Integer> entryData = new ArrayList<>();

        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(entryData);
        boolean noOddNumbers = true;
        for (Integer entry : oddNumbersExterminator.exterminate(entryData))
            if (entry % 2 != 0) {
                noOddNumbers = false;
                break;
            }

        //Then
        Assertions.assertTrue(noOddNumbers);

    }

    @DisplayName("when list has even and odd numbers, " +
            "then method exterminate should exterminate odd numbers"
    )

    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given
        ArrayList<Integer> entryData = new ArrayList<>();
        for (int i = 0; i < 100; i++)
            entryData.add(i);

        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(entryData);
        boolean noOddNumbers = true;
        for (Integer entry : oddNumbersExterminator.exterminate(entryData))
            if (entry % 2 != 0) {
                noOddNumbers = false;
                break;
            }

        //Then
        Assertions.assertTrue(noOddNumbers);
    }
}