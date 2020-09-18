package leetcode;

import leetcode.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1Next = l1;
        ListNode l2Next = l2;
        ListNode result = null;
        List<ListNode> resultItems = new ArrayList<>();
        int additionalValue = 0;

        while (l1Next != null || l2Next != null || additionalValue == 1) {
            int l1Val = 0;
            int l2Val = 0;
            if (l1Next != null) {
                l1Val = l1Next.val;
            }

            if (l2Next != null) {
                l2Val = l2Next.val;
            }

            int value = l1Val + l2Val + additionalValue;
            if (value > 9) {
                value = value % 10;
                additionalValue = 1;
            } else {
                additionalValue = 0;
            }

            resultItems.add(new ListNode(value));
            if (l1Next != null) {
                l1Next = l1Next.next;
            }

            if (l2Next != null) {
                l2Next = l2Next.next;
            }
        }

        for (int i = resultItems.size() - 1; i >= 0; i--) {
            if (result == null) {
                result = resultItems.get(i);
            } else {
                result = new ListNode(resultItems.get(i).val, result);
            }
        }

        return result;
    }
}
