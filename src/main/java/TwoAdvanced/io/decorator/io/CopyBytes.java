package TwoAdvanced.io.decorator.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {

        try {
            FileInputStream inputStream = new FileInputStream("C:\\Users\\USER\\IdeaProjects\\AdvancedJava\\src\\main\\resources\\fail.txt");
            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\USER\\IdeaProjects\\AdvancedJava\\src\\main\\resources\\destination.txt");
            int byteChar;
            while ((byteChar = inputStream.read()) !=-1) {
                outputStream.write(byteChar);

            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
        }
    }
}