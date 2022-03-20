package ThreeAdvanced;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class CopyBytes {
    public static void main(String[] args) {
        //TRY WITH RESOURCE (od Java 1.7)
        try (FileInputStream in = new FileInputStream("C:\\Users\\USER\\IdeaProjects\\AdvancedJava\\src\\main\\resources\\izvor.txt");
             FileOutputStream out = new FileOutputStream("C:\\Users\\USER\\IdeaProjects\\AdvancedJava\\src\\main\\resources\\izvorDestination.txt");) {
            int bytePodatka;
            while ((bytePodatka = in.read()) != -1) {
                out.write(bytePodatka);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
//Čitanje i prepisivanje texta byte po byte je primitivan nivo i treba izbjegavati

        }
    }
}
