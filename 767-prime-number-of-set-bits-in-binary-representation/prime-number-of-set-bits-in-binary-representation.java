import java.util.*;
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int primeCount = 0;

        for (int i = left; i <= right; i++) {

            int count = Integer.bitCount(i);   // counts set bits directly

            if (isPrime(count)) {
                primeCount++;
            }
        }
        return primeCount;
    }

    public boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
}