public class _24selectionSort {
//    链表的选择排序
    public Node selectionSort(Node head){
        Node tail = null;
        Node cur = head;
        Node small = null;
        Node smallPre = null;
        while (cur != null){
            small = cur;
            smallPre = getSmallPre(cur);
            if(smallPre != null){
                small = smallPre.next;
                smallPre.next = small.next;
            }
            cur = cur == small ? cur.next : cur;
            if(tail == null){
                head = small;
            }else {
                tail.next = small;
            }
            tail = small;
        }
        return head;
    }


    public Node getSmallPre(Node head){
        Node smallPre = null;
        Node small = head;
        Node pre = head;
        Node cur = head.next;
        while (cur != null){
            if(small.value > cur.value){
                smallPre = pre;
                small = cur;
            }
            pre = cur;
            cur = cur.next;
        }
        return head;
    }
}
