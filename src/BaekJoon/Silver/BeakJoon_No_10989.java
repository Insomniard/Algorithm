package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class BeakJoon_No_10989 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int key = Integer.parseInt(br.readLine());
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int key = 1; key <= 10000; key++) {
            if (map.containsKey(key)) {
                for(int j=0;j<map.get(key);j++){
                    bw.write(key + "\n");
                }
            }
        }
        bw.flush();
        br.close();
        map.clear();
    }
}
