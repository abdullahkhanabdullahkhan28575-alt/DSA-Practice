import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Merge_K_Sorted_Linked_Lists {
      public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> nodes=new ArrayList<>();
        for(ListNode lst:lists){
            while(lst!=null){
                nodes.add(lst.val);
                lst=lst.next;

            }
        }
        Collections.sort(nodes);
        ListNode res= new ListNode(0);
        ListNode cur =res;
        for(int node: nodes){
            cur.next=new ListNode(node);
            cur=cur.next;

        }
        return res.next;

    }
    
}
