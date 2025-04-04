package org.example.algo;

import java.util.*;

public class Garden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] garden = new int[R][C];
        List<int[]> trees = new ArrayList<>();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                garden[i][j] = sc.nextInt();
                if (garden[i][j] == 1) {
                    trees.add(new int[]{i, j});
                }
            }
        }

        int minArea = findMinArea(trees);
        System.out.println(minArea);
    }

    private static int findMinArea(List<int[]> trees) {
        int n = trees.size();
        int minArea = Integer.MAX_VALUE;

        for (int mask1 = 1; mask1 < (1 << n); mask1++) {
            for (int mask2 = 1; mask2 < (1 << n); mask2++) {
                if ((mask1 & mask2) != 0) continue;

                List<int[]> group1 = new ArrayList<>();
                List<int[]> group2 = new ArrayList<>();
                List<int[]> group3 = new ArrayList<>();

                for (int i = 0; i < n; i++) {
                    if ((mask1 & (1 << i)) != 0) group1.add(trees.get(i));
                    else if ((mask2 & (1 << i)) != 0) group2.add(trees.get(i));
                    else group3.add(trees.get(i));
                }

                if (group1.isEmpty() || group2.isEmpty() || group3.isEmpty()) continue;

                int area1 = calcRectangleArea(group1);
                int area2 = calcRectangleArea(group2);
                int area3 = calcRectangleArea(group3);

                minArea = Math.min(minArea, area1 + area2 + area3);
            }
        }
        return minArea;
    }

    private static int calcRectangleArea(List<int[]> group) {
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;

        for (int[] tree : group) {
            minX = Math.min(minX, tree[0]);
            minY = Math.min(minY, tree[1]);
            maxX = Math.max(maxX, tree[0]);
            maxY = Math.max(maxY, tree[1]);
        }

        return (maxX - minX + 1) * (maxY - minY + 1);
    }
}
