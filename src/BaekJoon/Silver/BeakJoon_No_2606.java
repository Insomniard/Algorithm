package BaekJoon.Silver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BeakJoon_No_2606 {
    static int answer = 0;
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int computer = Integer.parseInt(br.readLine());
        int computerpair = Integer.parseInt(br.readLine());
        int[][] map = new int[computer+1][computer+1];
        boolean[] visit = new boolean[computer+1];
        for(int i=0;i<computerpair;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = map[y][x] = 1;
        }
        dfs(map,visit,1,computer);
        System.out.println(answer);
    }
    public static void dfs(int[][] map, boolean[] visit, int current, int computer){
        visit[current] = true;
        for(int i=1;i<=computer;i++){
            if(!visit[i] && map[current][i] == 1){
                dfs(map,visit,i,computer);
                answer++;
            }
        }
    }
}
