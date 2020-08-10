public class _28relocate {
    public void relocate(Node head){
        if (head == null|| head.next == null){
            return;
        }
        Node mid = head;
        Node right = head.next;
        while (right.next!= null && right.next.next != null){
            mid = mid.next;
            right = right.next.next;
        }
        mid.next=right;
        mid.next=null;
        mergeLR(head,right);
    }
    public void mergeLR(Node left,Node right){
        Node next = null;
        while (left.next!= null){
            next = right.next;
            right.next = left.next;
            left.next = right.next;
            right = next;
        }
        left.next=right;
    }
}
