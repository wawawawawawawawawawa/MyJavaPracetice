import java.util.LinkedList;
import java.util.Queue;

public class _31serialBypRE {
//    二叉树的序列化和反序列化
    public String serialByPre(Node head){
        if (head == null){
            return "#!";
        }
        String res = head.value + "!";
        res += serialByPre(head.left);
        res += serialByPre(head.right);
        return res;
    }

//    反序列化
    public Node reconStringByPre(String preStr){
        String[]values = preStr.split("!");
        Queue<String>queue = new LinkedList<String>();
        for (int i=0;i< values.length;i++){
            queue.offer(values[i]);
        }
        return reconStringPreOrder(queue);
    }

    public Node reconStringPreOrder(Queue<String>queue){
        String value = queue.poll();
        if (value.equals("#")){
            return null;
        }
        Node head = new Node(Integer.valueOf(value));
        head.left = reconStringPreOrder(queue);
        head.right = reconStringPreOrder(queue);
        return head;
    }
}


