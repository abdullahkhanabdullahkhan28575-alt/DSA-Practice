public class Reverse_Nodes_in_K_Group {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur =head;
        int group=0;
        while(cur !=null && group <k){
            cur =cur.next;
            group++;

        }
        if(group==k){
            cur =reverseKGroup(cur, k);
            while(group-- > 0){
                ListNode tmp=head.next;
                head.next=cur;
                cur=head;
                head=tmp;

            }
            head=cur;

        }
        return head;
        
    }
    
}
