package Programmers.Level_3;

import java.util.Arrays;

public class Level_3_changeMoney {
    public static void main(String[] args) {
        int[] money = {1, 2, 5};
        int n = 5;
        int[] dp = new int[n + 1];
        Arrays.sort(money);
        for (int i = 0; i <= n; i++) {
            if (i % money[0] == 0) dp[i] = 1;
        }

        for (int i = 0; i < money.length; i++) {
            for(int j=money[i]; j<=n;j++){
                dp[j] += dp[j-money[i]];
            }
        }
        System.out.println(dp[n]);
    }
}
