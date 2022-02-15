package BaekJoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BeakJoon_No_1759 {
    private static Set<String> set = new LinkedHashSet<>();
    public static char[] arr;
    private static boolean[] visit;
    private static int L, C;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        ArrayList<String> list = new ArrayList<>();
        arr = new char[C];
        visit = new boolean[C];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < C; i++) {
            arr[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(arr);
        combination(0, 0);

        for (String s : set) {
            System.out.println(s);
        }
    }

    private static void combination(int current, int depth) {
        String answer = "";

        for (int i = 0; i < C; i++) {
            if (visit[i]) {
                answer += arr[i];
            }
        }

        if (isWord(answer)) {
            set.add(answer);
        }

        for (int i = current; i < C; i++) {
            visit[i] = true;
            combination(i + 1, depth + 1);
            visit[i] = false;
        }
    }

    private static boolean isWord(String s) {
        if (s.length() != L) return false;
        String[] str = s.split("");
        String collection = "aeiou";
        int collectionCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < str.length; i++) {
            if (collection.contains(str[i])) {
                collectionCount++;
            } else {
                consonantCount++;
            }
        }

        if (collectionCount >= 1 && consonantCount >= 2) {
            return true;
        }
        return false;
    }
}
