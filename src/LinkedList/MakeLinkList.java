package LinkedList;

public class MakeLinkList {
    public ListNode Make(int[] nums){
        if(nums.length <=0 || nums == null)
            return null;
        ListNode prev = new ListNode(0);
        ListNode first = prev;
        for(int i = 0;i<nums.length;i++){
            ListNode cvr = new ListNode(nums[i]);
            prev.next = cvr;
            prev = prev.next;
        }
        return first.next;
    }
}
