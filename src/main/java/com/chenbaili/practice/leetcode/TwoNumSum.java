package com.chenbaili.practice.leetcode;

import java.util.Arrays;

public class TwoNumSum {

    public static int[] twoSum(int target) {
        int[] arr = {2, 2, 3, 11, 15, 7};
        int[] reArr = {};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    int result = arr[i] + arr[j];
                    if (result == target) {
                        reArr = new int[]{i, j};
                        continue;
                    }
                }
            }
        }
        return reArr;
    }


    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }



    public static void main(String[] args) {
        int[] a = twoSum(9);
        int[] arr = {2, 2, 3, 11, 15, 7};
        int[] b = twoSum(arr,9);
        System.out.println(b);
    }
}
