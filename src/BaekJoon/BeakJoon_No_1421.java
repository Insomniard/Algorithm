package BaekJoon;
import java.util.*;
public class BeakJoon_No_1421 {
    public static void main(String args[]){
        int answer=0, answer2 = 0;
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int C = scan.nextInt();
        int L = scan.nextInt();
        ArrayList<Integer> tree = new ArrayList<>();
        for(int i=0;i<N;i++)tree.add(scan.nextInt());
        System.out.println(tree);
        for(int i=1;i<= tree.get(N-1);i++){
            answer2=0;
            int sum = 0, countTree = 0, temp = 0;
            for(int j=0;j<N;j++){
                countTree = tree.get(j) / i;
                temp = (tree.get(j) - 1) / i;
                sum = (i * countTree * L) - (C * temp);
                if(sum > 0)answer+=sum;
            }

            answer = Math.max(answer, answer2);
        }
        System.out.println(answer);

    }
}
