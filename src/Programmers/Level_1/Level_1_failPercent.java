package Programmers.Level_1;
import java.util.*;
public class Level_1_failPercent {
    public static void main(String args[]) {
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int N = 5;
        double person = (double) stages.length;
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < stages.length; i++) {
            map.put(stages[i], map.getOrDefault(stages[i], 0) + 1);
        }
        for (int i = 1; i <= N; i++) {
            if (map.containsKey(i)) {
                list.add(((double) map.get(i)) / person);
                person -= map.get(i);
            } else list.add(0.0);
        }
        Map<Integer, Double> map2 = new LinkedHashMap<>(); //index / value
        for (int i = 0; i < list.size(); i++) {
            map2.put(i + 1, list.get(i));
        }

        int[] answer = new int[list.size()];
        int index = 0;

        for (int i = 0; i < N; i++) {
            double max = -1;
            int maxkey = 0;
            for (int key : map2.keySet()) {
                if (max < map2.get(key)) {
                    max = map2.get(key);
                    maxkey = key;
                }
            }
            answer[i] = maxkey;
            map2.remove(maxkey);
        }
    }
}
