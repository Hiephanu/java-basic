package org.example.algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Stable {
    public static void solve(int[] devices, int k) {
        int[] maxCount = {0};
        backtrack(devices, new ArrayList<>(), 0, k, maxCount);
        System.out.println(maxCount[0]);
    }

    public static void backtrack(int[] devices, List<Integer> result, int idx, int k, int[] maxCount) {
        if (k < 0) {
            return;
        }
        maxCount[0] = Math.max(maxCount[0], result.size());
        for (int i = idx; i < devices.length; i++) {
            result.add(devices[i]);
            int newK = k;
            if (result.size() > 1 && !Objects.equals(result.get(result.size() - 1), result.get(result.size() - 2))) {
                newK--;
            }
            backtrack(devices, result, i + 1, newK, maxCount);
            result.remove(result.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int k = scanner.nextInt();
        int[] devices = new int[a];
        for (int i = 0; i < a; i++) {
            devices[i] = scanner.nextInt();
        }
        solve(devices, k);
    }
}
