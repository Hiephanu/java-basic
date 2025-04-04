package org.example.algo.optimize_combination;
import java.util.Arrays;


//mỗi làn try đang cố tìm 1 phần trong kết quả
public class Traveling {
    // Kết quả tối ưu
    public static int min = Integer.MAX_VALUE;
    public static int dem = 0;
    public static int cmin = 10;

    public static void solve(int n, int[][] matrix, boolean[] visited, int currentCity, int count, int cost) {
        ++dem;
        if (count == n && matrix[currentCity][0] > 0) {
            min = Math.min(min, cost + matrix[currentCity][0]);
            return;
        }

        for (int nextCity = 0; nextCity < n; nextCity++) {
            if (!visited[nextCity] && matrix[currentCity][nextCity] > 0) {
                visited[nextCity] = true;
                if(cost + (n -1 + 1) * cmin < min ) {
                    solve(n, matrix, visited, nextCity, count + 1, cost + matrix[currentCity][nextCity]);
                }
                visited[nextCity] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[][] distanceMatrix = {
                {0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}
        };

        int n = distanceMatrix.length;
        boolean[] visited = new boolean[n];

        // Bắt đầu từ thành phố 0
        visited[0] = true;
        solve(n, distanceMatrix, visited, 0, 1, 0);

        // In kết quả
        System.out.println("Chi phí tối thiểu: " + min);
        System.out.println(dem);
    }
}
