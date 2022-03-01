package com.kodilla.testing.collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

    @DisplayName("when list is empty, " +
            "then collection should contain no odd numbers"
    )

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        boolean noOddNumbers = true;
        ArrayList<Integer> entryData = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(entryData);
        for (Integer entry : oddNumbersExterminator.exterminate(entryData))
            if (entry % 2 != 0) {
                noOddNumbers = false;
                break;
            }

        if (noOddNumbers)
            System.out.println("Test OK");
        else
            System.out.println("OddNumbersExterminator ERROR");

    }

    @DisplayName("when list has even and odd numbers, " +
            "then method exterminate should exterminate odd numbers"
    )

    @Test
    public void testOddNumbersExterminatorNormalList() {
        boolean noOddNumbers = true;
        ArrayList<Integer> entryData = new ArrayList<>();
        for (int i = 0; i < 100; i++)
            entryData.add(i);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(entryData);
        for (Integer entry : oddNumbersExterminator.exterminate(entryData))
            if (entry % 2 != 0) {
                noOddNumbers = false;
                break;
            }

        if (noOddNumbers)
            System.out.println("Test OK");
        else
            System.out.println("OddNumbersExterminator ERROR");

    }
}