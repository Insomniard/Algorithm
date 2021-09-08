package BaekJoon;
import java.util.*;
public class BeakJoon_No_1260 {

    static boolean[] visit;
    static int[][] Map;
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int node = scan.nextInt();
        int trunk = scan.nextInt();
        int currentNode = scan.nextInt();
        visit = new boolean[node+1];
        Map = new int[node+1][node+1];
        for(int i=0;i<trunk;i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            Map[x][y] = 1;
            Map[y][x] = 1;
        }
        dfs(currentNode);
    }

    static void dfs(int currentNode){
        visit[currentNode] = true;
        System.out.print(currentNode + " ");
        if(currentNode == Map.length) return;
        for(int i=1; i<Map.length;i++){
            if(Map[currentNode][i] == 1 && visit[i] == false) dfs(i);
        }

    }


}
