package BaekJoon.Silver;

import java.util.*;
public class BeakJoon_No_1051 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        String[][] map = new String[N][M];
        for (int i = 0; i < N; i++) {
            String input = scan.next();
            for(int j=0;j<M;j++){
                map[i][j] = Character.toString(input.charAt(j));
            }
        }
        int answer = 1;
        int min = Math.min(N,M);
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                for(int k=1;k<=min;k++){
                    if(i + k < N && j + k <M && map[i][j].equals(map[i + k][j])
                            && map[i + k][j].equals(map[i][j + k])
                            && map[i][j + k].equals(map[i + k][j + k])){
                        answer = Math.max(answer, (k+1)*(k+1));
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
