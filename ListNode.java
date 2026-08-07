
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

 class Solutionlist {

    public static ListNode add(ListNode l1, ListNode l2, int carry) {

        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int v1 = (l1 != null) ? l1.val : 0;
        int v2 = (l2 != null) ? l2.val : 0;

        int sum = v1 + v2 + carry;
        int newCarry = sum / 10;
        int nodeValue = sum % 10;

        ListNode nextNode = add(
                (l1 != null) ? l1.next : null,
                (l2 != null) ? l2.next : null,
                newCarry);

        return new ListNode(nodeValue, nextNode);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1, l2, 0);
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // 342 = 2->4->3
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // 465 = 5->6->4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode ans = addTwoNumbers(l1, l2);

        System.out.print("Answer: ");
        printList(ans);
    }

}