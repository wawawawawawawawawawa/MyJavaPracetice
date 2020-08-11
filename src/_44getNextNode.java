public class _44getNextNode {
//    获取后继节点
    public Node getNextNode(Node head){
        if (head == null){
            return head;
        }
        if (head.right!=null){
            return getLeftMost(head.right);
        }else {
            Node parent = head.parent;
            while (parent!=null && parent.left != head){
                head = parent;
                parent = head.parent;
            }
            return parent;
        }
    }

    public Node getLeftMost(Node head){
        if(head == null){
            return head;
        }
        while (head.left != null){
            head = head.left;
        }
        return head;
    }
}
