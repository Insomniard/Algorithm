package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BeakJoon_No_1926 {
    static int[][] map;
    static boolean[][] visit;
    static int N,M;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static int areaPartition = 0;
    static int maxarea = 0;
    static int area = 0;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visit = new boolean[N][M];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<M;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(map[i][j] != 0 && !visit[i][j]){
                    area=1;
                    dfs(i,j);
                    areaPartition++;

                }
            }
        }
        System.out.println(areaPartition);
        System.out.println(maxarea);
    }
    public static void dfs(int x, int y){
        visit[x][y] = true;
        maxarea = Math.max(area,maxarea);
        for(int i=0;i<4;i++){
            int sx = x + dx[i];
            int sy = y + dy[i];
            if(sy>=0 && sx>=0 && sx<N && sy<M) {
                if(map[sx][sy] != 0 && !visit[sx][sy]){
                    area++;
                    dfs(sx,sy);
                }
            }
        }
    }
}
