package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BeakJoon_No_5177 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String match = "[^\uAC00-\uD7A30-9a-zA-Z]";
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String first = br.readLine();
            String next = br.readLine();
            first = first.replaceAll(match, " ");
            next = next.replaceAll(match, " ");
            first = first.replaceAll("\\s+", " ");
            next = next.replaceAll("\\s+", " ");
            if(first.matches(".*[A-Z].*"))first=first.toLowerCase();
            if(next.matches(".*[A-Z].*"))next=next.toLowerCase();

            if(first.equals(next))System.out.println("Data Set "+(i+1) +": equal\n");
            else{
                System.out.println("Data Set "+ (i+1) +": not equal\n");
            }
        }
    }
}
