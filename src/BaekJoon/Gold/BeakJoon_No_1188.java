package BaekJoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BeakJoon_No_1188 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int sausageeeeeeeee = Integer.parseInt(st.nextToken());
        int person = Integer.parseInt(st.nextToken());
        System.out.println(person - gcd(sausageeeeeeeee,person));
    }
    private static int gcd(int num1, int num2){
        if(num2 == 0)return num1;
        return gcd(num2, num1 % num2);
    }
}
