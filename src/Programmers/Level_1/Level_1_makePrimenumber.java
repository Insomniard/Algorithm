package Programmers.Level_1;

import java.util.*;

public class Level_1_makePrimenumber {
    static int number = 0;
    static int answer = 0;
    static boolean[] visit;
    public static void main(String args[]) {
        int[] nums = {1, 2, 7, 6, 4};
        visit = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            visit[i] = true;
            if (i - 3 < 0) dfs(visit, 1, nums, i);
            visit[i] = false;
        }
        System.out.println(answer);
    }

    public static void dfs(boolean[] visit, int depth, int[] nums, int current) {
        visit[current] = true;
        if (depth == 3) {
            boolean checkprime = false;
            number = 0;
            for (int i = 0; i < visit.length; i++) {
                if (visit[i]) number += nums[i];
            }
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    checkprime = false;
                    break;
                }
                else checkprime = true;
            }
            if(checkprime)answer++;
            return;
        }
        for(int i=current+1;i<nums.length;i++){
            if(!visit[i]){
                visit[i] = true;
                dfs(visit,depth+1,nums,i);
                visit[i]=false;
            }
        }
    }
}
