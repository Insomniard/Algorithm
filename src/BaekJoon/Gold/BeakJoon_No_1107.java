package BaekJoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BeakJoon_No_1107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int channel = Integer.parseInt(br.readLine());
        int partition = Integer.parseInt(br.readLine());
        boolean[] visit = new boolean[10];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<partition;i++){
            visit[Integer.parseInt(st.nextToken())] = true;
        }
        int answer = Math.abs(channel - 100);
        for (int i=0;i<=999999;i++){
            String[] s = Integer.toString(i).split("");
            boolean flag = false;
            for(int j=0;j<s.length;j++){
                if(visit[Integer.parseInt(s[j])]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                answer = Math.min(Math.abs(channel - i) + s.length,answer);
            }

        }
        System.out.println(answer);
    }

}

