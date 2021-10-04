package BaekJoon.Bronze;
import java.util.*;
public class BaekJoon_No_1384 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String k = "";
        int K = 0;
        int count = 0;
        while(true){
            count++;
            boolean check = false;
            k = scan.nextLine();
            K = Integer.parseInt(k);
            if(K == 0)break;
            String list[][] = new String[K][K];
            for(int i=0;i<K;i++) {
                String arr[] = scan.nextLine().split(" ");
                list[i] = arr;
            }
            System.out.println("Group "+count);
            int index = 0;
            for(int i=0;i< K;i++){
                for(int j=0;j<K;j++){
                    if(list[i][j].equals("N")){
                        index = i - j;
                        if(index < 0) index += K;
                        check = true;
                        System.out.println(list[index][0] + " was nasty about " + list[i][0]);

                    }
                }
            }
            if(check == false)System.out.println("Nobody was nasty");
            System.out.println();
        }
        }
}
