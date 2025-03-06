class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;
        long sumActual = 0, sumSquaresActual = 0;
        long sumExpected = (long) N * (N + 1) / 2;
        long sumSquaresExpected = (long) N * (N + 1) * (2 * N + 1) / 6;
        
        Set<Integer> seen = new HashSet<>();
        int repeating = -1;
        
        for (int[] row : grid) {
            for (int num : row) {
                sumActual += num;
                sumSquaresActual += (long) num * num;
                if (!seen.add(num)) {
                    repeating = num;
                }
            }
        }
        
        long diff = sumExpected - sumActual; 
        long sumDiff = sumSquaresExpected - sumSquaresActual; 
        long sumPlus = sumDiff / diff; 
        
        int missing = (int) ((diff + sumPlus) / 2);
        return new int[]{repeating, missing};  
    }
}