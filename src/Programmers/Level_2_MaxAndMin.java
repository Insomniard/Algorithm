package Programmers;
import java.util.*;
public class Level_2_MaxAndMin {
    public static void main(String args[]) {
        String s = "1 2 3 4";
        System.out.println(solution(s));

    }

    public static String solution(String s) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(s.contains(" ")){
            String[] str = s.split(" ");
            for(int i=0;i<str.length;i++){
                list.add(Integer.parseInt(str[i]));
            }
            int min = Collections.min(list);
            int max = Collections.max(list);
            answer = Integer.toString(min) + " " + Integer.toString(max);
        }

        return answer;
    }

}
