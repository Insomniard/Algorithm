package BaekJoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BeakJoon_No_2146 {
    static int N;
    static int[][] map;
    static int[][] clonemap;
    static boolean[][] visit;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static int min = 1111110;
    static int nextCount = 0;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visit = new boolean[N][N];
        clonemap = new int[N][N];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<N;j++){
                clonemap[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 2;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(clonemap[i][j] == 1){
                    dfs(i,j,count);
                    count++;
                }
            }
        }
        mapping();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(map[i][j] != 0){
                    bfs(i,j);
                    mapping();
                }
            }
        }
        System.out.println(min);
    }
    public static void bfs(int x, int y){
        Queue<dot> q = new LinkedList<dot>();
        q.add(new dot(x, y,0));

        while (!q.isEmpty()){
            dot current = q.poll();
            int cx = current.x;
            int cy = current.y;
            int count = current.count;
            for(int i=0;i<4;i++){

                int sx = cx + dx[i];
                int sy = cy + dy[i];
                int scount = count + 1;
                if (sx < 0 || sy < 0 || sx >= N || sy >= N) {
                    continue;
                }
                if (map[sx][sy]==map[x][y]) {
                    continue;
                }
                if(map[sx][sy]==-1){
                    continue;
                }

                if(map[sx][sy]!=0){
                    min = Math.min(min, scount-1);
                    return;
                }
                map[sx][sy] = -1;
                q.add(new dot(sx,sy,scount));

            }
        }

    }
    public static void mapping(){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                map[i][j] = clonemap[i][j];
            }
        }
    }
    public static void dfs(int x,int y, int count){
        for(int i=0;i<4;i++){
            int sx = x + dx[i];
            int sy = y + dy[i];
            if(sx>=0 && sy>=0 && sx<N && sy <N){
                if(clonemap[sx][sy] == 1){
                    clonemap[sx][sy] = count;
                    dfs(sx,sy,count);
                }
            }
        }
    }
}
class dot {
    int x;
    int y;
    int count;
    dot(int x, int y,int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }
}
