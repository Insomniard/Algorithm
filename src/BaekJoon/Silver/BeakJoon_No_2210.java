package BaekJoon.Silver;

import java.util.*;
public class BeakJoon_No_2210 {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static Set<String> set = new HashSet<>();
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[][] map = new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                map[i][j] = scan.nextInt();
            }
        }
        String str = "";
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                dfs(map,0,i,j,str);
            }
        }
        System.out.println(set.size());
    }
    public static void dfs(int[][] map , int current, int x, int y, String str){

        if(current == 6){
            set.add(str);
            return;
        }
        for(int i=0;i<4;i++){
            int sx = x + dx[i];
            int sy = y + dy[i];
            if(sx>=0 && sy>=0 && sy<5 && sx<5)dfs(map,current+1,sx,sy,str+Integer.toString(map[sx][sy]));
        }
    }
}
