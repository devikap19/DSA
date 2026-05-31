class Solution {
    public int[] searchRange(int[] nums, int target) {
      int ans [] = new int[]{-1,-1};
      int start = 0; 
      int end = nums.length - 1;

      while(start <= end)
      {
        int mid = start + (end - start) / 2;
        if(nums[mid] == target)
        {
            ans[1] = mid;
            start = mid + 1;
        }
        else if(nums[mid] < target )
        {
            start = mid + 1;
           
        }
        else
        {
             end = mid -1;
        }
      }

      int left = 0, right = nums.length - 1;

      while(left <= right)
      {
        int mid = left + (right - left) / 2;
        if(nums[mid] == target)
        {
            ans[0] = mid;
            right = mid - 1;
        }
        else if(nums[mid] < target)
        {
            left = mid + 1;
        }
        else 
        {
            right = mid - 1;
        }
      }
    return ans;
    }

}