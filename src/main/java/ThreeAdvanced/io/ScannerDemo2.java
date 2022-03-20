package ThreeAdvanced.io;

import javax.swing.*;
import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        System.out.println("Unesi neki text: ");

        try(Scanner scanner = new Scanner(System.in);){
           String inputIzKonzole = scanner.nextLine();
            JOptionPane.showMessageDialog(null, inputIzKonzole);
        }
    }
}
//Scanner je final klasa, a FINAL klase ne mogu naslijeđivati druge klase
