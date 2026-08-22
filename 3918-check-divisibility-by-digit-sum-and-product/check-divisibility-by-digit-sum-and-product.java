class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;
        int sum = 0;
        int product = 1;

        while(num != 0)
        {
            int rem = num % 10;
            sum += rem;
            product *= rem;
            num = num / 10;
        }

        int finalsum = sum + product;
        if(n % finalsum == 0 )
        {
            return true;
        }

        return false;
    }
}