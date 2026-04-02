class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int index = 0;

        for(int i : nums)
        {
            if(!seen.contains(i))
            {
                seen.add(i);
                nums[index] = i;
                index++;
            }
        }
        return index;
 
    }
}