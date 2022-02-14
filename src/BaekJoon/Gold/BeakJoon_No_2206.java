package BaekJoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BeakJoon_No_2206 {
    static int[][] map;
    static int[][] visit;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int N, M;

    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visit = new int[N][M];
        for (int i = 0; i < N; i++) {
            
            String[] temp = br.readLine().split("");
            
            for (int j = 0; j < M; j++) {
                
                map[i][j] = Integer.parseInt(temp[j]);
                visit[i][j] = 100000;
                
            }
        }
        
        System.out.println(bfs(0, 0));
        
    }

    public static int bfs(int x, int y) {
        visit[y][x] = 0;
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y, 1, 0));
        while (!q.isEmpty()) {
            
            Point point = q.poll();
            if (point.x == M - 1 && point.y == N - 1) {
                return point.distance;
                
            }

            for (int i = 0; i < 4; i++) {
                
                int sx = point.x + dx[i];
                int sy = point.y + dy[i];
                if (sx >= 0 && sy >= 0 && sx < M && sy < N) {
                    if (visit[sy][sx] > point.wall) {
                        if (map[sy][sx] != 1) {
                            q.add(new Point(sx, sy, point.distance + 1, point.wall));
                            visit[sy][sx] = point.wall;
                        } else {
                            if (point.wall == 0) {
                                q.add(new Point(sx, sy, point.distance + 1, point.wall + 1));
                                visit[sy][sx] = point.wall + 1;
                            }
                        }
                        
                    }
                }
            }
        }
        return -1;
    }

    static class Point {
        int x, y, distance;
        int wall; // 공사 횟수

        public Point(int x, int y, int distance, int wall) {
            this.x = x;
            this.y = y;
            this.distance = distance;
            this.wall = wall;
        }
    }
}
