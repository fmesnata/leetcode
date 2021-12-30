package fm.leetcode.problem_13;

public class Solution13 {
    public int romanToInt(String input) {
        int previousValue = 0;
        int total = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            int num = RomanNumeral.valueOf(String.valueOf(input.charAt(i))).num;
            if (num >= previousValue) {
                total+= num;
            } else {
                total-= num;
            }
            previousValue = num;
        }
        return total;
    }

    enum RomanNumeral {
        I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

        public final int num;

        RomanNumeral(int num) {
            this.num = num;
        }
    }
}
