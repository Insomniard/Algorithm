package BaekJoon.Silver;

import java.util.*;
public class BeakJoon_No_1064 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> distance = new ArrayList<>();
        ArrayList<Integer> point = new ArrayList<>();
        for(int i=0;i<3;i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            point.add(x);
            point.add(y);
        }
        if(Math.abs((point.get(1) - point.get(3)) * (point.get(2) - point.get(4))) == Math.abs((point.get(3) - point.get(5)) * (point.get(0) - point.get(2))))System.out.println("-1");
        else{
            distance.add(getDistance(point.get(0), point.get(2), point.get(1), point.get(3)));
            distance.add(getDistance(point.get(0), point.get(4), point.get(1), point.get(5)));
            distance.add(getDistance(point.get(2), point.get(4), point.get(3), point.get(5)));
            System.out.println(2*Collections.max(distance) - 2*Collections.min(distance));
        }

    }
    static double getDistance(int a, int b, int c,int d){
        return Math.sqrt(Math.pow(a-b,2) + Math.pow(c-d,2));
    }
}
