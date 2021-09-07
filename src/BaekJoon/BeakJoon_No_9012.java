package BaekJoon;

import java.util.*;
public class BeakJoon_No_9012 {
    Scanner scan = new Scanner(System.in);
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        BeakJoon_No_9012 solving = new BeakJoon_No_9012();
        int K = scan.nextInt();
        for(int i=0; i<K; i++) {
            String input = scan.next();
            System.out.println(solving.solve(input));
        }
    }
    public String solve(String input){
            String arr[] = new String[input.length()];
            Stack<String> s = new Stack<>();
            for(int i=0;i<input.length(); i++){
                arr = input.split("");
            }
            for(int i=0;i<arr.length;i++) {
                if(arr[i].equals("(")) {
                    s.push(arr[i]);
                }
                else if (s.empty()){
                    return "NO";
                }
                else s.pop();
            }
            if (s.empty())return "YES";
            else return "NO";
    }
}
