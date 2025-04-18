class Solution {
    public int punishmentNumber(int n) {
         int sum = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (isValidPartition(String.valueOf(square), 0, i)) {
                sum += square;
            }
        }
        return sum;
    }

    private boolean isValidPartition(String num, int index, int target) {
        if (index == num.length()) {
            return target == 0;
        }
        int sum = 0;
        for (int i = index; i < num.length(); i++) {
            sum = sum * 10 + (num.charAt(i) - '0');
            if (sum > target) break;
            if (isValidPartition(num, i + 1, target - sum)) {
                return true;
            }
        }
        return false;
    }
  
}
