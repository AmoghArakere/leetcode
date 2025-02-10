class Solution {
    public String clearDigits(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                while (top >= 0 && !(stack[top] >= '0' && stack[top] <= '9')) {
                    top--; 
                    break;
                }
            } else {
                stack[++top] = ch;
            }
        }
        
        String result = "";
        for (int i = 0; i <= top; i++) {
            result += stack[i];
        }
        
        return result;   
    }
}