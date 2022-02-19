package BaekJoon.Gold;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BeakJoon_No_12851 {
    private static int subin, brother;
    private static boolean[] visit;
    private static int count = 0;
    private static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        subin = scan.nextInt();
        brother = scan.nextInt();
        visit = new boolean[100001];
        bfs();
        System.out.println(min + " " + count);
    }
    private static void bfs(){
        Queue<Point> q = new LinkedList<>();
        visit[subin] = true;
        q.add(new Point(subin,0));
        while (!q.isEmpty()){
            Point current = q.poll();
            int sb = current.pos;
            int nextTime = current.time;
            visit[sb] = true;
            if(sb == brother){
                min = Math.min(min,nextTime);
                if(min == nextTime){
                    count++;
                }
                continue;
            }

            if(current.pos-1>=0 && !visit[current.pos-1]){
                q.add(new Point(current.pos-1, nextTime+1));
            }
            if(current.pos+1<=100000 && !visit[current.pos+1]){
                q.add(new Point(current.pos+1, nextTime+1));
            }
            if(current.pos*2<=100000 && !visit[current.pos*2]){
                q.add(new Point(current.pos*2, nextTime+1));
            }
        }
    }
    private static class Point{
        int pos;
        int time;

        public Point(int pos, int time) {
            this.pos = pos;
            this.time = time;
        }
    }
}
