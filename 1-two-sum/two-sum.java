class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = {-1,-1};

       HashMap<Integer,Integer> mapnum = new HashMap<>();

       for(int i = 0; i< nums.length; i++)
       {
            int complement = target - nums[i];
            if(mapnum.containsKey(complement))
            {
                return new int []  {mapnum.get(complement),i};
            }
            mapnum.put(nums[i],i);

       }
       return ans;
    }
}