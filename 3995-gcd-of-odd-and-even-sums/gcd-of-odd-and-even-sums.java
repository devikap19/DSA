class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd = 0;
        int sumeven = 0;

        sumodd = (int)Math.pow(n,2);
        sumeven = n * (n + 1);

        return findGcd(sumodd,sumeven);

         
    }
    public static int findGcd(int a, int b) {
        while(a > 0 && b > 0) {
            
            if(a > b) {
                a = a % b;
            }
            
            else {
               
                b = b % a;
            }
        }
        
        if(a == 0) {
            return b;
        }
       
        return a;
    }
}