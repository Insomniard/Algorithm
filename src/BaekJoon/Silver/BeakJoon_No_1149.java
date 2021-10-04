package BaekJoon.Silver;

import java.util.*;
public class BeakJoon_No_1149 {

    static int[][] Home;
    static int[][] Cost;

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Cost = new int[N][3];
        Home = new int[N][3];
        for(int i=0;i<N;i++){
            Cost[i][0] = scan.nextInt();
            Cost[i][1] = scan.nextInt();
            Cost[i][2] = scan.nextInt();
        }
        Home[0][0] = Cost[0][0];
        Home[0][1] = Cost[0][1];
        Home[0][2] = Cost[0][2];
        System.out.println(Math.min(go(N-1,0),Math.min(go(N-1,1),go(N-1,2))));
    }

    static int go(int N, int color){
        if(Home[N][color] == 0){
            if (color == 0){
                Cost[N][0] += Math.min(go(N-1,1),go(N-1,2));
            }
            else if (color == 1){
                Cost[N][1] += Math.min(go(N-1,0),go(N-1,2));
            }
            else{
                Cost[N][2] += Math.min(go(N-1,0),go(N-1,1));
            }
            Home[N][color]=Cost[N][color];
        }
        return Home[N][color];
    }
}

