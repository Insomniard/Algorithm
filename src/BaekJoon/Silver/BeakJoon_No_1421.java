package BaekJoon.Silver;
import java.util.*;
public class BeakJoon_No_1421 {
    public static void main(String args[]){
        long answer=0, answer2 = 0;
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long C = scan.nextLong();
        long L = scan.nextLong();
        ArrayList<Long> tree = new ArrayList<>();
        for(long i=0;i<N;i++)tree.add(scan.nextLong());
        for(long i=1;i<=10000;i++){
            answer2=0;
            long sum = 0, countTree = 0, temp = 0;
            for(int j=0;j<N;j++){
                countTree = tree.get(j) / i;
                temp = (tree.get(j) - 1) / i;
                sum = (i * countTree * L) - (C * temp);
                if(sum > 0)answer2+=sum;
            }

            answer = Math.max(answer, answer2);
        }
        System.out.println(answer);
    }
}
