public class _19noLoop {
//    返回无环链表相交点
    public Node noLoop(Node head1,Node head2){
        if(head1.next == null||head2.next == null){
            return null;
        }
        Node cur1 = head1.next;
        Node cur2 = head2.next;
        int n = 0;
        while (cur1.next != null){
            n++;
            cur1 = cur1.next;
        }
        while (cur2.next != cur2){
            n--;
            cur2 = cur2.next;
        }
        cur1 = n>0?head1:head2;
        cur2 = cur1 == head1? head2:head1;
        n = Math.abs(n);
        while (n!=0){
            n--;
            cur1=cur1.next;
        }
        while (cur1!=cur2){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }
}
