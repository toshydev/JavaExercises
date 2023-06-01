package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class MethodTests {
    @ParameterizedTest
    @CsvSource(
            value = {
                    "2,3,5",
                    "25,53,78",
                    "234234,242423,476657"
            }
    )
    void addsTwoNumbers(int a, int b, int expected) {
        assertEquals(expected, Methods.sum(a, b));

    }
    @ParameterizedTest
    @CsvSource(
            value = {
                    "42,255,true",
                    "5,99,false",
                    "1241312,22342423,true",
                    "0,0,false"
            }
    )
    void checksGt100(int a, int b, boolean expected) {
        assertEquals(expected, Methods.gt100(a, b));

    }
    @ParameterizedTest
    @CsvSource(
            value = {
                    "42,false",
                    "-255,true",
                    "0,false"
            }
    )
    void checksGtZero(int number, boolean expected) {
        assertEquals(expected, Methods.smallerThanZero(number));
    }
    @ParameterizedTest
    @CsvSource(
            value = {
                    "5,3,false,8",
                    "4,6,false,24",
                    "6,7,true,1"
            }
    )
    void sumSquareOrSubstractTest(int a, int b, boolean subtract, int expected) {
        assertEquals(expected, Methods.sumSquareOrSubstract(a, b, subtract));
    }
}
