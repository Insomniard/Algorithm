package Programmers.Level_2;
import java.util.*;
public class Level_2_ParenthesisConversion {
    public static void main(String args[]) {
        String s = "()))((()";
        String answer = "";
        System.out.println(check(s));
        if (check(s) || s.equals("")) answer = s;
        else {
            answer = changeString(s);
        }
        System.out.println(answer);
    }

    public static int getPos(String s){
        int open = 0;
        int close = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(')
                open++;
            else
                close++;
            if(open == close)
                return i+1;

        }
        return -1;
    }
    public static String changeString(String s) {
        if(s.length() == 0)return "";
        int pos = getPos(s);
        String u = s.substring(0,pos);
        String v = s.substring(pos);
        if(check(u))return u + changeString(v);
        else{
            String temp = "(" + changeString(v) + ")";
            u = u.substring(1, u.length()-1);
            u = reverse(u);
            return temp + u;
        }
    }

    public static String reverse(String s){
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(')
                sb.append(")");
            else
                sb.append("(");
        }
        return sb.toString();
    }

    public static boolean check(String st) {
        Stack<String> s = new Stack<>();
        String[] str = st.split("");
        s.push(str[0]);
        if (str[0].equals(")")) return false;
        else {
            for (int i = 1; i < str.length; i++) {
                if (str[i].equals("(")) s.push(str[i]);
                else if (s.isEmpty()) s.push(str[i]);
                else s.pop();
            }
            if (s.isEmpty()) return true;
            else return false;
        }
    }

}
