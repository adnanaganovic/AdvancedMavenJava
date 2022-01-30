package FiveAdvanced.duplikatiZadaca;

import java.util.ArrayList;
import java.util.Arrays;

public class PeriodDuplicateVjezba {
    public static void main(String[] args) {
        //IZBACITI DUPLICATE

        long previousTimeStamp = System.currentTimeMillis();          //UZIMA SE STAMP PRIJE OPERARCIJE i POSLIJE

        String[] Niz = {"Adnan", "Aria", "Remiza", "Ademira", "Remiza", "Mubera", "Redžep", "Refik", "Mubera"};
        System.out.println("Prije izbacivanja duplikata: " + Arrays.asList(Niz));

        ArrayList<String> arrayNiz = new ArrayList<String>();

        for(int i=0; i < Niz.length; i++){
            if( !arrayNiz.contains(Niz[i]) ){
                arrayNiz.add(Niz[i]);
            }
        }

        Niz = arrayNiz.toArray( new String[arrayNiz.size()] );

        System.out.println("Array after removing duplicates: "
                + Arrays.toString(Niz));


        long currentTimeStamp = System.currentTimeMillis();              //RAČUNANJE VREMENA U ms POTREBNOG ZA OPERACIJU
        long period = currentTimeStamp - previousTimeStamp;              //PERIOD = TRENUTNO - PRETHODNO
        System.out.println("Period u ms = " + period);


    }

}
