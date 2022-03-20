package ThreeAdvanced.io;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
//        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("C:\\Users\\USER\\IdeaProjects\\AdvancedJava\\src\\main\\resources\\izvorLinije.txt")))){
//            while (scanner.hasNext()){
//                String sadrzaj = scanner.next();
//                System.out.println(sadrzaj);
//            }
//        }catch (IOException e){
//            System.err.println(e.getMessage());
//        }

//        try(Scanner scanner = new Scanner(new File("C:\\Users\\USER\\IdeaProjects\\AdvancedJava\\src\\main\\resources\\destinacijaLinija.txt"))){
//            while (scanner.hasNext()){
//                String sadrzaj = scanner.nextLine();
//                System.out.println(sadrzaj);
//            }
//    } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        double suma = 0;
        try(Scanner scanner = new Scanner(new File("C:\\Users\\USER\\IdeaProjects\\AdvancedJava\\src\\main\\resources\\borjeviZaScanner.txt"))){
            scanner.useLocale(Locale.US); //US lokalizacija se odvaja zarezom, dok kod GERMAN tačkom
            while (scanner.hasNext()){
                if(scanner.hasNextDouble()){
                    double učitaniBroj = scanner.nextDouble();
                    suma = suma + učitaniBroj;
                }else {
                    scanner.next();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Suma=" + suma);
    }
}

