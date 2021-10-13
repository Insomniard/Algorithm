package BaekJoon.Silver;

import java.util.*;
public class BeakJoon_No_2644 {
    static int answer = -1;
    static int[][] map;
    static boolean[] visit;
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        int first = scan.nextInt();
        int second = scan.nextInt();
        int relation = scan.nextInt();
        map = new int[test+1][test+1];
        visit = new boolean[test+1];
        for(int i=0;i<relation;i++){
                int x = scan.nextInt();
                int y = scan.nextInt();
                map[x][y] = map[y][x] = 1;
        }
        dfs(first,second,test,0);
        if(answer == 0)System.out.println(-1);
        System.out.println(answer);
    }
    public static void dfs(int current, int find, int test,int chon){
        visit[current] = true;
        for(int i=1;i<=test;i++){
            if(map[current][i] == 1 && !visit[i]){
                if(i == find){
                    answer = chon + 1;
                    return;
                }
                dfs(i,find,test,chon+1);
            }
        }
    }
}
