package FiveAdvanced.nizZadatak;

import java.util.Arrays;

public class DemoNiz {
    public static void main(String[] args) {
        String text = "John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow";
        String[] splitedText = text.split(" ");

        PersonNiz[] personNiz = new PersonNiz[splitedText.length];

        for(int i=0; i<splitedText.length; i++){
            String splitPart = splitedText[i];
            String[] splitPartArray = splitPart.split("\\."); //Regex za tačku ".", je ispravno ovako  "\\."
            String name = splitPartArray[0];
            String splitPart2 = splitPartArray[1];
            String[] splitPartArray2 = splitPart2.split("/");
            String surname = splitPartArray2[0];
            String birthPlace = splitPartArray2[1];
//            System.out.println("Name: " + name + ", Surname: "+surname+", place: " +birthPlace);
            PersonNiz person = new PersonNiz(name, surname, birthPlace);
            personNiz[i] = person;
        }
        for (PersonNiz person : personNiz){
            System.out.println(person);
        }

    }
}
