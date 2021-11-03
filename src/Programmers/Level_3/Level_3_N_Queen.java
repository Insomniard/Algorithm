package Programmers.Level_3;

import java.util.*;
public class Level_3_N_Queen {
    static int count = 0;
    public static void main(String args[]){
        int n = 8;
        int[] map = new int[n];
        dfs(0,map);
        System.out.println(count);

    }
    public static void dfs(int current, int[] map){

        if(current == map.length){
            count++;
            return;
        }
        for(int i=0;i< map.length;i++){
            map[current] = i;
            if(isQueen(current,map))dfs(current+1,map);
        }
    }
    public static boolean isQueen(int current, int[] map){
        for(int i=0;i<current;i++){
            if(map[current] == map[i])return false;
            else if(Math.abs(current - i) == Math.abs(map[current] - map[i]))return false;
        }
        return true;
    }
}
