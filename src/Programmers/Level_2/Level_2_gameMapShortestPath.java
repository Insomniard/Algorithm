package Programmers.Level_2;

import java.util.LinkedList;
import java.util.Queue;

public class Level_2_gameMapShortestPath {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visit;
    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}	};
        Level_2_gameMapShortestPath getAnswer = new Level_2_gameMapShortestPath();
        System.out.println(getAnswer.solution(maps));

    }

    public int solution(int[][] maps) {
        int answer = 0;
        visit = new boolean[maps.length][maps[0].length];
        answer = bfs(0, 0, maps);
        return answer;
    }

    private static int bfs(int x, int y, int[][] maps) {
        visit[x][y] = true;
        int answer =1000000;
        Queue<pos> q = new LinkedList<>();
        q.add(new pos(x, y,1));
        int count = 0;
        while (!q.isEmpty()) {
            pos current = q.poll();
            for (int i = 0; i < 4; i++) {
                int sx = current.x + dx[i];
                int sy = current.y + dy[i];
                if (sx >= 0 && sy >= 0 && sx < maps.length && sy < maps[0].length) {
                    if(maps[sx][sy] == 1 && !visit[sx][sy]){
                        visit[sx][sy] =true;
                        q.add(new pos(sx,sy, current.distance + 1));
                    }
                }
            }

            System.out.println(answer);
            if(current.x == maps.length-1 && current.y == maps[0].length -1)return current.distance;
        }
        return -1;
    }

    static class pos {
        int x;
        int y;
        int distance;
        public pos(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
}
