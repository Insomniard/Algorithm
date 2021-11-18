package BaekJoon.Gold;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BeakJoon_No_13549 {
    private static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int subin = scan.nextInt();
        int brother = scan.nextInt();
        bfs(subin,brother);
        System.out.println(min);
    }
    private static void bfs(int subin, int brother){
        boolean[] visit = new boolean[100001];
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(subin, 0));
        while (!q.isEmpty()){
            Point current = q.poll();
            int currentTime = current.time;
            int currentPos = current.pos;
            visit[currentPos] = true;

            if(currentPos == brother){
                min = Math.min(currentTime,min);
            }

            int workingBack = currentPos-1;
            int workingFront = currentPos+1;
            int teleport = currentPos * 2;

            if(workingBack>=0 && !visit[workingBack]){
                q.add(new Point(workingBack,currentTime+1));
            }
            if(workingFront <= 100000 && !visit[workingFront]){
                q.add(new Point(workingFront, currentTime+1));
            }
            if(teleport <= 100000 && !visit[teleport]){
                q.add(new Point(teleport,currentTime));
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
