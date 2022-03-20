package Four.Advanced;

import java.util.ArrayList;
import java.util.List;

public class Zadatak2 {
    public static void main(String[] args) {
        //Izbaciti tri imena sa liste, Dino, Sead, Tarik, i ispisati u konzoli

        List<String> names = new ArrayList<>();
        names.add("Adnan");
        names.add("Amir");
        names.add("Tarik");
        names.add("Sead");
        names.add("Dino");
        names.add("Aria");
        names.add("Nida");
        names.add("Mirso");
        names.add("Redžo");
        names.add("Rahim");

        //2.NAČIN IZBACIVANJA SA LISTE
        names.stream()
                .filter(name->!name.equals("Dino"))  //međuoperacija
                .filter(name->!name.equals("Sead"))
                .filter(name->!name.equals("Tarik"))
                .forEach(System.out::println);

        //1.NAČIN IZBACIVANJA SA LISTE
//        for(String name: names){
//            if(!name.equals("Dino") & !name.equals("Tarik") & !name.equals("Sead")){
//                System.out.println(name);
//            }
//        }
    }
}
