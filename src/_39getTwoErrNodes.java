import java.util.Stack;

public class _39getTwoErrNodes {
//    获取搜索二叉树中两个错误的节点,搜索二叉树的中序遍历为升序
    public Node[] getTwoErrNodes(Node head){
        Node[] errs = new Node[2];
        if (head == null){
            return errs;
        }
        Stack<Node>stack = new Stack<Node>();
        Node pre = null;
        while (!stack.isEmpty() || head != null){
            if (head != null){
                stack.push(head);
                head = head.left;
            }else {
                head = stack.pop();
                if (pre != null && pre.value> head.value){
                    errs[0] = errs[0] == null? pre:errs[0];
                    errs[1] = head;
                }
                pre = head;
                head = head.right;
            }
        }
        return errs;
    }
}
