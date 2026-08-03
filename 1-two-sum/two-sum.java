class Solution {
    public int[] twoSum(int[] nums, int target) {
       int numswithindex [][] = new int[nums.length][2];

       for(int i = 0; i < nums.length; i ++)
       {
            numswithindex[i][0] = nums[i];
            numswithindex[i][1] = i;
       }

       Arrays.sort(numswithindex, (a,b) -> Integer.compare(a[0],b[0]));

       int left = 0;
       int right = nums.length -1 ;

       while(left < right)
       {
            int sum = numswithindex[left][0] + numswithindex[right][0];
            if(sum == target)
            {
                return new int[]{numswithindex[left][1],numswithindex[right][1]};
            }
            else if(sum < target)
            {
                left++;
            }
            else
            {
                right--;
            }
       }

       return new int[]{-1,-1};

    }
}