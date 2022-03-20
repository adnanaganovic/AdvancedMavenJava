package ThreeAdvanced.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CustomStyleReadingFile {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\USER\\IdeaProjects\\AdvancedJava\\src\\main\\resources\\destination.txt";
        Path path = Paths.get(fileName);
        Files.copy(path, System.out);
    }
}
