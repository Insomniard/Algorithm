package Programmers.Level_1;

import java.util.*;
public class Level_1_secretMap {
    public static void main(String args[]){
        int n = 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        String[][] map = new String[n][n];
        String[][] map2 = new String[n][n];
        String[][] answermap = new String[n][n];
        for(int i=0;i<arr1.length;i++){
            map[i] = makeMap(arr1[i],n);
            map2[i] = makeMap(arr2[i],n);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(map[i][j].equals("1") || map2[i][j].equals("1")){
                    answermap[i][j] = "#";
                }
                else answermap[i][j] = " ";
            }
        }
        String[] answer = new String[n];
        for(int i=0;i<n;i++){
            String input = "";
            for(int j=0;j<n;j++){
                input+=answermap[i][j];
            }
            answer[i] = input;
        }
        for(int i=0;i< answer.length;i++)System.out.println(answer[i]);
    }
    public static String[] makeMap(int num, int n){
        String binary = Integer.toBinaryString(num);
        while (binary.length()<n){
            binary = "0" + binary;
        }
        String[] arr = binary.split("");
        System.out.println(binary);
        return arr;
    }

}
