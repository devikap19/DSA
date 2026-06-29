class Solution {
    public String largestOddNumber(String num) {
        int start = 0;
        int end = -1;
        for(int i = num.length() - 1; i >= 0; i--)
        {
            if((num.charAt(i) - '0') % 2 == 1)
            {
                end = i;
                break;
            }
        }

        while(start <= end && num.charAt(start) == ' ')
        {
            start++;
        }

        return num.substring(start, end+1);


    }
}