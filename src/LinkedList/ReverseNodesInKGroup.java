package LinkedList;

public class ReverseNodesInKGroup {
    public ListNode solution(ListNode head, int k){
        if(head == null || head.next == null || k<2)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy,tail = dummy,temp;
        while(true){
            int count = k;
            while(count > 0 && tail!= null){
                tail = tail.next;
                count--;
            }
            if(tail == null)
                break;
            head = prev.next;
            while(prev.next!=tail){
                temp = prev.next;
                prev.next = temp.next;
                temp.next = tail.next;
                tail.next = temp;
            }
            tail = head;
            prev = head;
        }
        return dummy.next;
    }
}
