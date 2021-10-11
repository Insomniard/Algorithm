package BaekJoon.Silver;

import java.util.*;
public class BeakJoon_No_1463 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(dfs(num,1));

    }
    public static int dfs(int num, int count){
        if(num < 2)return count;
        return Math.min(dfs(num / 2, count + 1 + (num % 2)), dfs(num / 3, count + 1 + (num % 3)));
    }
}
