import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class _12RemoveMidNode {
//    删除中间或者a/b位置的节点
    public Node removeMidNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        if (head.next.next == null) {
            return head.next;
        }
        Node pre = head;
        Node cur = head.next.next;
        while (cur.next != null && cur.next.next != null) {
            pre = pre.next;
            cur = cur.next.next;
        }
        pre = pre.next;
        return head;
    }
}
