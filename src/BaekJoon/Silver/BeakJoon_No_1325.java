package BaekJoon.Silver;
import java.util.*;
public class BeakJoon_No_1325 {
    static boolean visit[];
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int arr[];
    public static void main(String args[]){
        int max=0;
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // node
        int M = scan.nextInt(); // trunk
        for(int i=0;i<=N;i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0;i<M;i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            graph.get(x).add(y);
        }
        arr = new int[N+1];
        for (int i=1;i<=N;i++){
            visit = new boolean[N+1];
            bfs(i);
        }
        for(int i=1;i<=N;i++){
            if(max<arr[i])max = arr[i];
        }
        for(int i=1;i<=N;i++){
            if(max == arr[i])System.out.print(i + " ");
        }

    }
    static void bfs(int currentNode){
        Queue<Integer> q = new LinkedList<>();
        q.add(currentNode);
        visit[currentNode] = true;
        while (!q.isEmpty()){
            int first = q.remove();
            for(int node : graph.get(first)){
                if(!visit[node]){
                    visit[node] = true;
                    q.add(node);
                    arr[node]++;
                }
            }
        }
    }

}
