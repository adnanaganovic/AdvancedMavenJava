package Four.Advanced;

import java.util.*;
import java.util.stream.Collectors;

public class ZadatakVježba {
    public static void main(String[] args) {
        //Zadatak: poredati imena abecedno i ispisati
//       1.NAČIN RJEŠENJA
//        List<String> names = new ArrayList<>();
//        names.add("Adnan");
//        names.add("Nedim");
//        names.add("Tarik");
//        names.add("Sead");
//        names.add("Dino");
//        names.stream().sorted().forEach(System.out::println);

        //       2.NAČIN RJEŠENJA (Arrays je privatna inner klasa u klasi Array, pa ne podržava funkciju "remove" iz java.utility paketa,
//                                 Dok klasa Array je iz java.utility paketa, pa podržava "remove" jer je i on)
//        List<String> names = Arrays.asList("Nedim", "Adnan", "Dino", "Dunja", "Amar", "Aria", "Refik");
//        names.stream().sorted().forEach(System.out::println);

//        3.NAČIN RJEŠENJA - NE VALJA PROFI OVO RJEŠENEJ
//        List<String> names = new ArrayList<>();   //OVAJ NEŠTO NE VALJA NE POREDA ABECEDNO
//        names.add("Adnan");
//        names.add("Nedim");
//        names.add("Tarik");
//        names.add("Sead");
//        names.add("Dino");
//        TreeSet<String> setOfNames = new TreeSet<String>(names);
//        for(String name:names){
//            System.out.println(name);
//        }

//        4.NAČIN RJEŠENJA
        List<String> names = new ArrayList<>();
        names.add("Adnan");
        names.add("Nedim");
        names.add("Tarik");
        names.add("Sead");
        names.add("Dino");
        names.stream().collect(Collectors.toCollection(TreeSet::new)).forEach(System.out::println);

    }
}
