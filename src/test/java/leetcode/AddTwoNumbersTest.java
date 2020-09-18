package leetcode;

import leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void testOneDigit() {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);

        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        assertNotNull(result);
        assertEquals(7, result.val);
    }

    @Test
    public void testTwoDigit() {
        ListNode l1 = new ListNode(2, new ListNode(1));
        ListNode l2 = new ListNode(5, new ListNode(4));

        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        assertNotNull(result);
        assertEquals(7, result.val);
        assertEquals(5, result.next.val);
        assertNull(result.next.next);

    }

    @Test
    public void testAditionalDigit() {
        ListNode l1 = new ListNode(7);
        ListNode l2 = new ListNode(5);

        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        assertNotNull(result);
        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
        assertNull(result.next.next);
    }

    @Test
    public void testDiffLenghtDigit() {
        ListNode l1 = new ListNode(2, new ListNode(4));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(5, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    public void testNormalCase() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
        assertNull(result.next.next.next);
    }

}