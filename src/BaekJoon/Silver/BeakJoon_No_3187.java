package BaekJoon.Silver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BeakJoon_No_3187 {
    static int sheep = 0; // k
    static int wolf = 0; // v
    static int[] posX = {1,0,-1,0};
    static int[] posY = {0,1,0,-1};
    static int R =0;
    static int C = 0;
    static int wolfs = 0;
    static int sheeps = 0;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        String[][] map = new String[R+1][C+1];
        boolean[][] visit = new boolean[R+1][C+1];
        for(int i=0;i<R;i++){
            String[] input = br.readLine().split("");
            for(int j=0;j<C;j++){
                map[i][j] = input[j];
                if(map[i][j].equals("k"))sheep++;
                if(map[i][j].equals("v"))wolf++;
            }
        }
        System.out.println(sheep + " " + wolf);
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(!map[i][j].equals("#") && !visit[i][j]){
                    wolfs = 0;
                    sheeps = 0;
                    dfs(map, visit, i, j);
                    if(sheeps > wolfs)wolf-=wolfs;
                    else if(wolfs>=sheeps)sheep-=sheeps;

                }
            }
        }
        System.out.println(sheep + " " + wolf);
    }
    public static void dfs(String[][] map, boolean[][] visit, int x, int y){
        visit[x][y] = true;
        if(map[x][y].equals("k"))sheeps++;
        if(map[x][y].equals("v"))wolfs++;
        for(int i=0;i<4;i++){
            int px = x + posX[i];
            int py = y + posY[i];
            if(px>=0 && py>= 0 && px<R && py<C)
            if(!map[px][py].equals("#") && !visit[px][py]){
                dfs(map, visit, px, py);
            }
        }

    }
}
