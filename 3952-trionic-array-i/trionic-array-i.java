class Solution {
    public boolean isTrionic(int[] nums) {
         int n = nums.length;
        if (n < 4) return false; // minimum needed for 3 segments

        int i = 0;

        // 1️⃣ strictly increasing
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        int p = i;
        if (p == 0) return false; // must increase at least once

        // 2️⃣ strictly decreasing
        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }
        int q = i;
        if (q == p || q == n - 1) return false; // must decrease and leave room

        // 3️⃣ strictly increasing
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        // must reach end
        return i == n - 1;
    }
    }
