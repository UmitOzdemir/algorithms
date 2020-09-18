package leetcode;

import leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {
    private PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

    @Test
    public void shouldReturnFalseWhenListNull() {
        boolean result = palindromeLinkedList.isPalindrome(null);

        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenHasOneElement() {
        ListNode node = new ListNode(1, null);
        boolean result = palindromeLinkedList.isPalindrome(null);

        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenHasTwoElements() {
        ListNode node = new ListNode(1, new ListNode(2, null));
        boolean result = palindromeLinkedList.isPalindrome(node);

        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenNotPalindrome() {
        ListNode node = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(1, null))));
        boolean result = palindromeLinkedList.isPalindrome(node);

        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenPalindromeWithOdd() {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1, null)))));
        boolean result = palindromeLinkedList.isPalindrome(node);

        assertTrue(result);
    }


    @Test
    public void shouldReturnFalseWhenNotPalindromeList() {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(2, null)))));
        boolean result = palindromeLinkedList.isPalindrome(node);

        assertFalse(result);
    }

}