package fm.leetcode.problem_7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem7SolutionTest {

    private Problem7Solution solution;

    @BeforeEach
    void setup() {
        solution = new Problem7Solution();
    }

    @Test
    void when_input_is_123_return_321() {
        final int input = 123;

        int result = solution.reverse(input);

        assertThat(result).isEqualTo(321);
    }

    @Test
    void when_input_is_minus123_return_minus321() {
        final int input = -123;

        int result = solution.reverse(input);

        assertThat(result).isEqualTo(-321);
    }

    @Test
    void when_input_is_120_return_21() {
        final int input = 120;

        int result = solution.reverse(input);

        assertThat(result).isEqualTo(21);
    }

    @Test
    void when_input_is_0_return_0() {
        final int input = 0;

        int result = solution.reverse(input);

        assertThat(result).isEqualTo(0);
    }

    @Test
    void when_input_is_1999999999_return_0() {
        final int input = 1999999999;

        int result = solution.reverse(input);

        assertThat(result).isEqualTo(0);
    }

    @Test
    void when_input_is_minus1999999999_return_0() {
        final int input = -1999999999;

        int result = solution.reverse(input);

        assertThat(result).isEqualTo(0);
    }

}
