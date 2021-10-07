package BaekJoon.Bronze;

import java.util.*;
public class BeakJoon_No_1193 {
    public static void main(String args[]){
        int vertical = 1;
        int horizon = 1;
        int count = 0;
        int plver = 2;
        int plho = 0;
        int inputnum = 9;
        boolean check = false; // true : ver > ho , fal : ver < ho
        while(true){
            if(count == 0){
                vertical+=2;
                horizon++;
            }
            else if(count%2 ==0){
                plver+=4;
                vertical = vertical + plver;
                horizon++;
            }
            else if(count%2 == 1){
                plho+=4;
                vertical++;
                horizon = horizon + plho;
            }
            if(vertical > horizon){
                if(inputnum >= horizon && inputnum <= vertical)break;
            }
            else if(vertical<horizon){
                if(inputnum >= vertical && inputnum <= horizon){
                    check = true;
                    break;
                }
            }
            count++;
        }
        int val = 0;
        if(check)val = horizon; // ver < ho
        else val = vertical;
        if(inputnum == 1)System.out.println(1);
        else{
            double boonmo = count+2;
            double boonja = 1;
            double answer = boonja / boonmo;
            if(inputnum == val){
                System.out.println(answer);
                return;
            }
            System.out.println(boonmo + " " +boonja + " " + val);
                for(int i=0;i<val-inputnum;i++){
                boonja++;
                boonmo--;
                answer = boonja / boonmo;
                System.out.println(answer);
            }
        }
    }
}
