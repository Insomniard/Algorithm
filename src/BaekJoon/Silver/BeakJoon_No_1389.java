package BaekJoon.Silver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class  BeakJoon_No_1389 {
    static int[][] map;
    static boolean[] visit;
    static int N, M;
    static int[] answers;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N+1][M+1];
        visit = new boolean[M+1];
        answers = new int[M+1];
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
                map[x][y] = map[y][x] = 1;
        }

       for(int i=1;i<=N;i++){
           visit = new boolean[N+1];
           bfs(i);
       }
       int min = 100000;
       for(int i=1;i<answers.length;i++){
           if(answers[i]<min){
               min = answers[i];
           }
       }
       for(int i=1;i<answers.length;i++){
           if(answers[i] == min) {
               System.out.println(i);
               return;
           }
       }
    }
    public static void bfs(int f2){
        Queue<Integer> q = new LinkedList<>();
        visit[f2] = true;
        q.add(f2);
        q.add(0);
        while (!q.isEmpty()){
            int currentfriend = q.poll();
            int count = q.poll();
            for(int i=1;i<=N;i++){
                if(map[currentfriend][i] != 0 && !visit[i]){
                    q.add(i);
                    q.add(count+1);
                    visit[i] = true;
                    answers[i]+=count+1;
                }
            }
        }
    }
}
