package Four.Advanced.Person;

import java.time.LocalDate;
import java.util.Locale;

public class PersonTester {
    public static void main(String[] args) {

        Person adnan = new Person();
        adnan.setName("Adnan");
        adnan.setSurname("Aganović");
        adnan.setBirthday(LocalDate.of(1988,11,24));
        adnan.setGender(Gender.MALE);

        System.out.println(adnan.getAge());


        Person adnan2 = new Person()    //DRUGI NAČIN KREIRANJA, ali ako napišemo kod ovako,
                .setName("Adnan")       //biće nam greška kod funkcija gettera i settera, jer vraćaju "void",
                .setSurname("Aganović")   //"void" je potrebno promjeniti u Person, da ne vraća prazninu
                .setBirthday(LocalDate.of(1988,11,24))
                .setGender(Gender.MALE);

        System.out.println(adnan2.getGender());


        String name = "amko";
        name.toLowerCase(Locale.ROOT).split("");

    }

    }
