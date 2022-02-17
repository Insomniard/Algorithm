package BaekJoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class  BeakJoon_No_14502 {
    static int[][] map;
    static int[][] wallMap;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int N, M;
    static int answer = 0;
    static Queue<Point> q = new LinkedList<>();

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        wallMap = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        clear();
        dfs(0);
        System.out.println(answer);
    }

    public static void checksafeArea() {
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (wallMap[i][j] == 0) max++;
            }
        }
        answer = Math.max(answer, max);
    }

    public static void clear() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                wallMap[i][j] = map[i][j];
                if (wallMap[i][j] == 2) q.add(new Point(i, j));
            }
        }
    }

    public static void dfs(int countofWall) {
        
        if (countofWall == 3) {
            bfs();
            return;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    map[i][j] = 1;
                    dfs(countofWall + 1);
                    map[i][j] = 0;
                }
            }
        }
    }

    public static void bfs() {
        
        clear();
        while (!q.isEmpty()) {
            Point point = q.poll();
            for (int k = 0; k < 4; k++) {
                int nx = point.x + dx[k];
                int ny = point.y + dy[k];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (wallMap[nx][ny] == 0) {
                        wallMap[nx][ny] = 2;
                        q.add(new Point(nx, ny));
                    }
                }
            }
        }
        checksafeArea();
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
