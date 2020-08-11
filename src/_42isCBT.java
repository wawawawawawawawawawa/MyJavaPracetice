import java.util.LinkedList;
import java.util.Queue;

public class _42isCBT {
//    判断一棵树是不是完全二叉树
    public boolean isCBT(Node head){
        if (head == null){
            return true;
        }
        Queue<Node> queue = new LinkedList<Node>();
        boolean leaf = true;
        Node l = null;
        Node r = null;
        queue.offer(head);
        while (!queue.isEmpty()){
            head = queue.poll();
            l = head.left;
            r = head.right;
            if ((leaf&&(l!=null||r!=null)) || (l==null && r!=null)){
                return false;
            }
//            这里如果r=null的话，leaf就为ture，并且后续应该都是叶子节点，不应该有左右孩子
            if (l != null){
                queue.offer(l);
            }
            if (r != null){
                queue.offer(r);
            }else {
                leaf = true;
            }
        }
        return true;
    }
}
