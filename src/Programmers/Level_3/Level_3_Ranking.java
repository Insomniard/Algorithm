package Programmers.Level_3;

import java.util.ArrayList;

public class Level_3_Ranking {
    private static int count = 0;

    public static void main(String[] args) {
        int[][] results = {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};
        int n = 5;
        System.out.println(solution(n, results));
    }

    private static int solution(int n, int[][] results) {
        int answer = 0;
        boolean[] visit = new boolean[n];
        ArrayList<ArrayList<Integer>> winner = new ArrayList<>();
        ArrayList<ArrayList<Integer>> looser = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            winner.add(new ArrayList<>());
            looser.add(new ArrayList<>());
        }
        for (int i = 0; i < results.length; i++) {
            winner.get(results[i][1] - 1).add(results[i][0] - 1);
            looser.get(results[i][0] - 1).add(results[i][1] - 1);
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            count = 0;
            visit = new boolean[n];
            dfs(i, winner, visit);
            sum = count;
            count = 0;
            visit = new boolean[n];
            dfs(i, looser, visit);
            sum += count;
            if (sum == n - 1) answer++;
        }
        return answer;
    }

    private static void dfs(int current, ArrayList<ArrayList<Integer>> list, boolean[] visit) {
        visit[current] = true;
        for (int i : list.get(current)) {
            if (!visit[i]) {
                count++;
                dfs(i, list, visit);
            }
        }
    }
}
