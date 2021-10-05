package Programmers.Level_1;

import java.util.*;

public class Level_1_didNotCompletePlayer {
    public static void main(String args[]){
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer= "";
        boolean check = true;
        for(int i=0;i< completion.length;i++){
            if(participant[i].equals(completion[i]))continue;
            else{
                answer = participant[i];
                check = false;
                break;
            }
        }
        if(check)answer = participant[participant.length-1];
        System.out.println(answer);
    }
}
