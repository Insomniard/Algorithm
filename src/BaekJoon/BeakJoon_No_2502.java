package BaekJoon;
import java.util.*;
public class BeakJoon_No_2502 {
    static boolean check = false;
    static int first,second;
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int k = scan.nextInt();

        for(int i=k-1;i>=1;i--){
            dfs(i,k-i , d);
            if(check)break;
        }
        System.out.println(first + "\n" + second);
    }

    static void dfs(int onedayDduck, int twodayDduck,int currentDay){
        if(onedayDduck<= 0 || twodayDduck <= 0)return;
        if(currentDay == 2){
            first = onedayDduck;
            second = onedayDduck + twodayDduck;
            check = true;
            return;
        }
        check = false;
        dfs(twodayDduck,onedayDduck - twodayDduck,currentDay-1);
    }
}
