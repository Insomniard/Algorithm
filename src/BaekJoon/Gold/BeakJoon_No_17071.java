package BaekJoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BeakJoon_No_17071 {
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int subin = Integer.parseInt(st.nextToken());
        int brother = Integer.parseInt(st.nextToken());
        System.out.println(bfs(subin, brother));
    }

    private static int bfs(int subin, int brother) {
        Queue<Integer> q = new LinkedList<>();
        q.add(subin);
        boolean[][] visit = new boolean[500001][2];
        int time = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int current = q.poll();
                if (current == brother) return time;
                if (current + 1 <= 500000) {
                    if (!visit[current + 1][time%2]) {
                        visit[current + 1][time%2] = true;
                        q.add(current + 1);
                    }
                }
                if (current * 2 <= 500000) {
                    if (!visit[current * 2][time%2]) {
                        visit[current * 2][time%2] = true;
                        q.add(current * 2);
                    }
                }
                if (current - 1 >= 0) {
                    if (!visit[current - 1][time%2]) {
                        visit[current - 1][time%2] = true;
                        q.add(current - 1);
                    }
                }
            }

            time++;
            brother += time;
            if (brother > 500000) return -1;
            if (visit[brother][time%2]) return time;
        }
        return -1;
    }

}
