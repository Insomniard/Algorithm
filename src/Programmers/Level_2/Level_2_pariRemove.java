package Programmers.Level_2;

import java.util.Stack;

public class Level_2_pariRemove {
    public static void main(String[] args) {
        String s = "aab";
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)){
                stack.pop();
                continue;
            }
            stack.push(s.charAt(i));
        }
        if(stack.isEmpty()){
            answer = 1;
        }
        else{
            answer = 0;
        }
        System.out.println(stack.toString());
    }
}

