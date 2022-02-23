package BaekJoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BeakJoon_No_1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> crain = new ArrayList<>();
        ArrayList<Integer> weight = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            crain.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            weight.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(crain, Collections.reverseOrder());
        Collections.sort(weight, Collections.reverseOrder());

        int answer = 0;

        if (crain.get(0) < weight.get(0)) {
            System.out.println(-1);
            return;
        }

        while (!weight.isEmpty()) {
            int index = 0;

            for (int i = 0; i < crain.size();i++) {
                if (index == weight.size()) {
                    break;
                } else if (crain.get(i) >= weight.get(index)) {
                    weight.remove(index);
                } else {
                    index++;
                    i--;
                }
            }
            answer++;
        }
        System.out.println(answer);
    }
}
