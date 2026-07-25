class Solution {
    public int maxProduct(int n) {
        String str = String.valueOf(n);
        int arr [] = new int[str.length()];

        for(int i = 0; i < str.length() ; i++)
        {
            arr[i] = n % 10;
            n /= 10;
        }

        Arrays.sort(arr);

        return arr[str.length() - 1] * arr[str.length() - 2];
    }
}