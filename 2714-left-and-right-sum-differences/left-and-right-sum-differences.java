class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] leftsum = new int[nums.length];
        int [] rightsum = new int[nums.length];
        int result [] = new int[nums.length];
        int left = 0; 
        int right = 0;
        leftsum[0] = 0;
        rightsum[nums.length-1] = 0;

        for(int i = 0; i <= nums.length - 1 ; i ++)
        {
            for(int j = 0 ; j < i ; j ++)
            {
                leftsum[i] += nums[j];
            }
            for(int k = nums.length - 1; k > i ; k--)
            {
                rightsum[i] += nums[k];
            }
        }

        for(int i = 0; i < nums.length; i++)
        {
            result[i] = Math.abs(leftsum[i]-rightsum[i]);
        }

        return result;


    }
}