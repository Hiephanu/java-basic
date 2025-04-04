package org.example.algo.ss;

import java.util.Scanner;

public class MaxSumEventOfBound {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void solve(int[][] matrix, int h, int w, int m, int n) {
        int[][] prefixSum = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int currentValue = isEven(matrix[i][j]) ? matrix[i][j] : 0;
                prefixSum[i][j] = currentValue;
                if (i > 0) prefixSum[i][j] += prefixSum[i - 1][j];
                if (j > 0) prefixSum[i][j] += prefixSum[i][j - 1];
                if (i > 0 && j > 0) prefixSum[i][j] -= prefixSum[i - 1][j - 1];
            }
        }

        int maxSum = 0;

        for (int i = 0; i <= m - h; i++) {
            for (int j = 0; j <= n - w; j++) {
                int sum = prefixSum[i + h - 1][j + w - 1];
                if (i > 0) sum -= prefixSum[i - 1][j + w - 1];
                if (j > 0) sum -= prefixSum[i + h - 1][j - 1];
                if (i > 0 && j > 0) sum += prefixSum[i - 1][j - 1];
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=0; i< num;i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] matrix = new int[m][n];
            for(int j =0; j < m; j ++) {
                for(int k=0; k <n; k++) {
                    matrix[j][k] = sc.nextInt();
                }
                sc.nextLine();
            }
            solve(matrix, h, w, m,n);
        }
        sc.close();
    }
}
