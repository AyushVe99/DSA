import java.util.*;

class Solution {

    public boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;  
        }

        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length]; 
        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) continue; 

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (!visited[j] && checkAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            result.add(group);
        }
        return result;
    }
}
