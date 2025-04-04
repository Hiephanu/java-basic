package org.example.algo.recursive_backtrack;

import java.util.Scanner;

public class BinaryString {
    public static void BinaryStringWithNLength(int k, int n, String s) {
        if (k == n) {
            System.out.println(s);
            return;
        }
        for (int i = 0; i <= 1; i++) {
            BinaryStringWithNLength(k + 1, n, s + i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài n của chuỗi nhị phân: ");
        int n = scanner.nextInt();

        // In ra số lượng chuỗi nhị phân
        System.out.println("Số lượng chuỗi nhị phân có thể: " + (int) Math.pow(2, n));

        // In ra tất cả các chuỗi nhị phân
        BinaryStringWithNLength(0, n, "");
        scanner.close();
    }
}
