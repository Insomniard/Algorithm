package Programmers.Level_2;

import java.util.*;
public class Level_2_sortednum {
    public static void main(String args[]){
        String s = "1 2 3 4";
        String[] str = s.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i< str.length;i++)list.add(Integer.parseInt(str[i]));
        String answer = "";
        answer += Integer.toString(Collections.min(list));
        answer += " ";
        answer += Integer.toString(Collections.max(list));
        System.out.println(answer);
    }
}
