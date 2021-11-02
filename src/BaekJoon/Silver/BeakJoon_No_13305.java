package BaekJoon.Silver;

import java.util.*;
public class BeakJoon_No_13305 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long[] distance = new long[N];
        long[] cost = new long[N];
        for(int i=0;i<N-1;i++){
            distance[i] = scan.nextInt();
        }
        for(int i=0;i<N;i++){
            cost[i] = scan.nextInt();
        }
        long start = cost[0];
        long answer = cost[0] * distance[0];
        for(int i=1;i<N;i++){
            if(cost[i]<start){
                start = cost[i];
            }
            answer += (start * distance[i]);
        }
        System.out.println(answer);
    }
}
