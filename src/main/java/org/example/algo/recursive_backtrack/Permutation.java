package org.example.algo.recursive_backtrack;

import java.util.Scanner;

public class Permutation {
    private static boolean[] check = new boolean[1000];
    public static void permutation(int k,String n, String result) {
        if(k == n.length()) {
            System.out.println(result);
            return;
        }
        for(int i =0 ; i< n.length() ;i++) {
            if(!check[n.charAt(i)]) {
                check[n.charAt(i)] = true;
                permutation(k+1, n, result + n.charAt(i));
                check[n.charAt(i)] = false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        permutation(0, n, "");
    }
}
