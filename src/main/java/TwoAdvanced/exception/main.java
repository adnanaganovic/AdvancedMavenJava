package TwoAdvanced.exception;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hallo....");
        int number = 23;
        int result = number / 0; //JAVA EXCEPTION (failure events) ne može dijeliti sa nulom
//IMAMO 3 vrste grešaka
        //CATCHING EXCEPTION
        //Runtime exception II Checked exception (naslijeđuju klasu Exception)
        //RUNTIME exc. su loši događaji koji programeri trebaju spriječiti
        // npr. Person p; //NULL
        // p.getName(); // tzv. "NullPointerException"

        //npr. int[] numbers = new int[3];
        //numbers[3] = 23; // tzv. "ArrayIndexOutOfBoundsException"

        System.out.println("Unesi ime fajla:");
        String imeFajla = new Scanner(System.in).nextLine();
        //2.2.FileNotFound -> {    }   {    }
        readFile(imeFajla);

        //I blok koda kada je sve uredu
        Reader reader = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return 0;
            }

            @Override
            public void close() throws IOException {

            }
        };
    }

    private static void readFile(String imeFajla) {

    }
}
