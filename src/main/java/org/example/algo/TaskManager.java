package org.example.algo;

import java.util.*;

public class TaskManager {
    private static final int MAX_TASKS = 100005;
    private static int[] cost = new int[MAX_TASKS];
    private static List<List<Integer>> graph = new ArrayList<>();
    private static boolean[] visited = new boolean[MAX_TASKS];

    private static void dfs(int task, List<Integer> affectedTasks) {
        Stack<Integer> stack = new Stack<>();
        visited[task] = true;
        affectedTasks.add(task);
        stack.push(task);

        while (!stack.isEmpty()) {
            int currentStack = stack.pop();
            for (int next : graph.get(currentStack)) {
                if(!visited[next]) {
                    visited[next] = true;
                    affectedTasks.add(next);
                    stack.push(next);
                }
            }
        }
    }

    private static void updateCost1(int task, int value) {
        Arrays.fill(visited, false);
        List<Integer> affectedTasks = new ArrayList<>();
        dfs(task, affectedTasks);

        for (int affectedTask : affectedTasks) {
            cost[affectedTask] = value;
        }
    }

    private static void updateCost2(int task, int value) {
        Arrays.fill(visited, false);
        List<Integer> affectedTasks = new ArrayList<>();
        dfs(task, affectedTasks);

        for (int affectedTask : affectedTasks) {
            if (cost[affectedTask] > value) {
                cost[affectedTask] = value;
            }
        }
    }

    private static int queryCost(int task) {
        return cost[task];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
            cost[i] = 0;
        }

        for (int i = 0; i < M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            graph.get(A).add(B);
        }

        for (int i = 0; i < Q; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                int A = sc.nextInt();
                int V = sc.nextInt();
                updateCost1(A, V);
            } else if (type == 2) {
                int A = sc.nextInt();
                int V = sc.nextInt();
                updateCost2(A, V);
            } else if (type == 3) {
                int A = sc.nextInt();
                System.out.println(queryCost(A));
            }
        }
        sc.close();
    }
}
