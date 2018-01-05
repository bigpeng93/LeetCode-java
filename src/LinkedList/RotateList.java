package LinkedList;

public class RotateList {
    public ListNode solution(ListNode head,int k){
        if(head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy,slow = dummy;
        int i;
        for(i=0;fast!=null;i++)
            fast = fast.next;
        for (int j=i-k%i;j>0;j--)
            slow=slow.next;

        fast.next=dummy.next;
        dummy.next=slow.next;
        slow.next=null;

        return dummy.next;
    }
}
