package fm.leetcode.problem_14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution14Test {

    private Solution14 solution14;

    @BeforeEach
    void setup() {
        solution14 = new Solution14();
    }

    @Test
    void when_input_is_flower_flow_flight_return_fl() {
        String[] strs = {"flower", "flow", "flight"};

        String prefix = solution14.longestCommonPrefix(strs);

        assertThat(prefix).isEqualTo("fl");
    }

    @Test
    void when_input_is_background_backyard_backer_backdoor_return_fl() {
        String[] strs = {"background", "backyard", "backer", "backdoor"};

        String prefix = solution14.longestCommonPrefix(strs);

        assertThat(prefix).isEqualTo("back");
    }

    @Test
    void when_input_is_yellow_green_grey_return_empty_string() {
        String[] strs = {"yellow", "green", "grey"};

        String prefix = solution14.longestCommonPrefix(strs);

        assertThat(prefix).isEqualTo("");
    }

}
