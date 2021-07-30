package fm.leetcode.longestsubstring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void when_string_is_abcabcbb_return_3() {
        String s = "abcabcbb";
        Solution solution = new Solution();

        int length = solution.lengthOfLongestSubstring(s);

        assertThat(length).isEqualTo(3);
    }

    @Test
    void when_string_is_bbbbb_return_1() {
        String s = "bbbbb";
        Solution solution = new Solution();

        int length = solution.lengthOfLongestSubstring(s);

        assertThat(length).isEqualTo(1);
    }

    @Test
    void when_string_is_empty_return_0() {
        String s = "";
        Solution solution = new Solution();

        int length = solution.lengthOfLongestSubstring(s);

        assertThat(length).isEqualTo(0);
    }

    @Test
    void when_string_is_abcdefhepolkiujnbhytgvfr_return_17() {
        String s = "abcdefhepolkiujnbhytgvfr";
        Solution solution = new Solution();

        int length = solution.lengthOfLongestSubstring(s);

        assertThat(length).isEqualTo(17);
    }

    @Test
    void when_string_is_space_return_1() {
        String s = " ";
        Solution solution = new Solution();

        int length = solution.lengthOfLongestSubstring(s);

        assertThat(length).isEqualTo(1);
    }
}

