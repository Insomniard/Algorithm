package BaekJoon.Silver;

import java.util.Scanner;

public class BeakJoon_No_1052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int bottle = scan.nextInt();
        int answer = 0;
        while (true){
            String binary = Integer.toBinaryString(N);
            int count = 0;
            for(int i=0;i<binary.length();i++)if(binary.charAt(i) == '1')count++;
            if(count <= bottle){
                System.out.println(answer);
                break;
            }
            N++;
            answer++;
        }
    }
}
