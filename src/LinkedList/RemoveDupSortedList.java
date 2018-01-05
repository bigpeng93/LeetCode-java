package LinkedList;

public class RemoveDupSortedList {
    public ListNode solution(ListNode head){
        if(head == null) return null;
        ListNode prev = head;
        while(prev != null){
            if(prev.next == null)
                break;
            if(prev.val == prev.next.val)
                prev.next = prev.next.next;
            else
                prev = prev.next;
        }
        return head;
    }
}
