class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        char result = letters[0]; // default wrap-around case

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] > target) {
                result = letters[mid]; // possible answer
                right = mid - 1;       // try to find smaller valid char
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
}