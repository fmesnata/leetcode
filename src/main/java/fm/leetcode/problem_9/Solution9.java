package fm.leetcode.problem_9;

public class Solution9 {
    public boolean isPalindrome(int x) {
        String initialValueAsString = String.valueOf(x);
        StringBuilder initialValue = new StringBuilder(initialValueAsString);
        String reversedValue = initialValue.reverse().toString();
        return initialValueAsString.equals(reversedValue);
    }
}
