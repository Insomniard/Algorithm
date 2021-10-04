package BaekJoon.Silver;

import java.util.*;
public class BeakJoon_No_1541 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        String minParsearr[] = input.split("\\-");
        int answer = Integer.parseInt(minParsearr[0]);
        for(int i=1;i<minParsearr.length;i++){
            String plParsearr[] = minParsearr[i].split("\\+");
            int count = plParsearr.length;

            for(String plus : plParsearr){
                answer -= Integer.parseInt(plus);
            }
        }
        System.out.println(answer);
    }
}
