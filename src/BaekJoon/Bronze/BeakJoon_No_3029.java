package BaekJoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeakJoon_No_3029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] start = br.readLine().split(":");
        String[] end = br.readLine().split(":");
        String answer = "";
        int hour = Integer.parseInt(end[0]) - Integer.parseInt(start[0]);
        if (hour < 0) {
            hour += 24;
        }
        int minute = Integer.parseInt(end[1]) - Integer.parseInt(start[1]);
        if (minute < 0) {
            minute += 60;
            hour--;
        }
        int sec = Integer.parseInt(end[2]) - Integer.parseInt(start[2]);
        if (sec < 0) {
            sec += 60;
            minute--;
        }
        if (hour < 10) {
            answer += "0" + hour + ":";
        }
        else{
            answer += hour + ":";
        }
        if(minute < 10){
            answer += "0" + minute + ':';
        }
        else{
            answer += hour + ":";
        }
        if(sec<10){
            answer += "0" + sec;
        }
        else{
            answer += sec;
        }

        System.out.println(answer);
    }
}
