package Programmers.Level_2;

import java.util.*;
public class Level_2_KakaoFriendsColoringBook {
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static boolean[][] visit;
    static int max = 0;
    static int maxSizeOfOneArea = 0;
    public static void main(String args[]){
        int[][] map =  {{1, 1, 1, 0},
                        {1, 2, 2, 0},
                        {1, 0, 0, 1},
                        {0, 0, 0, 1},
                        {0, 0, 0, 3},
                        {0, 0, 0, 3}};
        int m =6;
        int n = 4;
        solution(m,n,map);
    }
    public static int[] solution(int m, int n, int[][] picture) {
        ArrayList<Integer> list = new ArrayList<>();
        int numberOfArea = 0;
        visit = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visit[i][j] && picture[i][j] != 0){
                    max = 1;
                    numberOfArea++;
                    dfs(i,j,picture,m,n);
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea,max);
                }
            }
            maxSizeOfOneArea = Math.max(maxSizeOfOneArea,max);
        }
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        System.out.println(list.size() + " " + Collections.max(list));
        return answer;
    }
    public static void dfs(int x,int y, int[][] map,int m,int n){

        visit[x][y] = true;
        for(int i=0;i<4;i++){
            int sx = x + dx[i];
            int sy = y + dy[i];
            if(sx>= 0 && sy>= 0 && sx<m && sy<n){
                if(!visit[sx][sy] && map[sx][sy] == map[x][y]){
                    dfs(sx,sy,map,m,n);
                    max++;
                }
            }
        }

    }
}
