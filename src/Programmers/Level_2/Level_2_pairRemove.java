package Programmers.Level_2;
import java.util.*;
public class Level_2_pairRemove {
    public static void main(String args[]){
        String s = "baabaa";
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && stack.peek() == s.charAt(i))stack.pop();
            else stack.push(s.charAt(i));
        }
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == c)stack.pop();
            else stack.push(c);
        }
        answer = stack.isEmpty() ? 1 : 0;
        System.out.println(answer);

    }
}
