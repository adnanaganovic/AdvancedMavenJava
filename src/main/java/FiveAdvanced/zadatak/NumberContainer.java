package FiveAdvanced.zadatak;

import java.util.Iterator;
import java.util.Random;
import java.util.Spliterator;
import java.util.function.Consumer;

public class NumberContainer implements Iterable<Integer> {
    private int capacity = 10;
    private Integer[] numbers = new Integer[capacity];

    public NumberContainer(){
        Random randomGen = new Random();
        for(int i=0; i<numbers.length; i++){
            int slučajanBroj = randomGen.nextInt(100);
            numbers[i] = slučajanBroj;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        NumberContainerIterator containerIterator = new NumberContainerIterator();
        return containerIterator;
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }

    private class NumberContainerIterator implements Iterator<Integer> {
        private int index = 0;
        @Override
        public boolean hasNext() {
            return index<=capacity-1;
        }

        @Override
        public Integer next() {
            Integer number = numbers[index];
            index++;
            return number;
        }
    }
}
