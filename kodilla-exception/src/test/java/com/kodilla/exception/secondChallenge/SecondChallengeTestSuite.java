package com.kodilla.exception.secondChallenge;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {

    @Test
    void testProbablyIWillThrowException(){

        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When&Then
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(3, 2));
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(4, 5));
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0, 2));
    }

    @Test
    void testDontProbablyIWillThrowException(){

        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When&Then
        Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 2));

    }
}
