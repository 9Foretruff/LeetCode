package org.example.removeElement;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideArrays")
    void removeElement(int[] nums, int val) {
        int expected = 2;
        int result = solution.removeElement(nums, val);
        assertEquals(expected, result);
    }

    static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 2, 3}, 2),
                Arguments.of(new int[]{4, 5, 6, 4}, 4),
                Arguments.of(new int[]{6, 5, 6, 4, 6, 6}, 6),
                Arguments.of(new int[]{10, 5, 10, 4, 10, 10}, 10),
                Arguments.of(new int[]{4, 3, 6, 3, 3}, 3),
                Arguments.of(new int[]{9, 9, 9, 4, 5}, 9)
        );
    }
}