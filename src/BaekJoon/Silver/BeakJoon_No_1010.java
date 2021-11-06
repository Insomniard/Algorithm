package BaekJoon.Silver;

import java.util.Scanner;

public class BeakJoon_No_1010 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        //M! / N! * (M-N)!
        int T = scan.nextInt();
        for(int i=0;i<T;i++){
            double N = scan.nextDouble();
            double M = scan.nextDouble();
            System.out.printf("%.0f\n", comb(M,N));
        }
    }

    private static double comb(double n, double m){
        double N = 1;
        double M = 1;
        for (double i=n;i>n-m;i--){
            N *= i;
        }
        for(double j= m;j>0;j--){
            M *= j;
        }
        return N/M;
    }
}
