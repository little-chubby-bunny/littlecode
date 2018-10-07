class Solution {
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;
        int begin = 0, end = nums.length - 1;
        
        while (begin < end) {
           // int mid = end - (end - bgein)/2;
            if (nums[end] > nums[begin]) {
                begin++;
            } else {
                end--;
            }
        }
        return end;
    }
}