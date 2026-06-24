class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int index = 0;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                arr[index] = nums[i];
                index++;
            }
        }

        for (int i = 0; i < count; i++) {
            arr[index] = 0;
            index++;
        }
        for (int i = 0; i < arr.length; i++) {
          nums[i] = arr[i];
        }
    }
}