package org.example.algo;

import java.util.*;

public class Vote {
    public static void solve(int n, int m, List<int[]> list) {
        int[] votes = new int[n + 1];
        Arrays.fill(votes, 0);

        Map<Integer, Integer> voteCount = new HashMap<>();

        for (int[] arr : list) {
            int ui = arr[0];
            int vi = arr[1];

            if (votes[ui] != 0) {
                int previousVote = votes[ui];
                voteCount.put(previousVote, voteCount.getOrDefault(previousVote, 0) - 1);
                if (voteCount.get(previousVote) == 0) {
                    voteCount.remove(previousVote);
                }
            }

            votes[ui] = vi;

            voteCount.put(vi, voteCount.getOrDefault(vi, 0) + 1);

            System.out.println(voteCount.size());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đọc N và M
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int[] arr = new int[2];
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            list.add(arr);
        }

        solve(n, m, list);
    }
}