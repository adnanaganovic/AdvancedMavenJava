package SevenAdvanced;

import java.util.stream.StreamSupport;

public class ContainerDemo {
    public static void main(String[] args) {
        short shortNumber = 0;
        Short number1 = 9;
        String numberText ="9";
        short parsedNumber = Short.parseShort(numberText);

        NumberContainer<Integer> numberContainer = new NumberContainer<>();
        numberContainer.add(23);
        numberContainer.add(123);
        numberContainer.add(223);
        numberContainer.add(323);
        numberContainer.remove(223);
        for (Integer number: numberContainer){

//            System.out.println(number);
    }
        NumberContainer<Double> doubleNumberContainer = new NumberContainer<>();
        doubleNumberContainer.add(23.0);
        doubleNumberContainer.add(123.34);
        StreamSupport.stream(doubleNumberContainer.spliterator(), false).forEach(System.out::println);
}}
