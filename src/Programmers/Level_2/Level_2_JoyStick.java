package Programmers.Level_2;

import java.util.*;
public class Level_2_JoyStick {
    public static void main(String args[]){
        String name = "JEROEN";
        int move = name.length()-1;
        int answer = 0;
        for(int i=0;i<name.length();i++){
            char c = name.charAt(i);
            answer += Math.min(c-'A', 'Z'-c+1);
            int next = i+1;
            while (next<name.length() && name.charAt(next) == 'A')
                next++;
            move = Math.min(move,i+name.length()-next+i);
        }
        answer+=move;
        System.out.println(answer);
    }
}
