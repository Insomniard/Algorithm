package BaekJoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BeakJoon_No_18352 {
    static int[] visit;
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int Node = Integer.parseInt(st.nextToken());
        int trunk = Integer.parseInt(st.nextToken());
        int shortestPath = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        visit = new int[Node + 1];
        for (int i = 0; i <= Node; i++) list.add(new ArrayList<>());
        for (int i = 1; i <= trunk; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.get(x).add(y);
        }

        bfs(start);
        boolean check = false;
        for (int i = 1; i <= Node; i++) {
            if (visit[i] == shortestPath && i != start) {
                System.out.println(i);
                check = true;
            }
        }
        if (!check) System.out.println(-1);
    }

    private static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            int current = q.poll();
            for (int i = 0; i < list.get(current).size(); i++) {
                int pos = list.get(current).get(i);
                if (visit[pos] == 0) {
                    visit[pos] = visit[current] + 1;
                    q.add(pos);
                }
            }
        }

    }

}
