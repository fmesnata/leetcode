package fm.leetcode.problem_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void for_array_of_2_7_11_15_and_target_9_return_0_1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] indices = solution.twoSum(nums, target);

        assertThat(indices).containsExactlyInAnyOrder(0, 1);
    }

    @Test
    void for_array_of_3_2_4_and_target_6_return_1_2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] indices = solution.twoSum(nums, target);

        assertThat(indices).containsExactlyInAnyOrder(1, 2);
    }

    @Test
    void for_array_of_3_3_and_target_6_return_0_1() {
        int[] nums = {3, 3};
        int target = 6;
        int[] indices = solution.twoSum(nums, target);

        assertThat(indices).containsExactlyInAnyOrder(0, 1);
    }
}
