class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int distance = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '1') {   // start only when first 1 found

                for (int j = i + 1; j < s.length(); j++) {

                    if (s.charAt(j) == '1') {   // next 1 found
                        int temp_distance = j - i;   // correct distance
                        distance = Math.max(distance, temp_distance);
                        break;
                    }
                }
            }
        }
        return distance;


    }
}