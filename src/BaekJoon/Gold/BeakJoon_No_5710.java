package BaekJoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BeakJoon_No_5710 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == b && a == 0) break;
            int totalWatt = getTotalWatt(a);
            int left = 0;
            int right = totalWatt / 2;
            while (left <= right) {
                int mid = (left + right) / 2;
                int sangPrice = getTotalPrice(mid);
                int neiborPrice = getTotalPrice(totalWatt - mid);
                int minPrice = Math.abs(sangPrice - neiborPrice);
                if (minPrice < b) {
                    right = mid - 1;
                } else if (minPrice > b) {
                    left = mid + 1;
                } else {
                    System.out.println(getTotalPrice(mid));
                    break;
                }
//                System.out.println(mid + " " + left + " " + right);
            }
        }

    }

    private static int getTotalWatt(int price) {
        if (price <= 200) {
            return price / 2;
        } else if (price <= 29900) {
            return ((price - 200) / 3) + 100;
        } else if (price <= 4979900) {
            return ((price - 29900) / 5) + 10000;
        } else {
            return ((price - 4979900) / 7) + 1000000;
        }


    }

    private static int getTotalPrice(int watt) {
        if (watt <= 100) {
            return watt * 2;
        } else if (watt <= 10000) {
            return 200 + (watt - 100) * 3;
        } else if (watt <= 100000) {
            return 200 + 29700 + (watt - 10000) * 5;
        } else {
            return 200 + 29700 + 4950000 + (watt - 1000000) * 7;
        }
    }
}


