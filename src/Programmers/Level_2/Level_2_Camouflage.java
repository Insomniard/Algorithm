package Programmers.Level_2;
import java.util.*;
public class Level_2_Camouflage {
    public static void main(String args[]){
        Map<String, Integer> map = new HashMap<>();
        int answer = 1;
        String[][] clothes = {{"yellowhat", "headgear"},{"bluesunglasses", "eyewear"},{"green_turban", "headgear"}};
        for(int i=0;i< clothes.length;i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) +1);
        }
        for(String key : map.keySet())answer *= map.get(key) + 1;
        answer--;

    }
}
