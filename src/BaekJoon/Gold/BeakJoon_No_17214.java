package BaekJoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BeakJoon_No_17214 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("");
        int countX = 0;
        String answer = "";
        String num = "";
        Stack<Integer> stack = new Stack<>();
        boolean flag = false;
        for(int i=0;i<s.length;i++){
            if(s[i].equals("-") && i==0){
                num+= "-";
                continue;
            }
            if(s[i].equals("x")){
                countX++;
                continue;
            }
            if(s[i].equals("-") || s[i].equals("+")){
                stack.push(Integer.parseInt(num));
                num = "";
                String x = "";
                for(int j=0;j<countX+1;j++)x+="x";

                if(s[i].equals("-") || s[i].equals("+")){
                    if((stack.peek() / (countX+1)) == 1 || (stack.peek() / (countX+1)) == -1){
                        answer += x + s[i];
                    }
                    else if(stack.peek() / (countX + 1) == 0){
                        answer = answer;
                    }
                    else answer += (stack.peek() / (countX+1)) +x + s[i];
                    stack.pop();
                }
                flag = true;
            }
            num+=s[i];
            if(flag){
                countX = 0;
            }
        }
        num = num.replaceAll("[+,-]","");
        System.out.println(num);
        if(Integer.parseInt(num)>1)answer+=num+"x"+"+W";
        else if(Integer.parseInt(num) == 1 || Integer.parseInt(num) == -1){
            answer += "x"+"+W";
        }
        else answer += "W";
        System.out.println(answer);
    }
}
