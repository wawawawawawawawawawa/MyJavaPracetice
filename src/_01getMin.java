import java.util.Stack;

public class _01getMin {
    private Stack<Integer> stackDate;
    private Stack<Integer> stackMin;

    public _01getMin(){
        this.stackDate = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }


    public void push(int newNum){
        if(this.stackDate.isEmpty()){
            this.stackMin.push(newNum);
        }
        if(newNum <= this.get_Min()){
            this.stackMin.push(newNum);
        }
        this.stackDate.push(newNum);
    }

    public int pop(){
        if(this.stackDate.isEmpty()){
            throw new RuntimeException("Your Stack is Empty");
        }
        int value = stackDate.pop();
        if(value == this.get_Min()){
            this.stackMin.pop();
        }
        return value;
    }

    public int get_Min(){
        if(this.stackDate.isEmpty()){
            throw new RuntimeException("Your stack is Empty");
        }
        return this.stackMin.peek();
    }

    public static void main(String[] args) {
    }
}
