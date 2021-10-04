package BaekJoon.Silver;

import java.util.*;
public class BeakJoon_No_1312 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int N = scan.nextInt();
        a %= b;
        for(int i=0;i<N-1;i++){
            a *= 10;
            a %= b;
        }
        System.out.println((a * 10) / b);
    }
}
