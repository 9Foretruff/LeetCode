package org.example.checkIfAllAsAppearsBeforeAllBs;
//https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
public class Solution {
    public boolean checkString(String s) {
        int lastA = -1;
        int lastB = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') lastA = i;
            else lastB = i;
            if (lastB < lastA && lastB != -1)  return false;
        }
        return true;
        // Or -> return !s.contains("ba");
    }
}
