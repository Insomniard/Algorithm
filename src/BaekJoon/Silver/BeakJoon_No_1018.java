package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BeakJoon_No_1018 {
    static String[][] map;
    static String [][] tempmap;
    static boolean[][] visit;
    static int N,M;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static int countW, countB;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new String[N][M];
        visit = new boolean[N][M];
        for(int i=0;i<N;i++){
            String[] temp = br.readLine().split("");
            for(int j=0;j<M;j++){
                map[i][j] = temp[j];
            }
        }
        tempmap = new String[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(map[i][j] + " ");
                tempmap[i][j] = map[i][j];
            }
            System.out.println();
        }
        System.out.println();
        int min = 64;
        for(int i=0;i<N-8;i++){
            for(int j=0;j<M-8;j++){
                clear();
                int count = dfs(i,j);
                min = Math.min(count,min);
            }
            System.out.println(min);
        }


        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(min);
    }
    private static void clear(){
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                map[i][j] = tempmap[i][j];
            }
        }
        countB = 0;
        countW = 0;
    }
    private static int dfs(int x, int y){
        visit[x][y] = true;
        for(int i=0;i<4;i++){
            int sx = x + dx[i];
            int sy = y + dy[i];
            if(sx>=x && sy>=y && sx<8 && sy<8){
                if(!visit[sx][sy]){
                    visit[sx][sy] = true;
                    if(map[x][y].equals("B")){
                        map[sx][sy] = "W";
                        countB++;
                    }
                    if(map[x][y].equals("W")){
                        map[sx][sy] = "B";
                        countW++;
                    }
                    dfs(sx,sy);
                }
            }
        }
        return Math.min(countB,countW);
    }
}
