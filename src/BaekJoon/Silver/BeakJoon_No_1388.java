package BaekJoon.Silver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BeakJoon_No_1388 {
    static String[][] map;
    static boolean[][] visit;
    static int N, M;
    static int count = 0;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new String[N][M];
        visit = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String[] tile = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                map[i][j] = tile[j];
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(map[i][j].equals("-") && !visit[i][j]){
                    width(i,j);
                    count++;
                }
                else if(map[i][j].equals("|") && !visit[i][j]){
                    length(i,j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void width(int x, int y){
        visit[x][y] = true;
        if(y>=0 && y+1<M){
            if(map[x][y+1].equals("-") && !visit[x][y+1]){
                width(x,y+1);
            }
        }
    }
    public static void length(int x, int y){
        visit[x][y] = true;
        if(x>=0 && x+1<N){
            if(map[x+1][y].equals("|") && !visit[x+1][y]){
                length(x+1,y);
            }
        }
    }
}
