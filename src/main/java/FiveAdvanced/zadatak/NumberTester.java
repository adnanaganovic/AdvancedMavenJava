package FiveAdvanced.zadatak;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberTester {
    public static void main(String[] args) {

//        NumberContainer numberContainer = new NumberContainer();
//        for (Integer number: numberContainer){
//            System.out.println(number);
//        }

//        List<Integer> integerList = new ArrayList<>();
//        for (Integer number : integerList){
//            System.out.println(number);
//        }

        NumberContainer numberContainer = new NumberContainer();
        for (Integer number : numberContainer){
            System.out.print(number+" , ");
        }
        System.out.println();

    }
}
