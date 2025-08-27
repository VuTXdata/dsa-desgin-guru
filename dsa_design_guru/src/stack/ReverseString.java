package stack;

import java.util.Stack;

public class ReverseString {
    public String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        String str = "Hello, World!";
        String reversedStr = rs.reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
}
