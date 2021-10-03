package Programmers;
import java.util.*;
public class Level_1_NumberAndString {
    public static void main(String args[]){
        String s = "23four5six7";
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0;i<arr.length;i++){
            if(s.contains(arr[i]))s = s.replace(arr[i],Integer.toString(i));
        }
    }
}
