package FiveAdvanced.bubblesort;

import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] numbers = {88, 8, 1, 12, 99, 157, 333, 33, 41,4};
        System.out.println("Prije sortirnja: " + Arrays.toString(numbers));

        for (int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]>numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }

        }
        System.out.println("Poslije sortiranja:" + Arrays.toString(numbers));
    }
}

