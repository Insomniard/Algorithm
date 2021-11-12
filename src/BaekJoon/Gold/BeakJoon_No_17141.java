package BaekJoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class  BeakJoon_No_17141 {
    static int[][] map;
    static int N, M;
    static int[][] virusMap;
    static int answer = Integer.MAX_VALUE;
    static int min = 0;
    static Queue<Point> q = new LinkedList<>();
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static ArrayList<Point> list = new ArrayList<>();
    static boolean[] visit;
    static int[][] time;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 2) {
                    list.add(new Point(i, j));
                    map[i][j] = 0;
                }
            }
        }
        visit = new boolean[list.size()];
        dfs(0, 0);
        if (answer == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(answer - 1);
    }

    private static void clear() {
        q.clear();
        time = new int[N][N];
        virusMap = new int[N][N];
        for (int i = 0; i < N; i++) {
            virusMap[i] = map[i].clone();
        }
        for (int i = 0; i < list.size(); i++) {
            if (visit[i]) {
                map[list.get(i).x][list.get(i).y] = 0;
                time[list.get(i).x][list.get(i).y] = 1;
                q.add(list.get(i));
            }
        }
    }

    private static void dfs(int now, int countOfVirus) {
        if (countOfVirus == M) {
            bfs();
            answer = Math.min(answer, min);
            return;
        }

        for (int i = now; i < list.size(); i++) {
            if (!visit[i]) {
                visit[i] = true;
                dfs(now + 1, countOfVirus + 1);
                visit[i] = false;
            }
        }
    }

    private static void bfs() {
        clear();
        min = 0;
        while (!q.isEmpty()) {
            Point current = q.poll();
            for (int i = 0; i < 4; i++) {
                int sx = current.x + dx[i];
                int sy = current.y + dy[i];
                int st = time[current.x][current.y];
                min = Math.max(min, st);
                if (sx >= 0 && sy >= 0 && sx < N && sy < N) {
                    if (virusMap[sx][sy] == 0 && time[sx][sy] == 0) {
                        time[sx][sy] = st + 1;
                        virusMap[sx][sy] = 2;
                        q.add(new Point(sx, sy));
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (time[i][j] == 0 && virusMap[i][j] == 0) {
                    min = Integer.MAX_VALUE;
                    return;
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
