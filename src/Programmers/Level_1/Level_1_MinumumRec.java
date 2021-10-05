package Programmers.Level_1;
import java.util.*;


public class Level_1_MinumumRec {
    public static void main(String args[]){
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        for(int i=0;i<sizes.length;i++){
            for(int j=0;j< 2;j++){
                if(sizes[i][0] > sizes[i][1]){
                    x.add(sizes[i][0]);
                    y.add(sizes[i][1]);
                }
                else{
                    x.add(sizes[i][1]);
                    y.add(sizes[i][0]);
                }
            }
        }
        int answer = Collections.max(x) * Collections.max(y);
        System.out.println(answer);
    }

}
