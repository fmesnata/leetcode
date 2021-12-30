package fm.leetcode.problem_13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution13Test {
    private Solution13 solution13;

    @BeforeEach
    void setup() {
        solution13 = new Solution13();
    }

    @ParameterizedTest(name = "When input is {0} return {1}")
    @CsvSource(value = {"I, 1", "V, 5", "X, 10", "L, 50", "C, 100", "D, 500", "M, 1000"})
    void simple_digit_tests(String input, int expected) {
        int result = solution13.romanToInt(input);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when_input_is_III_return_3() {
        final String input = "III";

        int result = solution13.romanToInt(input);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void when_input_is_IV_return_4() {
        final String input = "IV";

        int result = solution13.romanToInt(input);

        assertThat(result).isEqualTo(4);
    }

    @Test
    void when_input_is_LVIII_return_58() {
        final String input = "LVIII";

        int result = solution13.romanToInt(input);

        assertThat(result).isEqualTo(58);
    }

    @Test
    void when_input_is_MCMXCIV_return_1994() {
        final String input = "MCMXCIV";

        int result = solution13.romanToInt(input);

        assertThat(result).isEqualTo(1994);
    }

}
