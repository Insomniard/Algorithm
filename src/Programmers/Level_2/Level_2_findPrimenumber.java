package Programmers.Level_2;

import java.util.HashSet;
import java.util.Set;
public class Level_2_findPrimenumber {
    static Set<Integer> set = new HashSet<>();
    public static void main(String args[]){
        String numbers = "17";
        String[] number = numbers.split("");

        boolean[] visit = new boolean[number.length];
        for(int i=0;i<number.length;i++){
            dfs(i+1,visit,number,0,"");
        }
        int answer=set.size();
    }

    public static void dfs(int size, boolean[] visit, String[] number, int depth, String str){
        if(size==depth && Integer.parseInt(str)>1){
            if(isPrime(Integer.parseInt(str))){
                set.add(Integer.parseInt(str));
            }
            return;
        }
        for(int i=0;i< number.length;i++){
            if(!visit[i]){
                visit[i] = true;
                str+=number[i];
                dfs(size,visit,number,depth+1,str);
                str=str.substring(0,str.length()-1);
                visit[i] = false;
            }
        }
    }

    public static boolean isPrime(int num){
        System.out.println(num);
        for(int i=2;i<=num/2;i++){
            if(num%i == 0)return false;
        }
        return true;
    }
}
