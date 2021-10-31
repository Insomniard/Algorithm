package Programmers.Level_1;

import java.util.*;
public class Level_1_MakingStrangeString {
    public static void main(String args[]){
        String s = "a: b : c: ::    af  d   ";
        String[] str = s.split(" ", -1);
        String answer = "";
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
            String[] cutting = str[i].split("");
            for(int j=0;j< cutting.length;j++){
                if(j%2 == 0)cutting[j] = cutting[j].toUpperCase();
                else cutting[j] = cutting[j].toLowerCase();
                answer += cutting[j];
            }
            answer += " ";
        }
        if(answer.charAt(answer.length()-1) == ' ')answer = answer.substring(0,answer.length()-1);
        System.out.println(answer);
    }
}
