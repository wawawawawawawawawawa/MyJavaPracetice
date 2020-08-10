import java.util.Stack;

public class _29PreInPosOrderRecur {
    public void preOrderRecur(Node head){
//        递归二叉树前序遍历
        if (head == null){
            return;
        }
        System.out.print(head.value+"");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }

    public void inOrderRecur(Node head){
//        递归二叉树中序遍历
        if (head == null){
            return;
        }
        inOrderRecur(head.left);
        System.out.print(head.value+"");
        inOrderRecur(head.right);
    }

    public void  PosOrderRecur(Node head){
//        递归二叉树后序遍历
        if (head == null){
            return;
        }
        PosOrderRecur(head.left);
        PosOrderRecur(head.right);
        System.out.print(head.value+"");
    }

    public void preOrderNoRecur(Node head){
//        非递归二叉树前序遍历
        if (head != null){
            Stack<Node>stack = new Stack<Node>();
            stack.add(head);
            while (!stack.isEmpty()){
                head = stack.pop();
                System.out.println(head.value+"");
                if (head.right != null){
                    stack.push(head.right);
                }
                if (head.left != null){
                    stack.push(head.left);
                }
            }
            System.out.println();
        }
    }

    public void inOrderNoRecur(Node head){
//        非递归二叉树中序遍历
        if (head != null){
            Stack<Node>stack = new Stack<Node>();
            while (!stack.isEmpty() || head != null){
                if (head != null){
                    stack.push(head);
                    head = head.left;
                }else {
                    head = stack.pop();
                    System.out.println(head.value+"");
                    head = head.right;
                }
            }
        }
    }

    public void posOrderNoRecur(Node head){
//        非递归二叉树后序遍历
        if (head!=null){
            Stack<Node>s1 = new Stack<Node>();
            Stack<Node>s2 = new Stack<Node>();
            s1.push(head);
            while (!s1.isEmpty()){
                head =s1.pop();
                s2.push(head);
                if (head.left != null){
                    s1.push(head.left);
                }
                if (head.right != null){
                    s1.push(head.right);
                }
            }
            while (!s2.isEmpty()){
                System.out.print(s2.pop().value+"");
            }
        }
        System.out.println();
    }
}
