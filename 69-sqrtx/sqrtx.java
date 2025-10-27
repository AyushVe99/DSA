class Solution {
    public int mySqrt(int x) {

        int sqrt = 0;
        if(x<2){
            return x;
        }

        for (long i = 0; i <= x; i++) {
            long xdouble=x;
            if (i * i == xdouble) {
                return (int)i;
            } else if (i * i > xdouble) {
                return (int)i - 1;
            }
        }
        return 0;

    }
}