class Solution {
    public Boolean isPallindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        String maxStr = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPallindrome(s, i, j) &&  (j - i + 1)> maxStr.length()) {
                    maxStr = s.substring(i, j+1);
                }
            }

        }
        return maxStr;
    }
}