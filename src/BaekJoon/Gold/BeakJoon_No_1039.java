package BaekJoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BeakJoon_No_1039 {
    static boolean[][] visit;
    static String s;
    static int N, M;
    static int answer = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        s = st.nextToken();
        N = Integer.parseInt(s);
        M = Integer.parseInt(st.nextToken());

        visit = new boolean[1000001][11];
        bfs();

    }

    private static void bfs() {
        Queue<Point> q = new LinkedList<>();
        visit[N][0] = true;
        q.add(new Point(N, 0));
        while (!q.isEmpty()) {
            Point current = q.poll();
            if (current.y == M) {
                answer = Math.max(current.x, answer);
                continue;
            }

            for (int i = 0; i < s.length() - 1; i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    char[] swapNum = swap(current.x, i, j);
                    int num = Integer.parseInt(String.valueOf(swapNum));
                    if (swapNum[0] == '0' || visit[num][current.y + 1])
                        continue;
                    visit[num][current.y + 1] = true;
                    q.add(new Point(num, current.y + 1));
                }
            }
        }
        System.out.println(answer);
    }

    private static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static char[] swap(int num, int i, int j) {
        String s = Integer.toString(num);
        char ch[] = s.toCharArray();
        char tempo = ch[i];
        ch[i] = ch[j];
        ch[j] = tempo;
        return ch;
    }
}
