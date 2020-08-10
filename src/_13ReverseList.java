public class _13ReverseList {
    public Node reversedList(Node head){
        Node pre = null;
        Node next = null;
        while (head != null){
            next = head.next;
            head.next= pre;
            pre=head;
            head=next;
        }
        return pre;
    }

    public DoubleNode reversedDoubleNodeList(DoubleNode head){
        DoubleNode pre=null;
        DoubleNode next = null;
        while (head != null){
            next = head.next;
            head.next= pre;
            pre= head;
            head = next;
        }
        return pre;
    }
}
