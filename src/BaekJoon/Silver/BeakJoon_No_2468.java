package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class  BeakJoon_No_2468 {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] map;
    static boolean[][] visit;
    static int[][] sink;
    static int N;
    static int answer = 0;
    static int count = 0;
    static int area = 0;
    static boolean allsink;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        while (!allsink){
            sink = new int[N][N];
            area = 0;
            visit = new boolean[N][N];
            check();
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(sink[i][j] == 1 && !visit[i][j]){
                        dfs(i,j);
                        area++;
                    }
                }
            }
            answer = Math.max(area,answer);
            count++;
        }
        System.out.println(answer);
    }

    public static void dfs(int x, int y){
        visit[x][y] = true;

        for(int i=0;i<4;i++){
            int sx = x+dx[i];
            int sy = y+dy[i];
            if(sx>=0 && sy>=0 && sx<N && sy<N){
                if(sink[sx][sy] == 1 && !visit[sx][sy]){
                    dfs(sx,sy);
                }
            }
        }
    }
    public static void check(){
        int temp = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(map[i][j] <= count){
                    sink[i][j] = 0;
                }
                else sink[i][j] = 1;
                if(sink[i][j] == 1)temp+=sink[i][j];
            }
        }
        if(temp == 0)allsink = true;
        else allsink = false;
    }
}
