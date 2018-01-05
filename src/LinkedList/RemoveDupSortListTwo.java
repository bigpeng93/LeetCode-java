package LinkedList;

public class RemoveDupSortListTwo {
    public ListNode deleteDuplicates(ListNode head){
        if(head == null || head.next==null)
            return head;
        if(head.next != null && head.val != head.next.val){
            head.next = deleteDuplicates(head.next);
            return head;
        }else{
            while (head.next != null && head.val == head.next.val)
                head = head.next;
            return deleteDuplicates(head.next);
        }
    }
}
