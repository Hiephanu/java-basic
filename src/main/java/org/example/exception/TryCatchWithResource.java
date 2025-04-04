package org.example.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchWithResource {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("")) ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
