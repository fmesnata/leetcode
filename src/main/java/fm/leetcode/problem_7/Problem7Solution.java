package fm.leetcode.problem_7;

public class Problem7Solution {
    public int reverse(int x) {
        try {
            boolean isNegative = x < 0;
            StringBuilder numberAsString = new StringBuilder(String.valueOf(Math.abs(x))).reverse();
            if (isNegative) {
                numberAsString.insert(0, "-");
            }
            return Integer.parseInt(numberAsString.toString());
        } catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }
}
