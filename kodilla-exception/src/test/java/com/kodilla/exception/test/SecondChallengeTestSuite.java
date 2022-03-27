package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {

    @Test
    void testProbablyIWillThrowException() {
        //Given
        SecondChallenge twoDoubles = new SecondChallenge();
        //When & Then
        assertDoesNotThrow(() -> twoDoubles.probablyIWillThrowException(1, 2));// both good
        assertThrows(SecondChallengeException.class, () -> twoDoubles.probablyIWillThrowException(2, 1.5)); // both bad
        assertThrows(SecondChallengeException.class, () -> twoDoubles.probablyIWillThrowException(2, 3)); // first bad
        assertThrows(SecondChallengeException.class, () -> twoDoubles.probablyIWillThrowException(1.5, 1.5)); // second bad
    }
}
