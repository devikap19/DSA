class Solution {
    public int majorityElement(int[] nums) {
        int count = nums.length/2;
        int var = 0;
        for(int i = 0; i < nums.length; i ++)
        {
             int n = 0;
            for(int j = 0; j < nums.length; j ++)
            {
               
                if(nums[i] == nums[j])
                n++;

            }
           if(n > count)
           {
            var = i;
            break;
           }
        }
        return nums[var];
        
    }
}