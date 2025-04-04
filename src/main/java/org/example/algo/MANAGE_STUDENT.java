package org.example.algo;

import java.util.*;

public class MANAGE_STUDENT {
    private static  String add = "add";
    private static  String find = "find";
    public static void manageStudent(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for(String s : list) {
            String[] parts = s.split(" ");
            if(parts[0].equals(add)) {
                for(int i=0; i <= parts[1].length();i++) {
                    map.put(parts[1].substring(0,i), map.getOrDefault(parts[1].substring(0,i),0) + 1);
                }
            }
            if(s.startsWith(find)) {
                System.out.println(map.getOrDefault(parts[1],0));
            }
        }
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i= 0; i <= n;i++) {
            String line = scanner.nextLine();
            list.add(line);
        }
        scanner.close();
        manageStudent(list);
    }
}
