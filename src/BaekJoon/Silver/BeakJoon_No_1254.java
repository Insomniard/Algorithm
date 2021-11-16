package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeakJoon_No_1254 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int answer = 0;

        for(int i=0;i<s.length();i++){
            if(isPalindrome(s.substring(i))){
                answer = i + s.length();
                break;
            }
            answer = s.length() * 2;
        }
        System.out.println(answer);
    }
    private static boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        if(s.equals(sb.reverse().toString())){
            return true;
        }
        return false;
    }

}
