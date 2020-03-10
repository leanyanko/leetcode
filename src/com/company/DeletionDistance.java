package com.company;

import java.util.Arrays;

public class DeletionDistance {
    public static int minDistance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            dp[0][i] = dp[0][i - 1] + s2.charAt(i - 1);
//            System.out.print(0+s2.charAt(i - 1) + " ");
        }
//        System.out.println(Arrays.toString(dp[0]));
        System.out.println();
        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
//            System.out.println(Arrays.toString(dp[i]));
//            System.out.print(0+s1.charAt(i - 1) + " ");
        }
        System.out.println();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else {
                    int delete_i = dp[i - 1][j] + s1.charAt(i - 1);
                    int delete_j = dp[i][j - 1] + s2.charAt(j - 1);
                    dp[i][j] = Math.min(delete_i, delete_j);
//                    System.out.print(delete_i + " " + delete_j + ", ");
                }
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        System.out.println(minDistance("delete", "leet"));
    }
}
