package org.example.palindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(ints = {121, 313, 3434343, 0})
    void isPalindrome(int number) {
        boolean expected = true;
        boolean result = solution.isPalindrome(number);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-121, 3313, 13434343, 10})
    void isNotPalindrome(int number) {
        boolean expected = true;
        boolean result = solution.isPalindrome(number);
        assertNotEquals(expected, result);
    }

}
