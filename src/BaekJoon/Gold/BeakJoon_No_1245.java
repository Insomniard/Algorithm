package BaekJoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BeakJoon_No_1245 {
    static int[] dx = {-1,0,1,0,-1,1,1,-1};
    static int[] dy = {0,-1,0,1,-1,1,-1,1};
    static int[][] map;
    static boolean[][] visit;
    static int answer = 0;
    static int N,M;
    static boolean isPeak;
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
        isPeak = true;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(!visit[i][j] && map[i][j]>0){
                    dfs(i,j);
                    if(isPeak)answer++;
                    isPeak = true;
                }
            }
        }
        System.out.println(answer);
    }
    public static void dfs(int x,int y){
        visit[x][y] = true;
        for(int i=0;i<8;i++){
            int sx = x + dx[i];
            int sy = y + dy[i];
            if(sx>= 0 && sy >=0 && sx<N && sy<M){
                if(map[sx][sy] > map[x][y])isPeak = false;
                if(!visit[sx][sy] && map[sx][sy] == map[x][y]){
                    visit[sx][sy] = true;
                    dfs(sx,sy);
                }
            }
        }
    }
}
