package BaekJoon.Silver;

import java.util.Scanner;
public class BeakJoon_No_1334 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double middle;
        String first = "";
        String next = "";
        String input = scan.next();
        double temp = Double.parseDouble(input);
        while(true){

            String[] str = String.format("%.0f",temp).split("");
            if(str.length % 2 == 0){
                middle = str.length/2;
                for(int i=0;i<middle;i++){
                    first += str[i];
                }
                for(int i= str.length-1;i>=middle;i--){
                    next += str[i];
                }
            }
            else {
                middle = (str.length/2) + 1;
                for(int i=0;i<middle-1;i++){
                    first += str[i];
                }
                for(int i= str.length-1;i>=middle;i--){
                    next += str[i];
                }
            }
            if(first.equals(next)){
                System.out.println(String.format("%.0f",temp));
                break;
            }
            else {
                temp++;
                first = "";
                next = "";
            }
        }
    }

}
