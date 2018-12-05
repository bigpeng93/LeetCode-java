package StackAndQueue.ValidParentheses;

import java.util.Stack;

public class Solution {
    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        char[] chr = str.toCharArray();
        for (int c :chr){
            if (c == '('){
                stack.push(')');
            }else if (c == '{'){
                stack.push('}');
            }else if (c == '['){
                stack.push(']');
            }else if (stack.empty() || stack.pop() != c){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = new String("({}[})");
        System.out.println(isValid(str));
    }
}
