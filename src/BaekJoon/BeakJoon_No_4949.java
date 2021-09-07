package BaekJoon;

import java.util.*;
public class BeakJoon_No_4949 {
    Scanner scan = new Scanner(System.in);
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        BeakJoon_No_4949 solving = new BeakJoon_No_4949();
        solving.solve();
    }

    public void solve(){

        Stack<Character> s = new Stack<>();
        while (true){
            s.clear();
            String str = scan.nextLine();
            if(str.equals(".")){
                break;
            }
            for(int i=0;i<str.length();i++){
                char strEl = str.charAt(i);
                if(strEl == '(' || strEl == '['){
                    s.push(strEl);
                }
                else if (strEl == ')'){
                   if(!s.empty() && s.peek() == '('){
                       s.pop();
                   }
                   else s.push(strEl);
                }
                else if (strEl == ']'){
                    if(!s.empty() && s.peek() == '['){
                        s.pop();
                    }
                    else s.push(strEl);
                }
            }
            if(s.empty()) System.out.println("yes");
            else System.out.println("no");

        }
    }
}
