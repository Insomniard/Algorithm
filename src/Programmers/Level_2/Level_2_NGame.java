package Programmers.Level_2;

import java.util.*;
public class Level_2_NGame {
    public static void main(String args[]){
        int n = 16;
        int t = 16;
        int m = 2;
        int p = 2;
        String answer = "";
        String str = "";
        for(int i=0;i<t*m+p;i++){
            str += conversion(n,i);
        }
        for(int i=0;i<t;i++){
            answer += String.valueOf(str.charAt(m * i + p - 1));
        }
        System.out.println();
        System.out.println(answer);
    }
    public static String conversion(int n, int value){
        StringBuilder sb = new StringBuilder();
        int current = value;
        if(value == 0)return "0";
        while (current>0){
            if(current%n<10){
                sb.append(current%n);
            }
            else{
                sb.append((char) (current%n - 10 + 'A'));
            }
            current /= n;
        }
        return sb.reverse().toString();
    }
}
