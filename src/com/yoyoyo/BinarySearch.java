package com.yoyoyo;

public class BinarySearch {

    public static void main(String[] args) {
        // write your code here
        int[] input = new int[]{4, 5, 6, 7, 0, 1, 2, 3, 4};
        System.out.println(findMin(input));
    }

    /*
    153. Find Minimum in Rotated Sorted Array
    https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
     */
    public static int findMin(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;
        int start = 0, end = nums.length - 1;

        while (start + 1 < end) {
            if (nums[start] < nums[end]) {
                return nums[start];
            }
            int mid = start + (end - start) / 2;
            if (nums[start] < nums[mid]) { //means it didn't reach the edge yet
                start = mid;
            } else {
                end = mid;
            }
        }
        return Math.min(nums[start], nums[end]);

    }
}
