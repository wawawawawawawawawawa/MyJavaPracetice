public class _11RemoveLastKthNode {
//    删除倒数第Kth个节点
    public Node removeLastKthNode(Node head,int lastKth){
        if(head == null && lastKth <1){
            return head;
        }
        Node cur = head;
        while (cur != null){
            lastKth--;
            cur = cur.next;
        }
        if(lastKth == 0){
            return head;
        }
        if(lastKth < 0){
            cur = head;
            while (++lastKth != 0){
                cur=cur.next;
            }
            cur.next=cur.next.next;
        }
        return head;
    }
}
