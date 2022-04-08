package SevenAdvanced;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class NumberContainer<G extends Number> implements Iterable<G> {
    private int capacity = 0;
    private Number[] numbers = new Number[capacity];

    public boolean add(G number){
        if (capacity == numbers.length) {
            capacity++;
            numbers = Arrays.copyOf(numbers, capacity);
        }
        numbers[capacity-1] = number;
        return true;
    }

    public boolean remove(G number) {
        if (null == number) {
            for (int i = 0; i < capacity; i++) {
                if (numbers[i] == null) {
                    ukloni(i);
                    return true;
                }
            }

        } else {
            if (null == number) {
                for (int i = 0; i < capacity; i++) {
                    if (numbers[i] == number) {
                        ukloni(i);
                        return true;

                    }
                }}}
        return false;
    }
    private void ukloni(int i) {
        int brojPomjeranja = capacity - i - 1;
        if (brojPomjeranja > 0) {
            System.arraycopy(numbers, i + 1, numbers, i, brojPomjeranja);
        }
        capacity--;
        numbers[capacity] = null;
    }


                @Override
                public Iterator<G> iterator () {
                    NumberIterator numberIterator = new NumberIterator();
                    return numberIterator;
                }



                private class NumberIterator implements Iterator<G> {
                    private int nextIndex = 0;


                    @Override
                    public boolean hasNext() {
                        System.out.println("Pita Enhanced ima li još..?");
                        return (nextIndex < capacity);
                    }

                    @Override
                    public G next() {
                        System.out.println("Enhanced next uzima element");
                        Number number = numbers[nextIndex];
                        nextIndex++;
                        return (G) number;
                    }
                }
}
