package org.example.algo.recursive_backtrack;

import org.example.finalPackage.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NQueen {
    public static void printBoard(List<int[]> result, int n) {
        char[][] board = new char[n][n];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }
        for (int[] position : result) {
            board[position[0]][position[1]] = 'Q'; // Đặt quân hậu 'Q'
        }

        // In tiêu đề cột
        System.out.print("  ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + " "); // Số cột
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(i + " "); // Số dòng
            for (char cell : board[i]) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void nQueen(int n, int row,boolean[] cols, boolean[] dia1, boolean[] dia2, List<int[]> result) {
        if(result.size() == n) {
            printBoard(result, n);
            return;
        }

        for(int i= 0; i < n; i++) {
            int d1 = row - i + n - 1;
            int d2 = row + i;
            if(!cols[i] && !dia1[d1] && !dia2[d2]) {
                cols[i] =true;
                dia1[d1] = true;
                dia2[d2] = true;
                result.add(new int[] {row , i});

                nQueen(n, row + 1, cols, dia1, dia2, result);

                cols[i] = false;
                dia1[d1] = false;
                dia2[d2] = false;
                result.remove(result.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int n = 8;
        boolean[] cols =  new boolean[n];
        boolean[] dia1 =  new boolean[2*n - 1];
        boolean[] dia2 =  new boolean[2*n - 1];
        nQueen(n, 0, cols, dia1, dia2, new ArrayList<>());
    }
}
