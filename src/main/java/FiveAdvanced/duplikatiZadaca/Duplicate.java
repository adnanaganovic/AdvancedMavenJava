package FiveAdvanced.duplikatiZadaca;

import java.util.*;

public class Duplicate {
    private static Object HashSet;

    public static void main(String[] args) {
        //IZBACITI DUPLICATE
        long previousTimeStamp = System.currentTimeMillis();
        String[] Niz = {"Adnan", "Aria", "Remiza", "Ademira", "Remiza", "Mubera", "Redžep", "Refik", "Mubera"};
        System.out.println("Prije izbacivanja duplikata: " + Arrays.asList(Niz));

        //1. način, transformisati u HashSet
//        Niz = new HashSet<String>(Arrays.asList(Niz)).toArray(new String[0]);
//        System.out.println("Poslije izbacivanja: " + Arrays.asList(Niz));


        //2. način transformacija u LinkedHashSet
//        LinkedHashSet<String> lhsNiz =
//                new LinkedHashSet<String>(Arrays.asList(Niz));
//        String[] newArray = lhsNiz.toArray(new String [ lhsNiz.size() ]);
//        System.out.println("Poslije izbacivanja duplikata: " + Arrays.toString(newArray));


        //3. način preko ArrayListe
//        ArrayList<String> arrayNiz = new ArrayList<String>();
//        /*
//         * Loop through array, add element to
//         * ArrayList only if was not added previously
//         */
//        for(int i=0; i < Niz.length; i++){
//            if( !arrayNiz.contains(Niz[i]) ){
//                arrayNiz.add(Niz[i]);
//            }
//        }
//        System.out.println(Arrays.toString(Niz));
////convert ArrayList back to array
//        Niz = arrayNiz.toArray( new String[arrayNiz.size()] );
//
//        System.out.println("Array after removing duplicates: "
//                + Arrays.toString(Niz));
//    }


        //4.Način preko STREAM funkcija
        Niz = Arrays.stream(Niz).distinct().toArray(String[]::new);

        System.out.println("Array after removing duplicates: "
                + Arrays.toString(Niz));
    }}


