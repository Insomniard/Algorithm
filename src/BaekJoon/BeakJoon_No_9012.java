package BaekJoon;

import java.util.*;
public class BeakJoon_No_9012 {
    Scanner scan = new Scanner(System.in);
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        BeakJoon_No_9012 solving = new BeakJoon_No_9012();
        int K = scan.nextInt();
        for(int i=0; i<K; i++) {
            System.out.println(solving.solve());
        }
    }
    public String solve(){
            String input = scan.next();
            String arr[] = new String[input.length()];
            Stack<String> s = new Stack<>();
            for(int j=0;j<arr.length; j++){
                arr = input.split("");
            }
            for(int j=0;j<arr.length;j++) {
                if(arr[j].equals("(")) {
                    s.push(arr[j]);
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
