package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPoniter {
    public RandomListNode solution(RandomListNode head){
        if(head == null)
            return head;
        RandomListNode node = head;
        Map<RandomListNode,RandomListNode> map = new HashMap<RandomListNode, RandomListNode>() ;

        while(node != null){
            map.put(node,new RandomListNode(node.label));
            node = node.next;
        }
        node = head;
        while(node !=null){
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }
        return map.get(head);
    }
}
