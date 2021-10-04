package BaekJoon.Bronze;
import java.util.*;
public class BeakJoon_No_2755 {
    public static void main(String args[]){
        double sum = 0.0;
        Scanner scan = new Scanner(System.in);
        String k = scan.nextLine();
        int K = Integer.parseInt(k);
        String[] score = new String[K*2];
        int index=0;
        for(int i=0;i<K;i++){
            String temp = scan.nextLine();
            String[] str = temp.split(" ");
            for(int j = str.length-1;j>= str.length-2;j--){
                score[index] = str[j];
                index++;
            }
        }
        double subject = 0;
        for(int i= score.length-1;i>=0;i-=2){
            if(score[i-1].equals("A+")){
                sum+=Double.parseDouble(score[i]) * 4.3;
                subject += Double.parseDouble(score[i]);
            }
            else if(score[i-1].equals("A0")){
                sum+=Double.parseDouble(score[i]) * 4.0;
                subject += Double.parseDouble(score[i]);
            }
            else if(score[i-1].equals("A-")){
                sum+=Double.parseDouble(score[i]) * 3.7;
                subject += Double.parseDouble(score[i]);
            }
            else if(score[i-1].equals("B+")){
                sum+=Double.parseDouble(score[i]) * 3.3;
                subject += Double.parseDouble(score[i]);
            }
            else if(score[i-1].equals("B0")){
                sum+=Double.parseDouble(score[i]) * 3.0;
                subject += Double.parseDouble(score[i]);
            }
            else if(score[i-1].equals("B-")){
                sum+=Double.parseDouble(score[i]) * 2.7;
                subject += Double.parseDouble(score[i]);
            }
            else if(score[i-1].equals("C+")){
                sum+=Double.parseDouble(score[i]) * 2.3;
                subject += Double.parseDouble(score[i]);
            }
            else if(score[i-1].equals("C0")){
                sum+=Double.parseDouble(score[i]) * 2.0;
                subject += Double.parseDouble(score[i]);
            }
            else if(score[i-1].equals("C-")){
                sum+=Double.parseDouble(score[i]) * 1.7;
                subject += Double.parseDouble(score[i]);
            }
            else if(score[i-1].equals("D+")){
                sum+=Double.parseDouble(score[i]) * 1.3;
                subject += Double.parseDouble(score[i]);
            }
            else if(score[i-1].equals("D0")){
                sum+=Double.parseDouble(score[i]) * 1.0;
                subject += Double.parseDouble(score[i]);
            }
            else if(score[i-1].equals("D-")){
                sum+=Double.parseDouble(score[i]) * 0.7;
                subject += Double.parseDouble(score[i]);
            }
            else subject += Double.parseDouble(score[i]);
        }
        System.out.print(String.format("%.2f",sum/subject));
    }

}
