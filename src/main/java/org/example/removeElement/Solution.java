package org.example.removeElement;

import java.util.Arrays;

//https://leetcode.com/problems/remove-element/description/
public class Solution {
    public int removeElement(int[] nums, int val) {
        int temp = 0;
        for (int num : nums) {
            if (num != val) {
                nums[temp] = num;
                temp++;
            }
        }
        return temp;
    }
}
