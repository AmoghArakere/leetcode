public class Solution {
    public int firstUniqChar(String s) {

        Map<Character, int[]> charMap = new LinkedHashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charMap.containsKey(c)) {
                charMap.get(c)[0]++; 
            } else {
                charMap.put(c, new int[]{1, i}); 
            }
        }
        int resultIndex = Integer.MAX_VALUE;
        for (int[] value : charMap.values()) {
            if (value[0] == 1) { 
                resultIndex = Math.min(resultIndex, value[1]); 
            }
        }
        
        return resultIndex == Integer.MAX_VALUE ? -1 : resultIndex;
    }

}
