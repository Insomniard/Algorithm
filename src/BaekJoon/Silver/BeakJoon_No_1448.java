package BaekJoon.Silver;

import java.io.*;
import java.util.*;
public class BeakJoon_No_1448 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr= new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int i=N-3;i>=0;i--){
            if(arr[i+2] < arr[i+1] + arr[i]){
                System.out.println(arr[i]+arr[i+1]+arr[i+2]);
                break;
            }
            else if(i==0)System.out.println(-1);
        }
    }
}
