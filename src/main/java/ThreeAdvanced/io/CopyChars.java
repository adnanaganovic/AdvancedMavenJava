package ThreeAdvanced.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyChars {
    public static void main(String[] args) {
        //File readee, FileWriter
        try(FileReader reader = new FileReader("C:\\Users\\USER\\IdeaProjects\\AdvancedJava\\src\\main\\resources\\izvorKaraktera.txt");
            FileWriter writer = new FileWriter("C:\\Users\\USER\\IdeaProjects\\AdvancedJava\\src\\main\\resources\\destinacijaKaraktera.txt")) {
            int karakteriPročitani;
            while ((karakteriPročitani = reader.read()) !=-1){
                writer.write(karakteriPročitani);
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }

    }
}
