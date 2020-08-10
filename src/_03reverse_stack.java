import java.util.Stack;

public class _03reverse_stack {
    public static int getAndMoveLastElement(Stack<Integer>stack){
        int result = stack.pop();
        if(stack.isEmpty()) {
            return result;
        }else {
            int last = getAndMoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    public static void reverse(Stack<Integer>stack){
        if(stack.isEmpty()){
            return;
        }
        int i = getAndMoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        reverse(stack);
        System.out.println(stack.pop());
    }
}
