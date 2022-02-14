package BaekJoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BeakJoon_No_1323 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long div = Long.parseLong(st.nextToken());
        int divnum = Integer.parseInt(st.nextToken());

        if (div % divnum == 0) {
            System.out.println(1);
            return;
        }

        long num = div;
        Set<Long> set = new HashSet<>();
        int count = 0;
        long temp = div % divnum;

        while (temp != 0) {

            temp = div % divnum;

            if (!set.add(temp)) {
                System.out.println(-1);
                return;
            }
            div = Long.parseLong(Long.toString(temp) + Long.toString(num));
            count++;

        }

        System.out.println(count);
    }

}
