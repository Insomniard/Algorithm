package BaekJoon;
import java.util.*;
public class BaekJoon_No_2798 {


    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int cardSet, maxNum;
        cardSet = scan.nextInt();
        int[] card = new int[cardSet];
        maxNum = scan.nextInt();
        for(int i=0;i<cardSet;i++){
            card[i] = scan.nextInt();
        }
        BaekJoon_No_2798 run = new BaekJoon_No_2798();
        int num = run.Sum(0,card,0,maxNum,0);
        System.out.println(num);
    }

    static int Sum(int sum, int[] card, int count, int max, int index){


        if (sum > max) return 0;
        else if (count == 3) return sum;
        else if (index >= card.length) return 0;
        else {
            int answer = 0;
            int answer1 = Sum(sum + card[index], card, count + 1, max, index+1);
            int answer2 = Sum(sum, card, count, max, index+1);
            if (answer1 > answer2)answer = answer1;
            else answer = answer2;
            return answer;
        }
    }
}
