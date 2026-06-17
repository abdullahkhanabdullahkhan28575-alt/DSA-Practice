public class RemoveNthNodeFromEndofList {
     public ListNode rec(ListNode head, int[] n) {
        if (head == null) {
            return null;
        }

        head.next = rec(head.next, n);
        n[0]--;
        if (n[0] == 0) {
            return head.next;
        }
        return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        return rec(head, new int[]{n});
    }
}
    

