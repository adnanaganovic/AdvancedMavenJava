package ThreeAdvanced.io;

import java.io.*;

public class copyLines {
    public static void main(String[] args) {
        //BufferReader -> FileReader   ->    r = new BufferReader (new FileReader ());
        //MilkDecorator       ->   Esspreso    ->   b = new MiklDecorator(new Esspreso())

    try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\USER\\IdeaProjects\\AdvancedJava\\src\\main\\resources\\izvorLinije.txt"));
         PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\USER\\IdeaProjects\\AdvancedJava\\src\\main\\resources\\destinacijaLinija.txt"))){
        String linija;
        while ((linija = reader.readLine()) !=null ) {
            writer.println(linija);
        }
    }catch (IOException e){
        System.err.println(e.getMessage());
    }
    }
}
