package org.example.string_handler;

public class CompareBetweenString {
    public static void main(String[] args) {
        String s = "Đoàn Văn Hiệp";
        StringBuilder stringBuilder = new StringBuilder(s);
        StringBuffer stringBuffer = new StringBuffer(s);

        String sc =s.replace("V", "H");
        System.out.println(sc);

        //ko đồng bộ hóa trong môi trường da luồng
        stringBuilder.replace(2,4,"h");
        System.out.println(stringBuilder);

        //đồng bộ hóa trong môi trường đa luong
        stringBuffer.replace(2,4,"h");
        System.out.println(stringBuffer);
    }
}
