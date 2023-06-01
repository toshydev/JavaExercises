package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoviceTest {
    @Test
    void yieldsTrue_whenCalledWith5() {
        assertTrue(Novice.isGtZero(5));
    }
    @Test
    void yields16_whenCalledWith4() {
        assertEquals(16, Novice.square(4));
    }
}