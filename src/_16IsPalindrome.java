import java.util.Stack;

public class _16IsPalindrome {
    public Boolean isPalindrome(Node head){
        Stack<Node>stack = new Stack<Node>();
        Node cur = head;
        while (cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        while (head != null){
            if(head.value != stack.pop().value){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
