public class _15josephusKill {
    public Node josephsKill(Node head,int m){
        if(head == null || head.next == head || m<1){
            return head;
        }
        Node last = head;
        while (last.next != head){
            last = last.next;
        }
        int n = 0;
        while (head != last){
            if(++n ==m){
                last.next = head.next;
                n=0;
            }else {
                last = last.next;
            }
            head = last.next;
        }
        return head;
    }
}
