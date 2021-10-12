package Programmers.Level_2;

import java.util.ArrayList;

public class Level_2_MaximizeFormulas {
    public static long max = 0;
    public static String[] choice = new String[3];
    public static String[] format = {"+", "-", "*"};
    public static boolean visit[] = new boolean[3];

    public static void main(String args[]) {
        String expression = "100-200*300-500+20";
        String[] arr = expression.split("");
        ArrayList<Long> listofNum = new ArrayList<>();
        ArrayList<String> listofformat = new ArrayList<>();
        String num = "";
        for (String s : arr) {
            if (s.equals("+") || s.equals("-") || s.equals("*")) {
                listofformat.add(s);
                listofNum.add(Long.parseLong(num));
                num = "";
            } else num += s;
        }
        listofNum.add(Long.parseLong(num));
        dfs(listofNum, listofformat, 0);
        System.out.println(max);
    }

    public static void dfs(ArrayList<Long> listofNum, ArrayList<String> listofformat, int num) {
        if (num == 3) {
            max = Math.max(max, Calc(listofNum, listofformat));
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (visit[i]) continue;
            choice[num] = format[i];
            visit[i] = true;
            dfs(listofNum, listofformat, num + 1);
            visit[i] = false;
        }
    }

    public static long Calc(ArrayList<Long> calcNum, ArrayList<String> calcOp) {
        ArrayList<Long> listofNum = (ArrayList<Long>) calcNum.clone();
        ArrayList<String> listofformat = (ArrayList<String>) calcOp.clone();
        for (String s : choice) {
            for (int i = 0; i < listofformat.size(); i++) {
                if (listofformat.get(i).equals(s)) {
                    long answer = 0;
                    if (s.equals("*"))answer = listofNum.get(i) * listofNum.get(i + 1);
                    else if (s.equals("+")) answer = listofNum.get(i) + listofNum.get(i + 1);
                    else if (s.equals("-")) answer = listofNum.get(i) - listofNum.get(i + 1);
                    listofNum.remove(i + 1);
                    listofNum.set(i, answer);
                    listofformat.remove(i);
                    i--;
                }
            }
        }
        return Math.abs(listofNum.get(0));
    }

}
