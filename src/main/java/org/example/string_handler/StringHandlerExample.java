package org.example.string_handler;

public class StringHandlerExample {
    //Đảo ngược chuỗi
    public static void reverseString(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println(stringBuilder.reverse());
    }
    //count number
    public static void countString(String s) {
        int count =s.length();
        System.out.println(count);
    }
    //xóa khoảng trắng
    public static void deleteSpace(String s) {
        String s1 = s.replaceAll("\\s", "");
        System.out.println(s1);
    }
    //replace
    public static void replace(String s,String target, String replace) {
        String s1 = s.replace(target, replace);
        System.out.println(s1);
    }
    //count word
    public static void countWord(String s) {
        String[] ss = s.split("\\s+");
        System.out.println(ss.length);
    }
    public static void main(String[] args) {
        String s = "Hello how are you ?";
        s=s+ "hi";
        reverseString(s);
        countString(s);
        deleteSpace(s);
        replace(s, "how", "what");
        countWord("Doan       Van  Hiep");
    }
}
