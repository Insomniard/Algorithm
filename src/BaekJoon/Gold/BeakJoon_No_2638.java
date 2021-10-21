package BaekJoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class  BeakJoon_No_2638 {
    static int[][] map;
    static int[][] visit;
    static int N, M;
    static int[][] melt;
    static boolean allmelt;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int hour = 0;
        while (!allmelt){
            visit = new int[N][M];
            melt = new int[N][M];
            bfs();
            check();
            hour++;
        }
        System.out.println(hour);
    }

    public static void bfs() {
        Queue<cheeeeeessss> q = new LinkedList<>();
        q.add(new cheeeeeessss(0, 0));
        while (!q.isEmpty()) {
            cheeeeeessss c = q.poll();
            for (int i = 0; i < 4; i++) {
                int sx = c.x + dx[i];
                int sy = c.y + dy[i];
                if (sx >= 0 && sy >= 0 && sx < N && sy < M) {
                    if (map[sx][sy] == 0 && visit[sx][sy]==0) {
                        q.add(new cheeeeeessss(sx, sy));
                        visit[sx][sy] = 1;
                    }
                    if(map[sx][sy] == 1){
                        visit[sx][sy]++;
                        if(visit[sx][sy]>=2)
                        map[sx][sy]=0;
                    }
                }
            }
        }
    }
    public static void check(){
        int sum = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                sum+=map[i][j];
                if(sum == 0)allmelt = true;
                else allmelt = false;
            }
        }
    }
    static class cheeeeeessss{
        int x;
        int y;
        cheeeeeessss(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
