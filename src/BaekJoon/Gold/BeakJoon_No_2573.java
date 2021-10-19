package BaekJoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BeakJoon_No_2573 {
    static int[][] map;
    static boolean[][] visit;
    static int[][] melt;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int N, M;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visit = new boolean[N][M];
        melt = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int answer = 0;
        while (true) {
            int count = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (!visit[i][j] && map[i][j] != 0) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            if (count == 0) {
                System.out.println(0);
                break;

            } else if (count >= 2) {
                System.out.println(answer);
                break;
            }
            melting();

            answer++;
            visit = new boolean[N][M];

        }
    }

    public static void dfs(int x, int y) {
        visit[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int sx = x + dx[i];
            int sy = y + dy[i];
            if (sx >= 0 && sy >= 0 && sx < N && sy < M) {

                if (map[sx][sy] == 0) {
                    melt[x][y]++;
                    if (map[x][y] <= 0) map[x][y] = 0;
                }
                if (!visit[sx][sy] && map[sx][sy] != 0) {
                    dfs(sx, sy);
                }
            }
        }
    }
    static void melting() {
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                map[i][j] -= melt[i][j];

                if(map[i][j] < 0)
                    map[i][j] = 0;

                visit[i][j] = false;
                melt[i][j] = 0;
            }
        }
    }
}
