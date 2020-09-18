package leetcode;

import leetcode.utils.ListNode;

import java.util.Objects;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (Objects.isNull(head) || Objects.isNull(head.next)) {
            return true;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (!Objects.isNull(fast) && !Objects.isNull(fast.next)) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if(fast != null) {
            slow = slow.next;
        }

        ListNode reversedSlow = null;
        while(slow !=null) {
            reversedSlow = new ListNode(slow.val, reversedSlow);
            slow = slow.next;
        }

        while(reversedSlow != null && head != null) {
            if (reversedSlow.val != head.val) {
                return false;
            }
            reversedSlow = reversedSlow.next;
            head = head.next;
        }
        return true;
    }
}
