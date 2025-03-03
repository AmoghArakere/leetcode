class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int num : nums) {
            if (num < pivot) {
                less.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                greater.add(num);
            }
        }

        int i = 0;
        for (int num : less) nums[i++] = num;
        for (int num : equal) nums[i++] = num;
        for (int num : greater) nums[i++] = num;

        return nums;  
    }
}