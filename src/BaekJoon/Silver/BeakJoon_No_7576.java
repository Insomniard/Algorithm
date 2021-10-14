package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BeakJoon_No_7576 {
    static Queue<Integer> q = new LinkedList<>();
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int answer = -1;
    static int N,M;
    static int[][] map;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[M][N];
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<N;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 1){
                    q.add(i);
                    q.add(j);
                }
            }
        }

        bfs();
        if(answer != 0 && answer != -1)System.out.println(answer-1);
        else System.out.println(answer);
    }
    public static void bfs(){
        while (!q.isEmpty()){
            int x = q.poll();
            int y = q.poll();

            for(int i=0;i<4;i++){
                int sx = x + dx[i];
                int sy = y + dy[i];
                if(sx>=0 && sy>=0 && sx<M && sy < N){
                    if(map[sx][sy] == 0){
                        q.add(sx);
                        q.add(sy);
                        map[sx][sy] = map[x][y] + 1;
                    }
                }
            }

        }
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(map[i][j] == 0)return;
                answer = Math.max(answer,map[i][j]);
            }
        }
        if(answer == 1){
            answer=0;
            return;
        }
    }
}
