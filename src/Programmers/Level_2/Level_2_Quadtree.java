package Programmers.Level_2;

import java.util.*;
public class Level_2_Quadtree {
    static int[] answer;
    public static void main(String args[]){
        int[][] arr = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
        solution(arr);
        for(int i=0;i< answer.length;i++)System.out.println(answer[i]);
    }
    private static int[] solution(int[][] arr){
        answer = new int[2];
        dfs(0,0,arr.length,arr);
        return answer;
    }
    private static void dfs(int x,int y,int depth, int[][] arr){
        boolean isZero = false;
        boolean isOne = false;
        for(int i=x;i<x+depth;i++){
            for(int j=y;j<y+depth;j++){
                if(arr[i][j] == 0)isZero = true;
                if(arr[i][j] == 1)isOne = true;
            }
        }
        if(!isOne){
            answer[0]++;
            return;
        }
        if(!isZero){
            answer[1]++;
            return;
        }
        dfs(x, y, depth/2, arr);
        dfs(x+depth/2, y, depth/2, arr);
        dfs(x, y+depth/2, depth/2, arr);
        dfs(x+depth/2, y+depth/2, depth/2, arr);

    }

}
