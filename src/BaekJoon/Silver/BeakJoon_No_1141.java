package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class BeakJoon_No_1141 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            list.add(br.readLine());
        }
        Collections.sort(list, (o1, o2) -> o2.length() - o1.length());
        HashSet<String> set = new HashSet<>();
        boolean isstr = false;
        set.add(list.get(0));
        for(int i=0;i<list.size();i++){
            isstr = true;
            for(String str : set){
                if(str.indexOf(list.get(i))==0){
                    isstr = false;
                    break;
                }
            }
            if(isstr){
                set.add(list.get(i));
            }
        }
        System.out.println(set.size());

    }
}
