package Programmers.Level_2;
import java.util.*;
public class Level_2_MaxNum {
    public static void main(String args[]) {
        int[] numbers = {3, 30, 34, 5, 9};
        ArrayList<String> list = new ArrayList<>();
        String answer = "";
        for (int i = 0; i < numbers.length; i++) list.add(Integer.toString(numbers[i]));
        list.sort((o1, o2) -> (o2+o1).compareTo(o1+o2));
        if (list.get(0).equals("0")) answer += "0";
        else {
            for (int j = 0; j < numbers.length; j++)
                answer += list.get(j);
        }
    }


}
