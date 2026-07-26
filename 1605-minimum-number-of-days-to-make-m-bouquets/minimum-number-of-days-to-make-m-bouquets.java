class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long totalflowers = (long)m * k;
        if(totalflowers > bloomDay.length) return -1;

        int min = Arrays.stream(bloomDay).min().getAsInt();
        int max = Arrays.stream(bloomDay).max().getAsInt();

        int low = min;
        int high = max;

        int result = -1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(isPossible(bloomDay,m,k,mid))
            {
                result = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return result;
        
    }

    public boolean isPossible(int [] bloomday, int m, int k, int day)
    {
        int count = 0;
        int bouquet = 0;

        for(int bloom : bloomday)
        {
            if(bloom <= day)
            {
                count++;
                if(count == k)
                {
                    bouquet++;
                    count = 0;
                }
            }
            else
            {
                count = 0;
            }

        }

        return bouquet >= m;
    }
}