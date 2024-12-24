class Solution {
    public int reverse(int x) {
        int result = 0;
        int sign = (x < 0) ? -1 : 1;  
        x = Math.abs(x);  

        while (x != 0) {
            int digit = x % 10; 
            x /= 10; 
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;  
            }
            result = result * 10 + digit;  
        }

        return result * sign;  
    }
}
