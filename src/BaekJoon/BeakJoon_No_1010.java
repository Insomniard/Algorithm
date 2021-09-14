package BaekJoon;
import java.util.*;
public class BeakJoon_No_1010 {
    static long[][] visit= new long[31][31];
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        //M! / N! * (M-N)!
        for(int i=0;i<31;i++){
            visit[i][i] = 1;
            visit[i][1] = i;
        }
        for(int i=2;i<30;i++)
            for(int j=2;j<30;j++)
                visit[i][j] = visit[i-1][j-1] + visit[i-1][j];
        int T = scan.nextInt();
        for(int i=0;i<T;i++){
            int N = scan.nextInt();
            int M = scan.nextInt();
            System.out.println(visit[M][N]);
        }
    }
}
