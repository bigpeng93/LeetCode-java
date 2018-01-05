package LinkedList;

public class test {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};

        MakeLinkList makeLinkList = new MakeLinkList();
        ListNode head = makeLinkList.Make(nums);
/*        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode listNode = reverseLinkedList.solution(first,1,4);*/
/*        RotateList rotateList = new RotateList();
        ListNode listNode = rotateList.solution(first,2);*/
/*        RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();
        ListNode listNode = removeNthFromEnd.solution(first,1);*/
/*        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        ListNode listNode = swapNodesInPairs.solution(first);*/
        ReverseNodesInKGroup reverseNodesInKGroup = new ReverseNodesInKGroup();
        ListNode listNode = reverseNodesInKGroup.solution(head,3);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
