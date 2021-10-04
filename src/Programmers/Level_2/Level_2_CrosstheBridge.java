package Programmers.Level_2;
import java.util.*;
public class Level_2_CrosstheBridge {
    public static void main(String args[]){
        int bridge_length = 2;
        int weight = 10;
        int time = 0;
        int[] truck_weights = {7,4,5,6};
        int currentbridge = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<truck_weights.length;i++){
            while (true){
                if(q.isEmpty()){
                    q.add(truck_weights[i]);
                    currentbridge  += truck_weights[i];
                    time++;
                    break;
                }
                else if(q.size() == bridge_length)currentbridge -= q.poll();
                else{
                    if(currentbridge + truck_weights[i] > weight){
                        q.offer(0);
                        time++;
                    }
                    else{
                        q.offer(truck_weights[i]);
                        currentbridge += truck_weights[i];
                        time++;
                        break;
                    }
                }
            }
        }
        System.out.println(time+bridge_length);
    }
}
