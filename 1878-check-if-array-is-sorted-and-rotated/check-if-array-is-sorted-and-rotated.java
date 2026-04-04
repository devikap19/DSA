class Solution {
    public boolean check(int[] nums) {
        int b = 0;

        for(int i = 0; i < nums.length - 1 ; i++)
        {
            if(nums[i] > nums[i+1])
            {
                b++;
            }
            
        }

        if(nums[nums.length -1] > nums[0])
        {
            b++;
        }

        if(b <=1)
        {
            return true;
        }

        return false;


       
    }
}