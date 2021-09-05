package fm.leetcode.problem_9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution9Test {

    private Solution9 solution;

    @BeforeEach
    void setup() {
        solution = new Solution9();
    }

    @Test
    void when_input_is_121_return_true() {
        boolean result = solution.isPalindrome(121);

        assertThat(result).isTrue();
    }

    @Test
    void when_input_is_minus121_return_false() {
        boolean result = solution.isPalindrome(-121);

        assertThat(result).isFalse();
    }

    @Test
    void when_input_is_10_return_false() {
        boolean result = solution.isPalindrome(10);

        assertThat(result).isFalse();
    }
}
