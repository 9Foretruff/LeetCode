package org.example.checkIfAllAsAppearsBeforeAllBs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(strings = {"ab","aaa","b","abb","aaabbb"})
    void checkString(String text) {
        boolean expected = true;
        boolean result = solution.checkString(text);
        assertEquals(expected,result);
    }

}