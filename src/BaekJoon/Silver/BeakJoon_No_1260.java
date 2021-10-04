package BaekJoon.Silver;
import java.util.*;
public class BeakJoon_No_1260 {

    static boolean[] visit;
    static int[][] graph;
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int node = scan.nextInt();
        int trunk = scan.nextInt();
        int currentNode = scan.nextInt();
        visit = new boolean[node+1];
        graph = new int[node+1][node+1];
        for(int i=0;i<trunk;i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            graph[x][y] = 1;
            graph[y][x] = 1;
        }
        dfs(currentNode);
        visit = new boolean[node+1];
        System.out.println();
        bfs(currentNode);
    }

    static void dfs(int currentNode) {
        visit[currentNode] = true;
        System.out.print(currentNode + " ");
        if (currentNode == graph.length) return;
        for (int i = 1; i < graph.length; i++) {
            if (graph[currentNode][i] == 1 && visit[i] == false) dfs(i);
        }
    }
    public static void bfs(int currentNode){
        Queue<Integer> q = new LinkedList<>();
        q.add(currentNode);
        visit[currentNode] = true;
        while (!q.isEmpty()){
            currentNode = q.poll();
            System.out.print(currentNode + " ");
            for(int i=1;i<graph.length;i++){
                if(graph[currentNode][i] == 1 && visit[i] == false){
                    q.add(i);
                    visit[i] = true;
                }
            }
        }
    }


}
