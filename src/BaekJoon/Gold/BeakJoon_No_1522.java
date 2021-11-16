package BaekJoon.Gold;

import java.util.*;
public class BeakJoon_No_1522 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] s = scan.nextLine().split("");
        int countA = 0;
        for(int i=0;i<s.length;i++){
            if(s[i].equals("a")){
                countA++;
            }
        }
        int answer = s.length;
        for(int i=0;i<s.length;i++){
            int count = 0;
            for(int j=i;j<countA+i;j++){
                if(s[j%s.length].equals("b")){
                    count++;
                }
            }
            answer = Math.min(answer,count);
        }

        System.out.println(answer);
    }
}
