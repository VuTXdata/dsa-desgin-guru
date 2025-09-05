package stack;

import java.util.Stack;

public class SortingAStack {
    public static Stack<Integer> sortStack(Stack<Integer> input) {
        if(input.size() == 1){
            return input;
        }
        Stack<Integer> tmpStack = new Stack<Integer>();
        while(!input.isEmpty()){
            if(tmpStack.isEmpty()){
                tmpStack.push(input.pop());
            }
            if(input.peek() >= tmpStack.peek()){
                tmpStack.push(input.pop());
            }else{
                int tmp = input.pop();
                while(!tmpStack.isEmpty() && tmp < tmpStack.peek()){
                    input.push(tmpStack.pop());
                }
                tmpStack.push(tmp);
            }
        }
        return tmpStack;
}
}
