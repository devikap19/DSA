class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();

        while(low<=high)
        {
            int mid = (high + low) / 2;

            if(getsum(nums,mid) <= threshold)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1; 
            }
        }

        return low;
    }

    public int getsum(int [] arr, int day)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += (int) Math.ceil((double) arr[i]/day);
        }

        return sum;
    }
}