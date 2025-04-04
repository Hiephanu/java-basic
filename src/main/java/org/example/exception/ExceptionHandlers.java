package org.example.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlers {
    public static int divideFor0Divide() throws ArithmeticException,IOException {
        return  10/0;
    }

    public static void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
        System.out.println("hi");
    }

    public static void divideFor0() {
        try {
            int result =  10/0;
        } catch (ArithmeticException e) {
            System.out.println("Lỗi toán tử không hợp lệ "+ e.getMessage());
        }
    }
    public static void main(String[] args) {
    }
}
