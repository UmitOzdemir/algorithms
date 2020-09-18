package leetcode;

import leetcode.utils.ListNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {
    private ReverseLinkedList reverseLinkedList;

    @BeforeEach
    public void setUp() {
        reverseLinkedList = new ReverseLinkedList();
    }

    @Test
    public void shouldReturnNullWhenLinkedListNull() {
        ListNode listNode = reverseLinkedList.reverseList(null);

        assertNull(listNode);
    }

    @Test
    public void shouldReturnItselfWhenSizeIsOne() {
        ListNode oneElement = new ListNode(1, null);
        ListNode reverseList = reverseLinkedList.reverseList(oneElement);

        assertNotNull(reverseList);
        assertEquals(oneElement, reverseList);
    }


    @Test
    public void shouldReturnReversedListWhenListHasMoreThanOneElement() {
        ListNode oneElement = new ListNode(1, new ListNode(2, new ListNode(3, null)));
        ListNode expectedReversedList = new ListNode(3, new ListNode(2, new ListNode(1, null)));

        ListNode reversedList = reverseLinkedList.reverseList(oneElement);

        assertNotNull(reversedList);
        assertEquals(expectedReversedList, reversedList);

        while(!Objects.isNull(reversedList)) {
            System.out.println(reversedList.val);
            reversedList = reversedList.next;
        }
    }


}