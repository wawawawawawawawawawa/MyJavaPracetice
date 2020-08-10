import java.util.HashMap;
//复制一个包含随机指针的链表
public class _04copyListWithRand {
    public Node copyListRand(Node head){
        HashMap<Node,Node>map = new HashMap<Node,Node>();
        Node cur = head;
        while (cur != null){
            map.put(cur,new Node(cur.value));
            cur = cur.next;
        }
        cur = head;
        while (cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).rand = map.get(cur.rand);
            cur = cur.next;
        }
        return map.get(head);
    }
}

