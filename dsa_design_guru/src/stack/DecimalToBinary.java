package stack;

import java.util.Stack;

public class DecimalToBinary {
    public static String decimalToBinary(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        while (num > 0) {
            stack.push(num % 2);
            num = num / 2;
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
//        Integer.toBinaryString(10);
    }
}
