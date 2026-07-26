class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;

        int min = Arrays.stream(weights).max().getAsInt();
        int max = Arrays.stream(weights).sum();
        int left = min;
        int right = max;

        while(left < right)
        {
            int mid = left + (right - left)/2;

            if(daysneeded(weights,mid) <= days)
            {
                right= mid;
            }

            else
            {
                left = mid + 1;
            }
        }

        return left;

           
    }

    public int daysneeded(int [] weight, int cap)
    {
        int load = 0;
        int day = 1;

        for(int i = 0; i < weight.length; i++)
        {
            load += weight[i];
            if(load > cap )
            {
                day++;
                load = weight[i];
            }
        }

        return day;
    }
}