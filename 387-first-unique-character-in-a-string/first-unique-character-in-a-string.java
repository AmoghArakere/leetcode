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

        for (Map.Entry<Character, int[]> entry : charMap.entrySet()) {
            if (entry.getValue()[0] == 1) { 
                return entry.getValue()[1]; 
            }
        }
        return -1;

}
}
