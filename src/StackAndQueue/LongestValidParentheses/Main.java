package StackAndQueue.LongestValidParentheses;

import java.util.Stack;

public class Main {
    public static int longestValidParentheses(String str){
        char[] chr = str.toCharArray();
        int max = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0;i<chr.length;i++){
            if (chr[i] == ')' && !stack.isEmpty() && str.charAt(stack.peek()) == '('){
                stack.pop();
                max = Math.max(max,i-(stack.isEmpty()?-1:stack.peek()));
            }else {
                stack.push(i);
            }
        }
        return  max;
    }

    public static void main(String[] args) {
        String str = new String(")()()(");
        System.out.println(longestValidParentheses(str));
    }
}
