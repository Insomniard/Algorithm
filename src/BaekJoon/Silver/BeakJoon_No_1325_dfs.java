package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BeakJoon_No_1325_dfs {
    static boolean[] visit;
    static int[] hacking;
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        hacking = new int[N+1];
        visit = new boolean[N+1];
        for (int i = 0; i <= N; i++) list.add(new ArrayList<Integer>());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.get(x).add(y);
        }

        for(int i=1;i<=N;i++){
            visit =new boolean[N+1];
            dfs(i);
        }
        int max = 0; int answer = 0;
        for(int i=1;i<hacking.length;i++){
            System.out.print(hacking[i] + " ");
            if(max<=hacking[i])max=hacking[i];
        }
        for(int i=1;i<hacking.length;i++){
            if(max==hacking[i])sb.append(i+" ");
        }
        System.out.println(sb.toString());
    }
    public static void dfs(int current){
        visit[current] = true;
        if(current == visit.length)return;
        for(int i : list.get(current)){
            if(!visit[i]){
                hacking[i]++;
                dfs(i);
            }
        }
    }
}
