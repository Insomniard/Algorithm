package Programmers;

public class Level_2_TargetNumber {

    public static void main(String args[]){

        int[] numbers = {1,1,1,1,1};
        int taget = 3;
        int answer = 0;
        answer = dfs(numbers,taget,0,0);
        System.out.println(answer);
    }
    static int dfs(int[] numbers, int target, int current, int sum){
        if(current == numbers.length){
            if(sum==target)return 1;
            return 0;
        }
        else return dfs(numbers,target,current+1,sum+numbers[current]) + dfs(numbers,target,current+1,sum-numbers[current]);
    }
}
