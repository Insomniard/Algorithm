package BaekJoon.Gold;

import java.util.*;

public class BeakJoon_No_13913 {
    static int path[] = new int[100001];
    private static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int subin = scan.nextInt();
        int brother = scan.nextInt();
        bfs(subin,brother);
        System.out.println(min);
        Stack<Integer> s = new Stack<>();
        int index = brother;

        while (index!=subin){
            s.push(index);
            index = path[index];
        }
        s.push(index);
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
    private static void bfs(int subin, int brother){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(subin,0));
        boolean[] visit = new boolean[100001];
        visit[subin] = true;
        while (!q.isEmpty()){
            Point current = q.poll();
            int currentPos = current.pos;
            int currentTime = current.time;
            if(currentPos == brother){
                min = Math.min(currentTime, min);
                return;
            }
            visit[currentPos] = true;
            int workingBack = currentPos-1;
            int workingFront = currentPos+1;
            int teleport = currentPos * 2;

            if(workingBack>=0 && !visit[workingBack] && path[workingBack] == 0){
                path[workingBack] = currentPos;
                q.add(new Point(workingBack,currentTime+1));
            }
            if(workingFront <= 100000 && !visit[workingFront] && path[workingFront] == 0){
                path[workingFront] = currentPos;
                q.add(new Point(workingFront, currentTime+1));
            }
            if(teleport <= 100000 && !visit[teleport] && path[teleport] == 0){
                path[teleport] = currentPos;
                q.add(new Point(teleport,currentTime+1));
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
