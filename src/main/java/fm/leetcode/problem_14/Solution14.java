package fm.leetcode.problem_14;

public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String str = strs[i];
            StringBuilder newPrefix = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                if (prefix.length() > j && str.charAt(j) == prefix.charAt(j)) {
                    newPrefix.append(str.charAt(j));
                } else {
                    break;
                }
            }
            prefix = newPrefix.toString();
        }

        return prefix;
    }
}
