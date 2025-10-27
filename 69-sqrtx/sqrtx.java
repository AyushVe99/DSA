class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        for (long i = 1; i * i <= x; i++) {
            if (i * i == x) {
                return (int)i;
            } else if ((i + 1) * (i + 1) > x) {
                return (int)i;
            }
        }
        return 0; 
    }
}
