package com.chaomeee;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] input = new int[]{4, 5, 6, 7, 0, 1, 2, 3, 4};
        System.out.println(findMin(input));
    }

    public static int findMin(int[] num) {
        if (num == null || num.length == 0) {
            return 0;
        }
        if (num.length == 1) {
            return num[0];
        }
        int start = 0, end = num.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (num[mid] < num[mid - 1]) {
                return num[mid];
            }
            if (num[start] <= num[mid] && num[mid] > num[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return Math.min(num[start], num[end]);

    }
}
