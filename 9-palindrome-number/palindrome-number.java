class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int duplicate = x;

        while(duplicate > 0)
        {
            int lastdigit = duplicate % 10;
            rev = rev * 10 + lastdigit;
            duplicate = duplicate / 10;
        }

        return rev == x;
    }
}