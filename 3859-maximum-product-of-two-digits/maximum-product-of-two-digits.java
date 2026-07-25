class Solution {
    public int maxProduct(int n) {
       int firstmaximum = 0;
       int secondmaximum = 0;

       while(n > 0)
       {
            int x = n % 10;
            if( x > firstmaximum)
            {
                secondmaximum = firstmaximum;
                firstmaximum = x;
            }
            else if(x > secondmaximum)
            {
                secondmaximum = x;
            }

            n /= 10;
       }

        return firstmaximum * secondmaximum;
    }
}