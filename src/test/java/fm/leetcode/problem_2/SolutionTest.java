package fm.leetcode.problem_2;

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
    void given_2_4_3_and_5_6_4_return_8_0_7() {
        ListNode list1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = solution.addTwoNumbers(list1, list2);

        assertThat(result.val).isEqualTo(7);
        assertThat(result.next.val).isEqualTo(0);
        assertThat(result.next.next.val).isEqualTo(8);
    }

    @Test
    void given_0_and_0_return_0() {
        ListNode list1 = new ListNode(0);
        ListNode list2 = new ListNode(0);

        ListNode result = solution.addTwoNumbers(list1, list2);

        assertThat(result.val).isEqualTo(0);
    }

    @Test
    void given_9_9_9_9_9_9_9_and_9_9_9_9_return_8_9_9_9_0_0_0_1() {
        ListNode list1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode list2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        ListNode result = solution.addTwoNumbers(list1, list2);

        assertThat(result.val).isEqualTo(8);
        assertThat(result.next.val).isEqualTo(9);
        assertThat(result.next.next.val).isEqualTo(9);
        assertThat(result.next.next.next.val).isEqualTo(9);
        assertThat(result.next.next.next.next.val).isEqualTo(0);
        assertThat(result.next.next.next.next.next.val).isEqualTo(0);
        assertThat(result.next.next.next.next.next.next.val).isEqualTo(0);
        assertThat(result.next.next.next.next.next.next.next.val).isEqualTo(1);
    }

}
