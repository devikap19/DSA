class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;

        for(int i = nums.length - 2; i >= 0; i--)
        {
            if(nums[i] < nums[i + 1])
            {
                index = i;
                break;
            }
        }

        if(index == -1)
        {
            reverse(0, nums.length - 1, nums);
            return;
        }

        for(int i = nums.length - 1; i > index ; i--)
        {
            if(nums[i] > nums[index])
            {
                swap(i, index, nums);
                break;
            }
        }

        reverse(index + 1, nums.length - 1 , nums);
        
    }

    public void reverse(int start, int end, int [] nums)
    {
        while(start < end)
        {
            swap(start, end, nums);
            start++;
            end--;
        }
    }

    public void swap (int start, int end, int [] arr)
    {
        int t = arr[start];
        arr[start] = arr[end];
        arr[end] = t;
    }
}