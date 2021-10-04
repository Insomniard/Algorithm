package Programmers.Level_2;

import java.util.*;
public class Level_2_SolutionDev {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        List<Integer> list = new ArrayList<>();
        for (int i = progresses.length-1; i >= 0; i--) {
            int temp = 0;
            while (true) {
                if (progresses[i] >= 100) {
                    s.push(temp);
                    break;
                } else {
                    progresses[i]+=speeds[i];
                    temp++;
                }
            }
        }
        while (!s.isEmpty()){
            int count = 1;
            int top = s.pop();
            while (!s.isEmpty() && s.peek() <= top) {
                count++;
                System.out.println(s.pop());
            }
            list.add(count);
        }
        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
    }
}
