package Programmers.Level_2;
import java.util.*;
public class Level_2_checkKeepDistance {

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static boolean[][] visit;
    static String[][] map;
//    static Queue<Point> q = new LinkedList<>();
    static ArrayList<Point> list = new ArrayList<>();
    public static void main(String args[]) {
        String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
        int[] answer = new int[places.length];
        map = new String[places.length][places.length];
        visit = new boolean[places.length][places.length];
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places.length; j++) {
                for (int k = 0; k < places[i].length; k++) {
                    map[j] = places[i][j].split("");
                    if(map[j][k].equals("P")){
                        list.add(new Point(j,k,0));
                    }
                }
            }
            answer[i] = bfs();
            list.clear();
        }
        for(int i=0;i< answer.length;i++)System.out.print(answer[i] + " ");
    }
    public static int bfs(){
        int check = 1;
        for(Point p : list){
            Queue<Point> q = new LinkedList<>();
            visit = new boolean[map.length][map.length];
            q.add(new Point(p.x,p.y,p.distance));
            visit[p.x][p.y] = true;
            while (!q.isEmpty()){
                Point current = q.poll();
                if(current.distance>2)continue;
                for(int i=0;i<4;i++){
                    int sx = current.x + dx[i];
                    int sy = current.y + dy[i];
                    if(sx>=0 && sy>=0 && sx<5 && sy<5){
                        if(!visit[sx][sy] && !map[sx][sy].equals("X")){
                            if(current.distance + 1<=2 && map[sx][sy].equals("P")){
                                check = 0;
                                return check;
                            }
                            visit[sx][sy] = true;
                            q.add(new Point(sx,sy,current.distance+1));
                        }
                    }
                }
            }
        }

        return check;
    }
    static class Point{
        int x;
        int y;
        int distance;

        public Point(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
}

