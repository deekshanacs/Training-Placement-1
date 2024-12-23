class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x; 
        }
        
        int left = 0, right = x, result = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;
            
            if (square == x) {
                return mid;
            } else if (square < x) {
                result = mid;
                left = mid + 1; 
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
}
