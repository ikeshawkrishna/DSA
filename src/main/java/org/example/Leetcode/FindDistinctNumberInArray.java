package org.example.Leetcode;

import java.util.Arrays;

// 268. Missing Number
public class FindDistinctNumberInArray {
    public static void main(String[] args) {
    int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        // Case 1
        if (nums[0] != 0) return 0;

        // Case 2
        if (nums[n - 1] != n) return n;

        // Case 3
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != i) return i;
        }

        return 0;
    }
}
