class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxval = Arrays.stream(piles).max().getAsInt();
        int low = 1; 
        int high = maxval;
        int ans = maxval;

        while(low <= high)
        {
            int mid = low + (high - low)/2;
            long hours = calculatetotalhours(piles,mid);
            if(hours <= h)
            {
                ans = mid;
                high = mid - 1 ;
            }
            else
            {
                low = mid + 1;
            }
        }
        return ans;
        

    }

    public long calculatetotalhours(int [] a, int hourly)
    {
        long totalhours = 0;
        for(long pile : a)
        {
            totalhours += (long)Math.ceil((double)pile/hourly);

        }
        return totalhours;
    }
}
