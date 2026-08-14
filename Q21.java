public class Q21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode t1 = list1;
        ListNode t2 = list2;

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (t1 != null && t2 != null) {

            if (t1.val <= t2.val) {
                tail.next = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                t2 = t2.next;
            }

            tail = tail.next;
        }

        if (t1 != null) {
            tail.next = t1;
        }

        if (t2 != null) {
            tail.next = t2;
        }

        return dummy.next;
    }
}
