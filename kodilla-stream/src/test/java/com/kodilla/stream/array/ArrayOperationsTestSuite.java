package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        int i;
        for (i =0; i < 20; i++) {
            numbers[i] = i;
        }
        //When
        double average = getAverage(numbers);
        //Then
        Assertions.assertEquals(9.5, average);
    }
}
//    Test powinien przygotować tablicę z przykładowymi wartościami typu int i wywołać metodę
//    getAverage(int[] numbers) interfejsu ArrayOperations.
//        Przy pomocy asercji sprawdź, czy obliczona średnia jest poprawna.