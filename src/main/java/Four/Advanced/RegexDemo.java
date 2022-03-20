package Four.Advanced;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {   //regularni izrazi budu pitanje na intervju za posao
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            while (true){                                  //Kada se doda while(true) petlja postaje beskonačna petlja po teacheru, tj. kada završi jedan upit za regex,
            System.out.println("Unesi regex: ");           // odmah nakon toga ide slijedeći upit za regex, i tako beskonačno dok ne izadjemo iz programa...
            String regex = scanner.nextLine();      //npr. Ado (traži sve Ado) ili 2.primjer "[bcr]at"= broji sve "at" ali kome prethodi jedno od 3 slova [bcr]
            Pattern pattern = Pattern.compile(regex);

            System.out.println("Unesi text koji želiš staviti na test regularnog izraza: ");
            String text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);
            boolean found = false;
            while (matcher.find()){
                System.out.printf("Pronašao sam tekst '%s'" + "na poziciji startnoj na indeksu '%d'" + "koja završava na end position '%d'%n", matcher.group(), matcher.start(), matcher.end());
            }
            if (!found){
                System.out.format("Nema ničega u tekstu što odgovara napisanom regularnom izrazu %n");
            }
        }

    }
}}
