package com.chenbaili.practice.leetcode;


import java.util.*;

public class ThreeNumSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(nums.length);
        if (nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (j == i + 1 || nums[j - 1] != nums[j]) {
                        int sum = nums[i] + nums[j];
                        //数组中未循环的数字，是否存在前面两个数相加的相反数
                        sum = -sum;
                        Integer index = map.get(sum);
                        if (index != null) {
                            //未循环的数字（此处可以全数组查找，但没有，这样做可以降低效率）
                            if (index > j) {
                                result.add(Arrays.asList(nums[i], nums[j], sum));
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {};
        System.out.println( threeSum(arr));
    }
}
