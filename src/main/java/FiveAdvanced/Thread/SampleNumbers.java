package FiveAdvanced.Thread;

import java.util.Arrays;
import java.util.List;

public class SampleNumbers {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 234, 66, 33, 24, 35, 246, 444, 86, 90);
        //Zadatak: sumirati dvostruke vrijednosti parnih brojeva u nizu
//Prvi način, tradicionalni
//        int result = 0;
//        for (Integer number : numbers){
//            if(result%2==0){
//                result=result+number*2;}
//            }
//        System.out.printf(result+"");

        //Drugi način = Collection pipeline pattern - Martin Flower

//        int sum = numbers.stream()
//                .filter(number -> number %2==0)
//                .map(number -> number*2)
//                .reduce(0, (n1, n2) -> n1+n2);
//
//
//        System.out.printf(sum+" ");

        //Treći način preko maptoInt
        int sum = numbers.stream()
                .filter(number -> number %2==0)
                .mapToInt(it -> it*2)
                .sum();


        System.out.printf(sum+" ");
        }

    }

