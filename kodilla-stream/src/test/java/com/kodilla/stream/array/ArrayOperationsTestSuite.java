package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;
import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {4, 3, 1, 2, 0, 3, 9};
        //When
        double result = getAverage(numbers);
        //Then
        assertEquals(3.14, result, 0.003); //wynik 3.1428 sprawdzam działanie delty
    }
}