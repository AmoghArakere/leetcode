class Solution {
    public int maximumCount(int[] nums) {
        int negCount = binarySearch(nums, 0);  
        int posCount = nums.length - binarySearch(nums, 1); 
        return Math.max(negCount, posCount);
    }

    private int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}