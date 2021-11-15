
package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BeakJoon_No_1599 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine().replaceAll("k", "c").replaceAll("ng", " ");
            list.add(str);
        }
        Collections.sort(list, (o1, o2) -> {
            for (int i = 0; i < Math.min(o1.length(), o2.length()); i++) {
                double o1Val = getVal(o1.charAt(i));
                double o2Val = getVal(o2.charAt(i));
                if (o1Val != o2Val) return Double.compare(o1Val, o2Val);
            }
            return o1.length() - o2.length();
        });

        for (String s : list) {
            System.out.println(s.replaceAll("c", "k").replaceAll(" ", "ng"));
        }
    }

    static double getVal(char c) {
        if (c == ' ') {
            return 'n' + 0.5;
        }
        return c;
    }
}
