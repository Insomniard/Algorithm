package BaekJoon.Silver;

import java.util.*;
public class BeakJoon_No_1326 {
    static int N;
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        int[] map = new int[N];
        boolean[] visit = new boolean[N];
        for(int i=0;i<N;i++){
            map[i] = scan.nextInt();
        }
        int start = scan.nextInt();
        int end = scan.nextInt();
        bfs(map,visit,start-1,end);
    }
    public static void bfs(int[] map, boolean[] visit, int current, int end){
        Queue<Integer> q = new LinkedList<>();
        q.add(current);
        visit[current] = true;
        while (!q.isEmpty()){
            int node = q.poll();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<end-1;i++){
                if(Math.abs(map[node]) * (-i)>N){
                    break;
                }
                list.add(map[node]*(i));
            }
            for(int i=0;i<end-1;i++){
                if(Math.abs(map[node]) * -i>N){
                    break;
                }
                list.add(map[node]*(-i));
            }
            for(int i=0;i< list.size();i++){
                int n = node + list.get(i);
                if(0 <= n && !visit[n]){
                    visit[n] = true;
                    q.add(n);
                }
            }
        }
    }
}
