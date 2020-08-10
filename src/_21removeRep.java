import java.util.HashSet;

public class _21removeRep {
    public void removeRep(Node head){
        if(head == null){
            return;
        }
        HashSet<Integer>set = new HashSet<Integer>();
        Node pre = head;
        Node cur = head.next;
        while (cur != null){
            if(set.contains(cur.value)){
                pre.next = cur.next;
            }else {
                set.add(cur.value);
            }
            cur = cur.next;
        }
    }
}
