import java.util.LinkedList;
import java.util.Queue;

public class _23convert {
//    转换搜索二叉树为双向链表
    public Node convert(Node head){
        Queue<Node>queue = new LinkedList<Node>();
        inOrderToQueue(head,queue);
        head = queue.poll();
        Node pre = head;
        pre.left = null;
        Node cur = null;
        while (!queue.isEmpty()){
            cur = queue.poll();
            pre.right = cur;
            cur.left= pre;
            pre = cur;
        }
        pre.right = null;
        return head;
    }

    public void inOrderToQueue(Node head,Queue<Node>queue){
        if (head == null){
            return;
        }
        inOrderToQueue(head.left,queue);
        queue.offer(head);
        inOrderToQueue(head.right,queue);
    }
}

