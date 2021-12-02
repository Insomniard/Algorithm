import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BeakJoon_No_1091 {
    private static int N;
    private static int[] shuffle;
    private static int[] arr;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        arr = new int[N];
        shuffle = new int[N];
        int[] temp = new int[N];
        int[] copy = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            temp[i] = arr[i];
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            shuffle[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;

        while (true) {
            if (isSort()) break;
            count++;
            for (int i = 0; i < N; i++) {
                copy[i] = arr[i];
            }

            for (int i = 0; i < N; i++) {
                arr[shuffle[i]] = copy[i];
            }

            for (int i = 0; i < N; i++) {
                if (temp[i] != arr[i]) break;
                if (i == N - 1) {
                    System.out.println(-1);
                    return;
                }
            }

        }
        System.out.println(count);
    }

    private static boolean isSort() {
        for (int i = 0; i < N; i++) {
            if (arr[i] != i % 3) {
                return false;
            }
        }
        return true;
    }
}
