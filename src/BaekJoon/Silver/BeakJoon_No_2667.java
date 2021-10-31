package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BeakJoon_No_2667 {
    public static int[] posX = {1,0,-1,0};
    public static int[] posY = {0,1,0,-1};
    static int Danji;
    public static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        int[][] map = new int[N][N];
        boolean[][] visit = new boolean[N][N];
        for(int i=0;i<N;i++){
            String[] input = br.readLine().split("");
            for(int j=0;j<N;j++){
                map[i][j] = Integer.parseInt(input[j]);
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(map[i][j] == 1 && !visit[i][j]){
                    Danji = 1;
                    dfs(map,visit,i,j,N);
                    list.add(Danji);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int i : list)System.out.println(i);
    }
    public static void dfs(int[][] arr, boolean bool[][], int x, int y, int N){
        bool[x][y] = true;
        for(int i=0;i<4;i++){
            int ps = x + posX[i];
            int py = y + posY[i];
            if(ps>=0 && py>=0 && ps < N && py < N){
                if(!bool[ps][py] && arr[ps][py] == 1){
                    dfs(arr,bool,ps,py,N);
                    Danji++;
                }
            }
        }
    }
}
