package BaekJoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class  BeakJoon_No_10026 {
    static String[][] map;
    static boolean[][] visit;
    static int N;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int count = 0;
    static int countRG = 0;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new String[N][N];
        visit = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().split("");
        }
        visit = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[i][j]) {
                    bfs(i, j);
                    count++;
                }
            }
        }
        clear();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[i][j]) {
                    bfs(i, j);
                    countRG++;
                }
            }
        }
        System.out.println(count + " " + countRG);
    }

    private static void clear() {
        visit = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j].equals("R")) map[i][j] = "G";
            }
        }

    }

    private static void bfs(int x, int y) {
        visit[x][y] = true;
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y));
        while (!q.isEmpty()) {
            Point current = q.poll();
            for (int i = 0; i < 4; i++) {
                int sx = current.x + dx[i];
                int sy = current.y + dy[i];
                if (sx >= 0 && sy >= 0 && sx < N && sy < N) {
                    if (map[x][y].equals(map[sx][sy]) && !visit[sx][sy]) {
                        visit[sx][sy] = true;
                        q.add(new Point(sx, sy));
                    }
                }
            }
        }
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
