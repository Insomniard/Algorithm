package SWEA;

import java.util.Scanner;

public class SWEA_No_9658 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for(int test_case=1;test_case<=T;test_case++){

            String answer = "";
            String num = sc.nextLine();
            int numOfDigits = num.length() - 1;
            System.out.println(num + " " + numOfDigits);
            if(num.substring(0,2).equals("99") && num.charAt(2) - '0' >= 5){
                answer+="1.0";
                numOfDigits++;
            }else {
                if(num.charAt(2) - '0' >= 5){
                    int frontNum = Integer.parseInt(num.substring(0,2)) + 1;
                    answer += (frontNum/10) + "." + frontNum%10;
                }
                else{
                    answer += num.charAt(0) + "." + num.charAt(1);
                }
            }

            answer += "*10^" + numOfDigits;
            System.out.println("#" + test_case +" "+ answer);
        }
    }
}
