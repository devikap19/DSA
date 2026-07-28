class Solution {
    public int fib(int n) {
        if(n == 0)
        {
            return 0;
        }
        else if(n == 1)
        {
            return 1;
        }

        int secondlast = 0;
        int last = 1;
        int curr;
        for(int i = 2; i <= n; i++)
        {
            curr = secondlast + last;
            secondlast = last;
            last = curr;
        }

        return last;
    
           
    }
}