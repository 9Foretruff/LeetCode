package org.example.palindrome;
//https://leetcode.com/problems/palindrome-number/
public class Solution {
    public boolean isPalindrome(int x) {
        int revers = 0;
        int temp = x;
        while (x > 0) {
            int digit = x % 10;
            revers = revers * 10 + digit;
            x /= 10;
        }
        return revers == temp;
    }
}
