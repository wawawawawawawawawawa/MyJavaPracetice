import java.util.LinkedList;
import java.util.Queue;

public class _37printLevel {
//    按层打印并打印层号
    public void printLevel(Node head){
        if (head == null){
            return;
        }
        Queue<Node>queue = new LinkedList<Node>();
        int level = 1;
        Node last = head;
        Node nLast = null;
        queue.offer(head);
        System.out.print("level"+(level++)+"");
        while (!queue.isEmpty()){
            head = queue.poll();
            System.out.print(head.value+"");
            if (head.left != null){
                queue.offer(head.left);
                nLast = head.left;
            }
            if (head.right != null){
                queue.offer(head.right);
                nLast = head.right;
            }
            if (head == last && !queue.isEmpty()){
                System.out.print("\nlevel"+(level++)+"");
                last = nLast;
            }
        }
        System.out.println();
    }
}
