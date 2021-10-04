package BaekJoon.Silver;
import java.util.*;
public class BeakJoon_No_1057 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int joinNum = scan.nextInt();
        int jiminNum = scan.nextInt();
        int hansooNum = scan.nextInt();
        int count = 0;
        while (true){
            if(jiminNum % 2 == 0)jiminNum /= 2;
            else jiminNum = (jiminNum + 1) / 2;
            if(hansooNum % 2 == 0)hansooNum /= 2;
            else hansooNum  = (hansooNum + 1) / 2;
            count++;
            if(hansooNum == jiminNum)break;
        }
        System.out.println(count);
    }
}
