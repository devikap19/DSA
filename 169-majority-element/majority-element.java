class Solution {
    public int majorityElement(int[] nums) {
       
       HashMap<Integer, Integer> mpp = new HashMap<>();

       for(int num : nums)
       {
         mpp.put(num , mpp.getOrDefault(num, 0) + 1);
       }

       for(Map.Entry<Integer, Integer> entry : mpp.entrySet())
       {
            if(entry.getValue() > (nums.length / 2))
            {
                return entry.getKey();
            }
       }

       return -1;
       
    }
}