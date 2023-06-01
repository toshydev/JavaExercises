package org.example;

import static org.example.Fizzbuzz.fizzbuzz;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class FizzbuzzTests {
    @Test
    @DisplayName("4 returns '4'")
    void numString() {
        assertEquals("4", fizzbuzz(4));
    }
    @Test
    @DisplayName("9 returns 'fizz'")
    void fizz() {
        assertEquals("fizz", fizzbuzz(9));
    }

    @Test
    @DisplayName("10 returns 'buzz'")
    void buzz() {
        assertEquals("buzz", fizzbuzz(10));
    }

    @Test
    @DisplayName("15 returns 'fizzbuzz'")
    void fizzBuzz() {
        assertEquals("fizzbuzz", fizzbuzz(15));
    }
}
