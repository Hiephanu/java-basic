package org.example.algo;

import java.util.Scanner;

public class Lucky {
    private static void lucky(int N, int K) {
        if (N == 1) {
            System.out.println(0);
        }
        int cycleLength = 2 * N - 2;
        K = K % cycleLength;
        System.out.println((K < N) ? K : 2 * N - 2 - K);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        lucky(N, K);
    }
}
