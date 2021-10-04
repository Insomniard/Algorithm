package Programmers.Level_1;

import java.util.*;
public class Level_1_LottoMinMax {
    public static void main(String args[]){
        // 2 => 5, 3 => 4, 4 => 3, 5 => 2, 6 => 1
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int max = 7; int min = 7; boolean check;
        for(int i=0;i< lottos.length;i++){
            check = true;
            for(int j=0;j<lottos.length;j++){
                if((lottos[i] == 0 || lottos[i] == win_nums[j]) && check == true){
                    max--;
                    check = false;
                }
                if(lottos[i] == win_nums[j]){
                    min--;
                }
            }
        }
        int[] answer = {max,min};
        for(int i=0;i<answer.length;i++)System.out.println(answer[i]);
    }
}
