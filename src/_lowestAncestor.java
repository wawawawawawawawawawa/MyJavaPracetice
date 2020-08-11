public class _lowestAncestor {
    public Node lowestAncestor(Node head,Node o1,Node o2){
//        寻找两个节点的最近祖先节点
        if (head == null || head == o1 || head == o2){
            return head;
        }
        Node left = lowestAncestor(head.left,o1,o2);
        Node right= lowestAncestor(head.right,o1,o2);
        if (left!=null && right!=null){
            return head;
        }
        return left!=null?left:right;
    }
}
