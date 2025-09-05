package stack;

import java.util.*;

public class NextGreaterElement {
    public List<Integer> nextLargerElement(List<Integer> arr) {
        Stack<Integer> stack = new Stack<>();
        Integer[] nums = new Integer[arr.size()];
        nums[arr.size() - 1] = -1;
        stack.push(arr.get(arr.size() - 1));
        for(int i = arr.size() - 2; i >=0 ; i--){
            while(!stack.isEmpty() && arr.get(i) >= stack.peek()){
                stack.pop();
            }
            if(!stack.isEmpty()){
                nums[i] = stack.peek();
            }else{
                nums[i] = -1;
            }
            stack.push(arr.get(i));
        }
        return List.of(nums);
    }
}
