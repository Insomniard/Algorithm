package BaekJoon;
import java.util.*;
public class BeakJoon_No_2456 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int[][] arr = new int[K][3];
        boolean ischeck = false;
        int max1 = 0, max2 = 0, max3 = 0;
        int amax1 = 0, amax2 = 0, amax3 = 0;
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scan.nextInt();
            }
            max1 += Math.pow(arr[i][0], 2);
            max2 += Math.pow(arr[i][1], 2);
            max3 += Math.pow(arr[i][2], 2);
        }
        int answer = Math.max(max1, Math.max(max2, max3));
        int check = 0;
        if (answer == max1) check = 1;
        if (answer == max2) check = 2;
        if (answer == max3) check = 3;
        if (max1 < max2) {
            ischeck = false;
        }
        else if (max1 == max2)ischeck = true;
        if (max2 < max3) {
            ischeck = false;
        }
        else if (max2 == max3)ischeck = true;
        for (int i = 0; i < K; i++) {
            amax1 += arr[i][0];
            amax2 += arr[i][1];
            amax3 += arr[i][2];
        }
        answer = Math.max(amax1, Math.max(amax2, amax3));
        if (ischeck == false) {
         System.out.println(check + " " + answer);
        }
        else   System.out.println("0 " + answer);
    }
}
