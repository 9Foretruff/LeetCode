package org.example.romanToInteger;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(strings = {"X","VV","IIIIIIIIII","IXI"})
    void romanToInt(String text) {
        int expected = 10;
        int result = solution.romanToInt(text);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"IXV","VVIV","VX","IXI"})
    void romanNotToInt(String text) {
        int expected = 15;
        int result = solution.romanToInt(text);
        assertNotEquals(expected, result);
    }
}