package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ExpertTest {
    @Test
    void returnsArray_whenCalled() {
        String[] testArray = {"T", "o", "s", "h", "y"};
        assertArrayEquals(testArray, Expert.stringToArray("T,o,s,h,y"));
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                "11,2",
                "22,4",
                "35,8",
                "234592305,33"
            }
    )
    void calculateCrosssum(int number, int expected) {
        assertEquals(expected, Expert.crossSum(number));
        assertEquals(expected, Expert.crossSumRecursive(number));
    }
    @ParameterizedTest
    @CsvSource(
            value = {
                    "3,III",
                    "17,XVII",
                    "59,LIX",
                    "1412,MCDXII"
            }
    )
    void convertToRoman(int number, String expected) {
        assertEquals(expected, Expert.toRoman(number));
    }
}