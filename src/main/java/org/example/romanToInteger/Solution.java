package org.example.romanToInteger;

import java.util.HashMap;

public class Solution {

    public int romanToInt(String s) {
        int result = 0, num = 0, prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I' -> num = 1;
                case 'V' -> num = 5;
                case 'X' -> num = 10;
                case 'L' -> num = 50;
                case 'C' -> num = 100;
                case 'D' -> num = 500;
                case 'M' -> num = 1000;
            }
            if (num < prev) {
                result -= num;
            } else {
                result += num;
            }
            prev = num;

        }
        return result;
    }
}
