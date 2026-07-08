class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int tempcount = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1)
            {
                    tempcount++;
            }
            else
            {
                tempcount = 0;
            }
            count = Math.max(count, tempcount);
        }
        return count;
    }
}