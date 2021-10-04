package Programmers.Level_2;

import java.util.*;
public class Level_2_OneTwoFourWorld {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder();
        int n=11;
        int temp = 0;
        String answer = "";
        while(n>0){
            temp = n%3;
            n = n/3;
            if(temp == 0){
                temp = 4;
                n -= 1;
            }
            sb.insert(0, temp);
        }
        answer = sb.toString();
        System.out.println(answer);
    }

//    1 1       0001
//    2 2       0010
//    3 4       0011

//    4 11      0100
//    5 12      0101
//    6 14      0110

//    7 21      0111
//    8 22      1000
//    9 24      1001

//    10 41     1010
//    11 42
//    12 44

//    13 111
//    14 112
//    15 114
}
