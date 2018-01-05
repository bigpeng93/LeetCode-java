package LinkedList;

public class ReverseLinkedList {
    public ListNode solution(ListNode head, int m, int n){
        if(head == null) return null;
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode pre = first;
        for(int i =0;i<m-1;i++)
            pre = pre.next;
        ListNode start = pre.next;
        ListNode then = start.next;

        for(int i = 0; i < n-m;i++){
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }
        return first.next;
    }
}
