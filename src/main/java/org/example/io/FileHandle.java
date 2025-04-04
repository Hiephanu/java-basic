package org.example.io;

import java.io.*;
import java.nio.channels.FileChannel;

public class FileHandle {
    public void readFileNIO() throws IOException {
        String inputFilePath = "C:\\videos\\input.mp4";
        String outputFilePath = "C:\\videos\\output.mp4";

        try (FileChannel sourceChannel = new FileInputStream(inputFilePath).getChannel();
             FileChannel destinationChannel = new FileOutputStream(outputFilePath).getChannel()) {

            destinationChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
            System.out.println("File copied successfully!");
        } catch (Exception e) {
            throw  new IOException(e);
        }
    }
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\workspace\\java\\java_basic\\src\\main\\java\\org\\example\\Main.java"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
