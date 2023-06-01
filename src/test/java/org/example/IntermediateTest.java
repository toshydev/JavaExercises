package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntermediateTest {
    @Test
    void yieldsTen_whenCalledWith10() {
        assertEquals("Ten", Intermediate.getNumString(10));
    }
}