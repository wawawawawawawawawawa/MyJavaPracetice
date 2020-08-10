import java.util.Stack;

public class _02TwoStacksQueue {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public _02TwoStacksQueue(){
        stackPush = new Stack<Integer>();
        stackPop = new Stack<Integer>();
    }

    public void add(int newNumber){
        stackPush.push(newNumber);
    }

    public int poll(){
        if(stackPush.isEmpty() &&stackPop.isEmpty()){
            throw new RuntimeException("This Queue is Empty");
        }else if(stackPop.isEmpty()){
            while (!stackPush.isEmpty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek(){
        if(stackPush.isEmpty() &&stackPop.isEmpty()){
            throw new RuntimeException("This Queue is Empty");
        }else if(stackPop.isEmpty()){
            while (!stackPush.isEmpty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }
}
