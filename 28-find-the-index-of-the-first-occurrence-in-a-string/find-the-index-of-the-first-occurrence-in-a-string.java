class Solution {
    public int strStr(String haystack, String needle) {
         if (needle.length() == 0) return 0;
        int strLength = haystack.length();
        if(needle.length()>strLength){
            return -1;
        }
        for (int i = 0; i <= strLength-needle.length();i++) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {

                j++;
            }
            if (j == needle.length()) {
                return i;
            }

        }
        return -1;
    }
}
