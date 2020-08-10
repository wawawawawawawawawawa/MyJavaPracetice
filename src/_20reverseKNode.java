import java.util.Stack;

public class _20reverseKNode {
    public Node reverseKNode(Node head,int K){
        if(K<2){
            return head;
        }
        Stack<Node>stack = new Stack<Node>();
        Node cur = head;
        Node newHead = head;
        Node pre = null;
        Node next = null;
        while (cur != null){
            next = cur.next;
            stack.push(cur);
            if (stack.size() == K){
                pre = resign(stack,pre,next);
                newHead = newHead == head ? cur:newHead;
            }
            cur = next;
        }
        return newHead;
    }

    public Node resign(Stack<Node>stack,Node left,Node right){
        Node cur = stack.pop();
        if(left != null){
            cur = left.next;
        }
        Node next = null;
        while (!stack.isEmpty()){
            next = stack.pop();
            cur.next = next;
            cur = next;
        }
        cur.next = right;
        return cur;
    }
}
