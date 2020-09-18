package leetcode;

import leetcode.utils.ListNode;

import static java.util.Objects.isNull;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (isNull(head)) {
            return null;
        }

        if(isNull(head.next)) {
            return head;
        }
        ListNode node = head;
        ListNode reversedList = null;

        while(!isNull(node)) {
            reversedList = new ListNode(node.val, reversedList);
            node = node.next;
        }
        return reversedList;
    }
}
