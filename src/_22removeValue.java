public class _22removeValue {
    public Node removeValue(Node head,int num){
        while (head!=null){
            if (head.value != num){
                break;
            }else {
                head = head.next;
            }
        }
        Node pre = head;
        Node cur = head;
        while (cur != null){
            if(cur.value == num){
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
