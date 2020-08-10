public class _26LoopinsertNode {
    public Node loopInsertNode(Node head,int num){
//        向有序环形单链表插入节点
        Node node = new Node(num);
        if (head == null){
            node.next = node;
            return node;
        }
        Node pre = head;
        Node cur = head.next;
        while (cur != head){
            if(pre.value<= num && cur.value >= num){
                break;
            }
            pre = cur;
            cur = cur.next;
        }
        pre.next = node;
        node.next = cur;
        return head.value < num? head: node;
    }
}
