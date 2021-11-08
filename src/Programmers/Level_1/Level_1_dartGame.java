package Programmers.Level_1;

import java.util.Stack;

public class Level_1_dartGame {
    public static void main(String[] args) {
        String dartResult = "1D2S#10S";
        String[] dart = dartResult.split("");
        int score = 0;
        Stack<Double> s = new Stack<>();
        Stack<String> option = new Stack<>();
        for(int i=0;i<dart.length;i++){
            if(dart[i].equals("S")){
                s.push(Double.parseDouble(dart[i-1]));
            }
            if(dart[i].equals("D")){
                s.push(Math.pow(Integer.parseInt(dart[i-1]),2));
            }
            if(dart[i].equals("T")){
                s.push(Math.pow(Integer.parseInt(dart[i-1]),3));
            }
            if(dart[i].equals("*")){
                option.push(dart[i]);
            }
            if(dart[i].equals("*")){
                option.push(dart[i]);
            }
        }
        int count = 1;
        while (!s.isEmpty()){
            if(!option.isEmpty()){
                if(s.size() == option.size()){
                    if(option.pop().equals("#")){
                        score+=(s.pop()*(-1));
                    }
                    else if(option.pop().equals("*")){
                        score += s.pop()*2*count;
                        count++;
                    }
                }
            }
            score+=s.pop();
        }

        System.out.println(s.toString());
        System.out.println(option.toString());
        System.out.println(score);
    }
}
