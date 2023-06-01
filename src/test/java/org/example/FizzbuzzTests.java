package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class FizzbuzzTests {
    @ParameterizedTest
    @CsvSource(
            value = {
                    "4,4",
                    "9,fizz",
                    "10,buzz",
                    "15,fizzbuzz"
            }
    )
    void getFizzBuzzOrNumber(int number, String expected) {
        assertEquals(expected, Fizzbuzz.fizzbuzz(number));
    }
}
