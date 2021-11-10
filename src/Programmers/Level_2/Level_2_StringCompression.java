package Programmers.Level_2;

import java.util.*;
public class Level_2_StringCompression {
    public static void main(String args[]) {
        String s = "aabbaccc";
        Level_2_StringCompression getAnswer = new Level_2_StringCompression();
        System.out.println(getAnswer.solution(s));
    }
    public int solution(String s){
        int answer = s.length();
        for(int i=1;i<=s.length()/2;i++){
            int size = comp(s,i).length();
            answer = Math.min(answer,size);
        }
        return answer;
    }
    private static String comp(String s, int i){
        int count = 1;
        String patten = "";
        String compression ="";
        for(int j=0;j<=s.length()+i;j+=i){
            String nowstr = "";
            if(j>=s.length())nowstr = "";
            else if(j+i > s.length())nowstr = s.substring(j);
            else nowstr = s.substring(j,j+i);
            if(j==0){
                patten = nowstr;
                continue;
            }
            if(nowstr.equals(patten))count++;
            else if(count>=2){
                compression+=count+patten;
                count=1;
            }
            else{
                compression += patten;
            }
            patten = nowstr;
        }
        return compression;
    }
}
