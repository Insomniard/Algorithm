package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.*;
public class BeakJoon_No_1012 {
    static int[] xpos = {-1, 0, 1, 0};
    static int[] ypos = {0, -1, 0, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[][] map = new int[M + 1][N + 1];
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }
            int answer = 0;
            boolean[][] visit = new boolean[M][N];
            for (int x = 0; x < M; x++) {
                for (int y = 0; y < N; y++) {
                    if (!visit[x][y] && map[x][y] == 1) {
                        dfs(map, visit, x, y, M, N);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
    }
    public static void dfs(int[][] map, boolean[][] visit, int x, int y, int right, int down) {
        visit[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int px = x + xpos[i];
            int py = y + ypos[i];
            if (px >= 0 && py >= 0 && px < right && py < down) {
                if (!visit[px][py] && map[px][py] == 1) {
                    dfs(map, visit, px, py, right, down);
                }
            }
        }
    }
}


