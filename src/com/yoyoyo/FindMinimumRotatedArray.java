package com.yoyoyo;

public class FindMinimumRotatedArray {

    public static void main(String[] args) {
        // write your code her
        int[] input = new int[]{3,4,5,1,2};
        //System.out.println(findMin(input));
        System.out.println(findMin(input));
    }

    public static int findMin(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;
        int begin = 0, end = nums.length - 1;

        while (begin + 1 < end) {
            if (nums[begin] < nums[end]) {
                return nums[begin];
            }
            int mid  = end - (end - begin)/2;
            if (nums[begin] < nums[mid]) { //means it didn't reach the edge yet
                begin = mid + 1;
            } else if (nums[begin] > nums[mid]){ //means the edge number is between begin and mid
                end = mid;
            }
        }

        if (nums[begin+1] < nums[begin]){
            return nums[begin+1];
        } else {
            return nums[begin];
        }


    }
}
