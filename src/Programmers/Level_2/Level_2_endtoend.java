package Programmers.Level_2;
import java.util.*;
public class Level_2_endtoend {
    public static void main(String args[]) {
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        int n = 2;
        ArrayList<String> list = new ArrayList<>();
        int[] answer = new int[2];
        boolean check = false;
        list.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (list.contains(words[i]) || list.get(i - 1).charAt(list.get(i - 1).length() - 1) != words[i].charAt(0)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                check = true;
                break;
            }
            list.add(words[i]);
        }

        if (!check && answer[0] == 0) {
            answer[0] = 0;
            answer[1] = 0;
        }
        System.out.println(answer[0] + " " + answer[1]);
    }
}
