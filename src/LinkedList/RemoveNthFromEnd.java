package LinkedList;

public class RemoveNthFromEnd {
    public ListNode solution(ListNode head,int k){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy,last=dummy;

        for(int i = 0; i <= k ;i++)
            first = first.next;
        while(first != null){
            first = first.next;
            last = last.next;
        }
        last.next = last.next.next;
        return dummy.next;
    }
}
