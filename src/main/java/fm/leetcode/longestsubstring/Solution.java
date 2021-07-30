package fm.leetcode.longestsubstring;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        StringBuilder currentString = new StringBuilder(s.length());
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (currentString.indexOf(String.valueOf(chars[j])) >= 0) {
                    break;
                } else {
                    currentString.append(chars[j]);
                }
            }
            maxLength = Math.max(currentString.length(), maxLength);
            currentString = new StringBuilder();
        }
        return maxLength;
    }

}
