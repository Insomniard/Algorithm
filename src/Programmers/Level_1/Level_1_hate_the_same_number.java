package Programmers.Level_1;
import java.util.*;
public class Level_1_hate_the_same_number {
    public static void main(String args[]){
        Level_1_hate_the_same_number solve = new Level_1_hate_the_same_number();
        int[] arr = {1,1,3,3,0,1,1};
        int[] answer = solve.solution(arr);
        for(int i=0;i<answer.length;i++)System.out.print(answer[i]);
    }

    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count=1,count2=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                count++;
            }
        }
        int[] answer = new int[count];
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                answer[count2]=arr[i];
                count2++;
            }
        }
        answer[count2]=arr[arr.length-1];
        return answer;
    }
}
