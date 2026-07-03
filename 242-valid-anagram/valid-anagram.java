class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }

        char [] chararray1 = s.toCharArray();
        char [] chararray2 = t.toCharArray();
        Arrays.sort(chararray1);
        Arrays.sort(chararray2);

        for(int i = 0; i < s.length(); i++)
        {
            if(chararray1[i] != chararray2[i])
            {
                return false;
            }
        }
        return true;
    }
}